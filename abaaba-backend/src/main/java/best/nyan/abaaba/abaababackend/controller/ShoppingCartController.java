package best.nyan.abaaba.abaababackend.controller;

import best.nyan.abaaba.abaababackend.entity.ResponseResult;
import best.nyan.abaaba.abaababackend.entity.ShopItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

    public ResponseResult<List<ShopItem>> getCartItems() {
        //todo finish this api design
    }

    public ResponseResult<Void> addItemToCart() {
        //todo finish this api design
    }

    public ResponseResult<Void> removeItemFromCart() {
        //todo finish this api design
    }

}
