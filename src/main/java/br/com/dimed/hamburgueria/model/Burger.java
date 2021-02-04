package br.com.dimed.hamburgueria.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

@Data
@Slf4j
public class Burger {

    private String name;
    private final Map<String, Ingredient> ingredients = new HashMap<>();
    private Double burgerPrice = 0.0;

    public void addIngredient(String description, Ingredient ingredient) {
        ingredients.put(description, ingredient);
    }

    public Double calculateBurgerPrice() {
        Double burgerPrice = 0.0;

        for (Map.Entry<String, Ingredient> ingredient :
                this.ingredients.entrySet()) {
            burgerPrice += ingredient.getValue().getUnitPrice() * ingredient.getValue().getQuantity();
        }
        this.burgerPrice = burgerPrice;
        return burgerPrice;
    }

    public void showFinalDescription(String burgerName, Double burgerPrice) {
        System.out.println("O preço do hambúrguer " + burgerName + " é: R$ " + burgerPrice);
    }

    public void calculateIngredientPercentage(String description) {
        log.info("Calculando o valor equivalente ao ingrediente [{}]", description);
        Double ingredientPercentage = 0.0;
        DecimalFormat numberFormatter = new DecimalFormat("0.00");
        Ingredient ingredient = this.ingredients.get(description);
        ingredientPercentage = (ingredient.calculateIngredientPrice() /this.burgerPrice) * 100;
        System.out.println(description + " equivale a : " + numberFormatter.format(ingredientPercentage) + "% do hambúrguer");
    }

}