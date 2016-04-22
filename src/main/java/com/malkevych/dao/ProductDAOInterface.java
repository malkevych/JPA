package com.malkevych.dao;

import com.malkevych.entities.Product;
import org.springframework.stereotype.Repository;

/**
 * Created by Malkevych on 15.03.2015.
 */
@Repository
public interface ProductDAOInterface {
    Product addProduct(Product product);

    Product getProduct(int id);

    void saveProduct(Product lecture);

}
