package com.elloshop.order;

import com.elloshop.product.Product;
import com.elloshop.user.User;

public class OderService {

    public void order(){
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
