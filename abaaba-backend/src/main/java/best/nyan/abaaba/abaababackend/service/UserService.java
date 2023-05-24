package best.nyan.abaaba.abaababackend.service;

import best.nyan.abaaba.abaababackend.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    List<UserRole> getAllUserRoles();

    User getUserById(int id);

    UserRole getUserRoleById(int id);

    User getUserByUsername(String username);

    boolean banUser(User user);

    boolean unbanUser(User user);

    User changePhone(User user, String phone);

    User changeUserRole(User user, int roleId);

    User updateUserPermission(User user, SysPermission permission);

    UserRole updateUserRolePermission(UserRole role, SysPermission permission);

    UserRole createUserRole(String name);

    boolean removeUserRole(int roleId);

    List<User> searchUserByName(String name);

    List<User> searchUserByRoleId(int roleId);

    boolean createUser(User user);

    void forceChangePassword(User user, String newPassword);

    void updateLastLoginTime(User user);

    List<User> searchUser(String name, int roleId, String phone);
    
}
