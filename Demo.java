package pack1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the product?");
        String product = userInput.nextLine();
        System.out.println("How many did you buy?");
        int Qtnty = userInput.nextInt();
        System.out.println("How much is each product?");
        double IndivPrice = userInput.nextDouble();
        System.out.println("How many miles did it travel?");
        double miles = userInput.nextInt();
        int shippingprice = 0;
        if (miles == 0 && miles <= 5) {
            shippingprice = 2;
        } else if (miles > 5 && miles <= 15) {
            shippingprice = 5;
        } else if (miles > 15 && miles <= 25) {
            shippingprice = 10;
        } else if (miles > 25 && miles <= 50) {
            shippingprice = 15;
        } else if (miles > 50) {
            shippingprice = 20;
        } else {
        }

        double finalprice = (Qtnty * IndivPrice) + shippingprice;

        System.out.printf("%-22s%-22s%-22s%-22s%-22s\n", "Product", "Qnt", "Unit Price", "Shipping", "Total");
        System.out.printf("%-22s%-22s%-22s%-22s%-22s\n", "_______", "___", "__________", "________", "_____");
        System.out.printf("%-22s%-22s%-22s%-22s%-22s\n", product, Qtnty, IndivPrice, shippingprice, finalprice);
        System.out.printf("\n");
        System.out.printf("%22s\n", "Thank you for shopping with us!");
    }}

