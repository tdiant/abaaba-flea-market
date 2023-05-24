package best.nyan.abaaba.abaababackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private boolean available;
    private boolean operator;

    private String username;

    @JsonIgnore
    private String password;

    private String realName;
    private Integer grade;
    private String department;
    private String phoneNumber;
    private String address;

}
