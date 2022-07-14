/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andhikamvc.entity;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Andhika
 */
@Data // used for regenerated getter, setter, tostring, approciatequals, hashcode, and constructor with the final fields 
@NoArgsConstructor // used for regenerated constructor without param/args
@AllArgsConstructor // used for regenerated constructor with all fields in object
@Builder // used for regenerated builder pattern
@ToString // used for regenerated toString method 

public class Food {

    private List<FoodData> dataFood;
    private long id;
    private String foodName;
    private String foodPrice;
    private String foodStock;

}
