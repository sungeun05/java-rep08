import java.util.Scanner;

public class Rep08DiscountPolicy3 {
    private int variable;

    Rep08DiscountPolicy3(int n){
        variable = n;
    }

    public double computeDiscount(int cost, int quantity){
        double k = 0.0;
        k = quantity / variable;
        k = k * cost;

        return k;
    }

    public static void main(String[] args){
        int itemCost = 0;
        int itemQuantity = 0;
        int n = 0;

        double discount = 0.0;
        double result = 0.0;
        double total = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.printf("Enter the itemCost: ");
        itemCost = s.nextInt();

        System.out.printf("Enter item quantity: ");
        itemQuantity = s.nextInt();

        System.out.printf("Enter the number N: ");
        n = s.nextInt();

        Rep08DiscountPolicy3 p = new Rep08DiscountPolicy3(n);
        
        discount = p.computeDiscount(itemCost, itemQuantity);

        total = itemCost * itemQuantity;
        result = total - discount;

        System.out.println("[Result]");

        System.out.printf("Total before discount: %.1f\n",total);
        System.out.printf("Discount amount: %.1f\n",discount);
        System.out.printf("Final price: %.1f\n",result);

    }
}
