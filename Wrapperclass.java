package skill;

public class Wrapperclass {
	    public static void main(String[] args) {
	        int a = 10;
	        double b = 5.5;
	        char c = 'A';
	        boolean d = true;

	        Integer it = a;
	        Double dt = b;
	        Character ct = c;
	        Boolean bt = d;

	        System.out.println("Integer: " + it);
	        System.out.println("Double: " + dt);
	        System.out.println("Character: " + ct);
	        System.out.println("Boolean: " + bt);

	        int nt = it;
	        double nd = dt;

	        System.out.println("Unboxed int: " + nt);
	        System.out.println("Unboxed double: " + nd);
	    }
	}


