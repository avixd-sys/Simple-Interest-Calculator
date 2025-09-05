//Simple Interest which generate random values and outputs it!
import java.util.Random;
public class RandomSI{
    public static void main(String[] args){
        Random random = new Random();
        int p = random.nextInt(100, 9999);
        int r = random.nextInt(1, 50);
        int t = random.nextInt(1, 10);
        double si = (p * r * t)/100.0;
        System.out.println("The random principal used is: " + p);
        System.out.println("The random rate of interest used is: " + r + "%");
        System.out.println("The random time used is: " + t + "years");
        System.out.printf("Simple Interest calculated using random variables is: %.2f", si);
    }
}
