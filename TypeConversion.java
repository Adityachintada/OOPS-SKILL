package skill;
import java.util.Scanner;
public class TypeConversion {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        long l = i;
        float f = l;

        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        sc.close();
    }
}


