package models;

public class Products {

    Burger[] burgers= new Burger[5];

    public Products()
    {
        burgers[0] = new Burger("Classic Cheddar Bliss", 8.99);
        burgers[1] = new Burger("Smoky BBQ Stack", 9.49);
        burgers[2] = new Burger("Spicy Jalapeño Crunch", 9.99);
        burgers[3] = new Burger("Bacon Ranch Deluxe", 10.25);
        burgers[4] = new Burger("Mushroom Swiss Melt", 9.75);

    };

    public Burger[] getAllBurgers() {
        return burgers;
    }



}


