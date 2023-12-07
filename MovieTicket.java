import java.util.Scanner;
public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, time;
        double ticketprice = 0.0;
        System.out.println(" enter age :");
        age = sc.nextInt();
        System.out.println(" enter time :");
        time = sc.nextInt();
        if ( age <= 12 ){
               ticketprice = 5.00;
        } else if ( age >= 12 && age < 60) {
               ticketprice = 10.00;
        } else {
               ticketprice = 7.50;
        }
        if (time > 15 && time < 18){
               ticketprice = ticketprice - 2.00;
        }
        if( time > 18){
               ticketprice = ticketprice - 3.00;
        }

        System.out.println(" final ticket price :" + ticketprice );
     }
}








