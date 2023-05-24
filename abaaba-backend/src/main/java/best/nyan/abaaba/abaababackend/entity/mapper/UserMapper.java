package best.nyan.abaaba.abaababackend.entity.mapper;

import best.nyan.abaaba.abaababackend.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> getAllUser();

    User getUserById(@Param("id") Long id);

    User getUserByUsername(@Param("username") String username);

}
