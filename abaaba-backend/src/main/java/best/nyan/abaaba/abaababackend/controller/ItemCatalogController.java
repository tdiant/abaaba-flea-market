package best.nyan.abaaba.abaababackend.controller;

import best.nyan.abaaba.abaababackend.entity.ResponseResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item-catalog")
public class ItemCatalogController {

    public ResponseResult<ShopItemTypeCatalogVO> getTypeCatalog() {
        //todo finish this api design
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ShopItemTypeCatalogVO {
        private int id;
        //todo impl this vo entity
    }

}
