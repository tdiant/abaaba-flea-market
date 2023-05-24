package best.nyan.abaaba.abaababackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopItem {

    private Long id;

    private boolean available;
    private boolean waitingForAuditing;

    private Long typeId;
    private Long userId;

    private String title;
    private String description;

    private Integer remainCount;

}
