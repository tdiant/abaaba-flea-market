package best.nyan.abaaba.abaababackend.controller;

import best.nyan.abaaba.abaababackend.entity.Order;
import best.nyan.abaaba.abaababackend.entity.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    public ResponseResult<List<Order>> getUserOrders() {
        //todo finish this api design
    }

    public ResponseResult<Void> cancelOrder() {
        //todo finish this api design
    }

    public ResponseResult<Void> pushForwardOrder() {
        //todo finish this api design
    }

}
