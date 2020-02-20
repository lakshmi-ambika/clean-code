package cleancode;
import java.util.Scanner;


public class Clean1 {
	
static
	{
	Scanner sc=new Scanner(System.in);
	System.err.print("Simple Interest");
	System.err.print("\nEnter principal interest");
	float amount=sc.nextFloat();
	System.err.print("Enter time in years");
	float time=sc.nextFloat();
	System.err.print("Enter rate of interest");
	float rate=sc.nextFloat();
	float interest=(amount*rate*time)/100;
	System.err.print(interest);
	System.err.print("\nCompound Interest");
	System.err.print("\nEnter principal interest");
	float camount=sc.nextFloat();
	System.err.print("Enter time in years");
	float ctime=sc.nextFloat();
	System.err.print("Enter rate of interest");
	float crate=sc.nextFloat();
	System.err.print("\nenter the number");
	float n=sc.nextInt();
	double cinterest=camount*(Math.pow((1 + crate / 100), ctime)); 
	System.err.print(cinterest);
	System.exit(0);
	}
public static void main(String args[]){
}
}

