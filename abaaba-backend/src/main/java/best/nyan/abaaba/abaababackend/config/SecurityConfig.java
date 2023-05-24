package best.nyan.abaaba.abaababackend.config;

import best.nyan.abaaba.abaababackend.entity.AuthenticatedUser;
import best.nyan.abaaba.abaababackend.entity.ResponseResult;
import best.nyan.abaaba.abaababackend.filter.JwtAuthTokenFilter;
import best.nyan.abaaba.abaababackend.service.TokenService;
import best.nyan.abaaba.abaababackend.util.ServletUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * Spring Security配置
 */
@Configuration
public class SecurityConfig {


    private TokenService tokenService;

    private JwtAuthTokenFilter jwtAuthTokenFilter;

    private AuthenticationConfiguration authenticationConfiguration;

    private final AuthenticationEntryPoint unauthorizedEntryPoint =
            (request, response, e) -> ServletUtils.renderDirectly(
                    response,
                    ResponseResult.authFailed("Authorized failed")
            );
    private final AccessDeniedHandler accessDeniedHandler = (request, response, accessDeniedException) ->
            ServletUtils.renderDirectly(
                    response,
                    ResponseResult.permissionDenied()
            );

    private final LogoutSuccessHandler logoutSuccessHandler =
            (request, response, authentication) -> {
                AuthenticatedUser authenticatedUser = tokenService.getAuthenticatedUserByToken(request);
                if (authenticatedUser != null) {
                    tokenService.removeLoginUser(authenticatedUser.getToken());
                }
                ServletUtils.renderDirectly(
                        response,
                        ResponseResult.success("Logout successfully")
                );
            };

    @Bean
    protected SecurityFilterChain configureChain(HttpSecurity http) throws Exception {
        CorsFilter corsFilter = corsFilter();

        http.csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .exceptionHandling().authenticationEntryPoint(unauthorizedEntryPoint).and()
                .exceptionHandling().accessDeniedHandler(accessDeniedHandler).and()
                .authorizeRequests()
                .antMatchers(
                        "/login",
                        "/register"
                ).permitAll()
                .antMatchers(
                        "/**/*.jpg",
                        "/**/*.jpeg",
                        "/**/*.gif",
                        "/**/*.png",
                        "/**/*.txt"
                ).permitAll()
                .antMatchers("/dev-api/**", "/swagger-ui.html", "/doc.html", "/webjars/**", "/swagger-resources/**", "/*/api-docs", "/druid/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .headers().frameOptions().disable().and()
                .logout().logoutUrl("/logout").logoutSuccessHandler(logoutSuccessHandler).and()
                .addFilterBefore(jwtAuthTokenFilter, UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(corsFilter, JwtAuthTokenFilter.class)
                .addFilterBefore(corsFilter, LogoutFilter.class);

        return http.build();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public void setAuthenticationConfiguration(AuthenticationConfiguration authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
    }

    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOriginPattern("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        config.setMaxAge(1800L);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }

    @Autowired
    public void setJwtAuthTokenFilter(JwtAuthTokenFilter jwtAuthTokenFilter) {
        this.jwtAuthTokenFilter = jwtAuthTokenFilter;
    }

    @Autowired
    public void setTokenService(TokenService tokenService) {
        this.tokenService = tokenService;
    }


}
