package models;

public class Burger {

    private String name;
    private double price;

    public Burger (String name, double price)
    {
        this.name = name;
        this.price = price;

    };

    //getters

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + String.format("%.2f", price);
    }
}
