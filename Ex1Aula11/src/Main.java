import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        /* System.out.print("Quantity: ");
        int quantity = sc.nextInt(); */
        Product product = new Product(name, price);

        System.out.println("Product Data: " + product);
        System.out.print("Enter the number of products to be added in stock: ");
        product.AddProducts(sc.nextInt());
        System.out.println("Update Data:" + product);
        System.out.print("Enter the number of products to be remove from stock: ");
        product.RemoveProducts(sc.nextInt());
        System.out.println("Update Data: "+ product);
        sc.close();
    }
}