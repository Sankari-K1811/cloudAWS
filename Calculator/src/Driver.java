import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Calculator calc=new Calculator();
		 Scanner sc=new Scanner(System.in);
		    System.out.println("enter two number");
		    x = sc.nextInt();
		    y = sc.nextInt();
		    System.out.println("1.addition,2.sutraction,3.multiplication,4.division");
		    int choice=sc.nextInt();
		    calc.acceptDetails(x,y);
		    switch(choice) {
		    case 1:
		      calc.addition();
		      break;
		    case 2:
		    	calc.subtraction();
		        System.out.println(calc.subtraction());
		        break;
		    case 3:
		    	calc.multiplication();
		    	break;
		    case 4:
		    	calc.division();
		    	break;
		    default:
		    	System.out.println("invalid choice");
		
		    }
	}

}
