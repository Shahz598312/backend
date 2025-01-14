package com.zosh.request;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Ingredient {

    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    private String ingredientName;
}
