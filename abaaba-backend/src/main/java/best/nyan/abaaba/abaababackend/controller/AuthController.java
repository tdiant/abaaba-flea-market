package best.nyan.abaaba.abaababackend.controller;

import best.nyan.abaaba.abaababackend.entity.ResponseResult;
import best.nyan.abaaba.abaababackend.service.LoginService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private LoginService loginService;

    public ResponseResult<String> login(@RequestBody LoginDTO data) {
        try {
            return ResponseResult.success(
                    "Login successfully",
                    loginService.login(data.getUsername(), data.getPassword())
            );
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseResult.failed();
        }
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class LoginDTO {
        private String username;
        private String password;
    }

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

}
