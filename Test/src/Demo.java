
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N =4;
		
		 if(N % 2 != 0){
	            System.out.println("Weird");
	        }else {
	        	System.out.println("even ");
	        	if(N>2 && N<5)
	                System.out.println(" Nott Weird");
	            else if(N>6 && N<=20)
	                System.out.println("Weird");
	            else if(N> 20)
	                System.out.println("Not Weird");
	        }

	}

}
