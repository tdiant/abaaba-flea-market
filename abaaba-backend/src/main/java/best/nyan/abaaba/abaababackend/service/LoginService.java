package best.nyan.abaaba.abaababackend.service;

import best.nyan.abaaba.abaababackend.entity.User;
import lombok.NonNull;

public interface LoginService {

    String login(@NonNull String username, @NonNull String password);

    boolean changePassword(@NonNull User user, @NonNull String oldPassword, @NonNull String newPassword);

}
