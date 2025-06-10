import models.Burger;
import models.Products;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Products products = new Products();

        System.out.println("👉 Categories");
        System.out.println(" 1 : Burgers \n 2 : Drinks \n 3 : Rice Meals");
        int food_category = scanner.nextInt();

        switch (food_category){

            case 1 :
                for (Burger burger : products.getAllBurgers()) {
            System.out.println(burger); // Calls toString()
            };
                break;

        }



//        System.out.println("Burgers:");
//        for (Burger burger : products.getAllBurgers()) {
//            System.out.println(burger); // Calls toString()
//        }

    }

}