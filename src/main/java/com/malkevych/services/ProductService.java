package com.malkevych.services;

import com.malkevych.dao.ProductDAOInterface;
import com.malkevych.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Malkevych on 15.03.2015.
 */

public class ProductService implements ProductServiceInterface{
    @Autowired
    ProductDAOInterface productDAO;

    public Product addProduct(Product product){
        product = productDAO.addProduct(product);
        System.out.println(product);
        return product;
    }

    public Product getProduct(int id) {
        return productDAO.getProduct(id);
    }

}
