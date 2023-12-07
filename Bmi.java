import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("weight in kg : ");
        double weight = sc.nextDouble();
        System.out.println("height in meters : ");
        double height = sc.nextDouble();
        
        double BMI = weight / (height * height);
        
        if(BMI < 18.5){
            System.out.println("The BMI score is "+BMI+" .The person is Under Weight.");
        }else if(BMI >= 18.5 && BMI < 25){
            System.out.println("The BMI score is "+BMI+" .The person is Normal.");
        }else if(BMI >= 25 && BMI < 30){
            System.out.println("The BMI score is "+BMI+" .The person is Over Weight.");
        }else if(BMI >= 30){
            System.out.println("The BMI score is "+BMI+" .The person is Obese.");
        }
        
    }
    
}