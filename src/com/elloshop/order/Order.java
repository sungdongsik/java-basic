package com.elloshop.order;

import com.elloshop.product.Product;
import com.elloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
