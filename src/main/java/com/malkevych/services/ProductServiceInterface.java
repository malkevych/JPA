package com.malkevych.services;

import com.malkevych.entities.Product;

/**
 * Created by Malkevych on 15.03.2015.
 */
public interface ProductServiceInterface {
    public Product addProduct(Product product);
    public Product getProduct(int id);
}
