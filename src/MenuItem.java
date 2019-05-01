public class MenuItem {
    private int ingredientCount = 0;
    private int prepTime = 0;
    private String name;
    private Ingredient[] ing = new Ingredient[10];

    public MenuItem(String name, int prepTime) {
        this.name = name;
        this.prepTime = prepTime;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;

    }
    public  Ingredient[] getIngredients() {
        return ing;
    }

    public void addIngredient(Ingredient i) {
        ing[ingredientCount] = i;
        ingredientCount++;
    }

    public double getItemPrice() {
        double total = 0;
        for(int i=0; i<ingredientCount;i++){
            total = total + ing[i].getPrice();
        }
        return total;

    }

    public int getPrepTime() {
        return prepTime;

    }
    public void setPrepTime(int prepTime){
        this.prepTime = prepTime;
    }

}

