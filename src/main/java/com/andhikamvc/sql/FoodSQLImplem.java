/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andhikamvc.sql;

import com.andhikamvc.entity.Food;

/**
 *
 * @author Andhika
 */
public class FoodSQLImplem implements FoodSQL {

    @Override
    public Food CreateFood(Food obj) {
        obj.setId(1);
        return obj;
    }

    @Override
    public void DeleteFood() {

    }
}
