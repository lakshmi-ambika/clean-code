package cleancode;
import java.util.Scanner;

public class Clean2 {
	
	static{
	Scanner sc=new Scanner(System.in);
	System.err.print("enter the number of square feet is");
	int n=sc.nextInt();
	System.err.print("\n1.standard materials\n2.Above standard materials\n3.high standard materials\n4.high standard and fully automated home");
	System.err.print("\nenter the material you need to use:");
	int a=sc.nextInt();
	int b;
	switch(a){
	case 1:System.err.print("\n1200 per square feet");
	       b=1200;
	       System.err.print("\ncost of construction is:"+(n*b));
	       break;
	case 2:System.err.print("\n1500 per square feet");
	       b=1500;
	       System.err.print("\ncost of construction is:"+(n*b));
	       break;
	case 3:System.err.print("\n1800 per square feet");
	       b=1800;
	       System.err.print("\ncost of construction is:"+(n*b));
	       break;
	case 4:System.err.print("\n2500 per square feet");
	       b=2500;
	       System.err.print("\ncost of construction is:"+(n*b));
	       break;
	default:System.err.print("\ninvalid selection");
		break;
	}

	}
	public static void main(String args[]){
	}
}






