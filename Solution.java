import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); // get the input
	    String[] characters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; //store all alpbhates in the arrray
	    
	    int incrChar = 0; //declare a variable for incrementing a char
	    
	    for(int i=0;i<n;i++)
	    {
	        if(i%2==0) // if even rows start with alpbhabet
	        {
	            for(int j=0;j<n+n-1;j++)
	            {
	                if(incrChar>25) // if character array index is more than 25 then declare to start
	                    incrChar=0;
	                
	                if(j%2==0)
	                System.out.print(characters[incrChar++]);
	                else
	                System.out.print("*");
	            }
	        }
	        else // if odd rows start with astrick
	        {
	            for(int j=0;j<n+n-1;j++)
	            {
	                if(incrChar>25)
	                    incrChar=0;
	                    
	                if(j%2==0)
	                System.out.print("*");
	                else
	                System.out.print(characters[incrChar++]);
	            }
	        }
	        System.out.println();
	    }

	}
}
