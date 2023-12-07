import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" number of books: ");
        int numBooks = sc.nextInt();
        System.out.print("Is the customer a member? (true/false): ");
        boolean isMember = sc.nextBoolean();

        double basePrice = 10.0; 
        double totalCost = numBooks * basePrice;

        if (isMember) {
            
            totalCost -= totalCost * 0.10;
        }

        if (numBooks > 5) {
            
            totalCost -= totalCost * 0.05;
        }

        if (numBooks >= 10) {
            
            totalCost -= 100.0;
        }

        totalCost = Math.max(totalCost, 0);

      
        System.out.println("Total cost: Rs" + totalCost);

        
    }
}
