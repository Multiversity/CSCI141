import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
	    boolean running = true;
	    while(running)
	    {
	    	System.out.print("Enter a Number > ");
		    int x = input.nextInt();
		    if(x % 3 == 0 && x % 5 == 0)
		    {
		    	System.out.print("FizzBuzz!");
		    	System.out.println();
		    }
		    else if(x % 5 == 0)
		    {
		    	System.out.print("Buzz!");
		    	System.out.println();
		    }
		    else if(x % 3 == 0)
		    {
		    	System.out.print("Fizz!");
		    	System.out.println();
		    }
		    else if(x % 3 != 0 || x % 5 != 0)
		    {
		    	System.out.print("Please try a different number.");
		    	System.out.println();
		    }
		    System.out.println();
	    }
	}
}
