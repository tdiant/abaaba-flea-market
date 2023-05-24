package best.nyan.abaaba.abaababackend.filter;


import best.nyan.abaaba.abaababackend.entity.AuthenticatedUser;
import best.nyan.abaaba.abaababackend.service.TokenService;
import best.nyan.abaaba.abaababackend.util.ServletUtils;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAuthTokenFilter extends OncePerRequestFilter {

    private TokenService tokenService;

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain chain)
            throws ServletException, IOException {
        AuthenticatedUser authenticatedUser = tokenService.getAuthenticatedUserByToken(request);
        if (authenticatedUser != null && ServletUtils.getContextAuthentication() == null) {
            tokenService.verifyToken(authenticatedUser);
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(authenticatedUser, null, authenticatedUser.getAuthorities());
            authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        }
        chain.doFilter(request, response);
    }

    @Autowired
    public void setTokenService(TokenService tokenService) {
        this.tokenService = tokenService;
    }

}
