package best.nyan.abaaba.abaababackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopItemType {

    private int id;
    private String name;

    private int catalogId;

}
