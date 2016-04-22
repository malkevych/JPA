package com.malkevych.services;

import com.malkevych.dao.CategoryDAOInterface;
import com.malkevych.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Malkevych on 15.03.2015.
 */
public class CategoryService implements CategoryServiceInterface{

    @Autowired
    CategoryDAOInterface categoryDAO;

    public Category addCategory(Category category){
        categoryDAO.addCategory(category);
        return category;
    }
}
