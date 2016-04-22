package com.malkevych.dao;

import com.malkevych.entities.Category;
import org.springframework.stereotype.Repository;

/**
 * Created by Malkevych on 15.03.2015.
 */
@Repository
public interface CategoryDAOInterface {
    public Category addCategory(Category category);
}
