import java.util.Scanner;

public class Rep08DiscountPolicy2 {
    private int minimum;
    private double percent;

    Rep08DiscountPolicy2(int a, double b){
        minimum = a;
        percent = b;
    }
    public double computeDiscount(int count, int itemCost){

        if(count > minimum)
            return 1;
        else 
            return 0;  
    }
    
    public static void main(String[] args){
        

        int minimum = 0;
        int itemCost = 0;
        int percent = 0;
        int itemQuantity = 0;

        double discount = 0.0;
        double result = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.printf("Enter the minimum: ");

        minimum = s.nextInt();

        System.out.printf("Enter the itemCost: ");
        itemCost = s.nextInt();

        System.out.printf("Enter the discount percent: ");
        percent = s.nextInt();

        System.out.printf("Enter item quantity: ");
        itemQuantity = s.nextInt();

        Rep08DiscountPolicy2 p = new Rep08DiscountPolicy2(minimum, percent);
        
        discount = p.computeDiscount(itemQuantity,itemCost);

        if(discount == 1){
            result = (itemCost * itemQuantity);
            result = result - ((itemCost * itemQuantity) * percent/100.0);
            System.out.printf("Res: %.1f",result);
        }
        else{
            result = (itemCost * itemQuantity);
            System.out.printf("Res: %.1f",result);
        }
    }
}

