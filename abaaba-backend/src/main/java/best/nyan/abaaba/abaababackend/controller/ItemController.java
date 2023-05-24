package best.nyan.abaaba.abaababackend.controller;

import best.nyan.abaaba.abaababackend.entity.ResponseResult;
import best.nyan.abaaba.abaababackend.entity.ShopItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    public ResponseResult<ShopItem> getItem() {
        //todo finish this api design
    }

    public ResponseResult<ShopItem> commentItem() {
        //todo finish this api design
    }

    public ResponseResult<ShopItem> createItem() {
        //todo finish this api design
    }

    public ResponseResult<Void> updateItemDetails() {
        //todo finish this api design
    }

    public ResponseResult<Void> changeItemRemainCount() {
        //todo finish this api design
    }

}
