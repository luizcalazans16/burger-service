package br.com.dimed.hamburgueria.model;

import lombok.Data;

@Data
public class Ingredient {

    private Integer quantity;

    private Double unitPrice;

    public Ingredient(Integer quantity, Double unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public Double calculateIngredientPrice() {
        Double ingredientPrice = 0.0;
        ingredientPrice += this.quantity * this.unitPrice;
        return ingredientPrice;
    }
}
