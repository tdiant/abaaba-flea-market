package best.nyan.abaaba.abaababackend.service.impl;

import best.nyan.abaaba.abaababackend.entity.AuthenticatedUser;
import best.nyan.abaaba.abaababackend.entity.ResponseResult;
import best.nyan.abaaba.abaababackend.entity.User;
import best.nyan.abaaba.abaababackend.exception.ServiceException;
import best.nyan.abaaba.abaababackend.service.PasswordService;
import best.nyan.abaaba.abaababackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserService userService;
    private PasswordService passwordService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByUsername(username);
        if (user == null) {
            log.info("User cannot be found when login: " + username);
            throw new ServiceException(
                    ResponseResult.authFailed(
                            "Cannot found user: " + username
                    ));
        }
        if (!user.getAvailable()) {
            log.info("User is not available when login: " + username);
            throw new ServiceException(
                    ResponseResult.authFailed(
                            "User is not available: " + username
                    ));
        }

        passwordService.validate(user);

        user.setLastLoginTime(System.currentTimeMillis());
        userService.updateLastLoginTime(user);

        return new AuthenticatedUser(user.getId(), user);
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setPasswordService(PasswordService passwordService) {
        this.passwordService = passwordService;
    }
}
