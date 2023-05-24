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
    private boolean op;

    private String username;

    @JsonIgnore
    private String password;

}
