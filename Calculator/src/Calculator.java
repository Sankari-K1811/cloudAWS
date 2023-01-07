
public class Calculator {
		    int num1;
		    int num2;
		    int res;
		    public void acceptDetails(int x,int y) {
		    	num1=x;
		    	num2=y;
		    }
	        public void addition() {
	        	res=num1+num2;
	        	System.out.println("addition "+res);
	        }
	        public int subtraction() {
	        	return  num1-num2;
	        }
	        public void multiplication() {
	        	res=num1*num2;
	        	System.out.println("multiplication "+res);
	        }
	        public void division() {
	        	res=num1/num2;
	        	System.out.println("division "+res);
	        }

}
