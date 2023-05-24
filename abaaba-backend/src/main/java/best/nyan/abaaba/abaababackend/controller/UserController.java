package best.nyan.abaaba.abaababackend.controller;

import best.nyan.abaaba.abaababackend.entity.ResponseResult;
import best.nyan.abaaba.abaababackend.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    public ResponseResult<User> getUserDetails() {
        //todo finish this api design
    }

    public ResponseResult<Void> updateUserProfile() {
        //todo finish this api design
    }

    public ResponseResult<User> getOtherUserDetails() {
        //todo finish this api design
    }

}
