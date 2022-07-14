/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andhikamvc.controller;

import com.andhikamvc.entity.Food;
import com.andhikamvc.entity.FoodData;
import com.andhikamvc.sql.FoodSQL;
import com.andhikamvc.sql.FoodSQLImplem;
import com.andhikamvc.view.FoodViews;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andhika
 */
public class ControllerFood {

//    the problem is always 
    private final FoodViews view;
    private Food food;
    private final FoodSQL sql = new FoodSQLImplem();
    List<FoodData> data = new ArrayList<>();

    public ControllerFood(FoodViews view) {
        this.view = view;
    }

    public void saveData() {
        data.add(FoodData.builder()
                .foodName(view.getFoodName().getText())
                .foodPrice(view.getFoodPrice().getText())
                .foodStock(view.getFoodStock().getText())
                .build()
        );

        food = Food.builder()
                .foodName(view.getFoodName().getText())
                .foodPrice(view.getFoodPrice().getText())
                .foodStock(view.getFoodStock().getText())
                .dataFood(data)
                .build();

        sql.CreateFood(food);
        view.getModel().addRow(new Object[]{food.getFoodName(), food.getFoodPrice(), food.getFoodStock()});
    }

    public void deleteData(int row) {
        System.out.println(row);
        try {
            if (row > -1) {
                view.getModel().removeRow(row);
                data.remove(row);
            } else {
                System.out.println("not succ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void EditData(int row) {
        data.set(row, FoodData.builder()
                .foodName(view.getFoodName().getText())
                .foodStock(view.getFoodStock().getText())
                .foodPrice(view.getFoodPrice().getText())
                .build()
        );
        view.getModel().setValueAt(view.getFoodName().getText(), row, 0);
        view.getModel().setValueAt(view.getFoodStock().getText(), row, 1);
        view.getModel().setValueAt(view.getFoodPrice().getText(), row, 2);
    }
}
