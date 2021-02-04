package br.com.dimed.hamburgueria;

import br.com.dimed.hamburgueria.model.Burger;
import br.com.dimed.hamburgueria.model.Ingredient;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BurgerServiceApplication {

    public static void main(String[] args) {

        Burger burger1 = new Burger();
        burger1.setName("AC/DC");
        burger1.addIngredient("Pão", new Ingredient(2, 1.35));
        burger1.addIngredient("Queijo Cheddar", new Ingredient(2, 1.5));
        burger1.addIngredient("Alface", new Ingredient(2, 0.47));
        burger1.addIngredient("Hambúrguer 180g", new Ingredient(1, 8.45));
        burger1.addIngredient("Maionese", new Ingredient(1, 0.90));
        burger1.addIngredient("Tomate", new Ingredient(2, 0.75));
        burger1.calculateBurgerPrice();
        burger1.showFinalDescription(burger1.getName(), burger1.getBurgerPrice());
        burger1.calculateIngredientPercentage("Pão");
        burger1.calculateIngredientPercentage("Maionese");

        System.out.println("========================================================");

        Burger burger2 = new Burger();
        burger2.setName("Metallica");
        burger2.addIngredient("Pão", new Ingredient(3, 1.35));
        burger2.addIngredient("Queijo Cheddar", new Ingredient(4, 1.5));
        burger2.addIngredient("Alface", new Ingredient(2, 0.47));
        burger2.addIngredient("Hambúrguer 180g", new Ingredient(2, 8.45));
        burger2.addIngredient("Molho Caseiro", new Ingredient(1, 1.5));
        burger2.addIngredient("Bacon", new Ingredient(4, 1.75));
        burger2.addIngredient("Queijo Cheddar", new Ingredient(4, 1.5));
        burger2.calculateBurgerPrice();
        burger2.showFinalDescription(burger2.getName(), burger2.getBurgerPrice());
        burger2.calculateIngredientPercentage("Hambúrguer 180g");
        burger2.calculateIngredientPercentage("Bacon");

    }

}
