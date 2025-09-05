//Simple Interest Calculator which accepts user input!
import java.util.Scanner;
public class SI{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Principal: ");
        int p = scanner.nextInt();
        System.out.print("Rate of Interest: ");
        int r = scanner.nextInt();
        System.out.print("Time period: ");
        int t = scanner.nextInt();
        
        double si = (p * r * t)/100.0;
        System.out.printf("The Simple interest is: %.2f", si);
        
        scanner.close();
    }
}
