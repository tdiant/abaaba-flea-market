package best.nyan.abaaba.abaababackend.service;

import best.nyan.abaaba.abaababackend.entity.User;

public interface PasswordService {

    void validate(User user);

    void clearUserFlags(String username);

}
