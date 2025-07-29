package skill;
import java.util.Scanner;
public class Narrowing {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a double value:");
	        double d = sc.nextDouble();

	        int i = (int) d;

	        System.out.println("Original double value: " + d);
	        System.out.println("Converted int value: " + i);
	        sc.close();
	    }
	}


