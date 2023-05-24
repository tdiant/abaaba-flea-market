package best.nyan.abaaba.abaababackend.service;

import best.nyan.abaaba.abaababackend.entity.AuthenticatedUser;
import best.nyan.abaaba.abaababackend.entity.User;

import javax.servlet.http.HttpServletRequest;

public interface TokenService {

    AuthenticatedUser getAuthenticatedUserByToken(HttpServletRequest request);

    void removeLoginUser(String token);

    void forceRemoveUserLoginState(User user);

    void verifyToken(AuthenticatedUser loginUser);

    String createToken(AuthenticatedUser loginUser);

}
