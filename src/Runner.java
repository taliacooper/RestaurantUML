public class Runner {
    public static void main(String[] args) {
        Ingredient chicken = new Ingredient("chicken", 5.25);
        Ingredient cheese = new Ingredient("cheese", 3.50);
        Ingredient pasta = new Ingredient("pasta", 2);
        Ingredient peppers = new Ingredient("peppers", 1.30);



        MenuItem veggie = new MenuItem("veggie", 90);
        MenuItem plain = new MenuItem("plain", 85);
        MenuItem special = new MenuItem("special", 80 );
        MenuItem[] p = {special, veggie, special};
        MenuItem[] q = {plain, veggie, veggie, special};

        Table table1 = new Table("Table 1", p);
        Table table2 = new Table("Table 2", q);

        veggie.addIngredient(cheese);
        veggie.addIngredient(pasta);
        veggie.addIngredient(peppers);

        plain.addIngredient(pasta);
        plain.addIngredient(peppers);

        special.addIngredient(cheese);
        special.addIngredient(pasta);
        special.addIngredient(chicken);


        table1.addItem(special);
        table1.addItem(veggie);
        table1.addItem(special);

        table2.addItem(plain);
        table2.addItem(veggie);
        table2.addItem(veggie);
        table2.addItem(special);

        System.out.println(table1.toString());
        System.out.println(table2.toString());

    }
}