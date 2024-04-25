package hw1;
public class Sale {
    public static void yardSaleWholeSale(String product, double price, int qty, double total){
        double subTotal = price * qty;

        System.out.println("Name\tQty\t\tPrice\t\tTotal");
        System.out.println("----\t---\t\t-----\t\t-------");

        System.out.printf("%s\t%d\t\t$%.1f\t\t$%.2f%n", product, qty, price, total);

        System.out.println("\n\t Thank You. Come again!!!");

        System.out.println("\n\t Purchased on: Thursday, April 25, 2024");
    }
}

