package best.nyan.abaaba.abaababackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopItemImage {

    private Long id;

    private Long itemId;
    private String resourceFileName;

}
