package com.andhikamvc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Andhika
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class FoodData {
    private long id;
    private String foodName;
    private String foodPrice;
    private String foodStock;
    
}
