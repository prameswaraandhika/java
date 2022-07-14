package com.andhikamvc.sql;

import com.andhikamvc.entity.Food;

/**
 *
 * @author Andhika
 */
public interface FoodSQL {
    public Food CreateFood(Food obj);
    public void DeleteFood();
}
