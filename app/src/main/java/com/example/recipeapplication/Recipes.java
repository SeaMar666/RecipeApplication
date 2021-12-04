package com.example.recipeapplication;

public class Recipes {

    private String recipeName;
    private String ingredients;
    private String recipeMethodTitle;
    private String recipe;
    private String des;
    private int image;

    public Recipes(String recipeName, String ingredients, String recipeMethodTitle, String recipe, int image,String des) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.recipeMethodTitle = recipeMethodTitle;
        this.recipe = recipe;
        this.image = image;
        this.des = des;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipeMethodTitle() {
        return recipeMethodTitle;
    }

    public void setRecipeMethodTitle(String recipeMethodTitle) {
        this.recipeMethodTitle = recipeMethodTitle;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
