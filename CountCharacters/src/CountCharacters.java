
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Goma
 *
 */
public class CountCharacters {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   //This method will accept any input from user
	    
	   public static String acceptInput()
	   {
	      String line = "";
	      
	      try
	      {
	         line = br.readLine();
	      }
	      catch (IOException e)
	      {
	         System.err.println("*** I/O Error: " + e.getMessage() + " ***");
	      }
	      
	      return (line);
	   }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("To end this program, enter an empty line.");
		System.out.println("");
	      
	      while (true)
	      {
	         int nonBlankCharacters = 0;
	         String user;
	            
	         System.out.print("Enter any value: ");
	         user = acceptInput();
	         
	         if(user.equals(""))
	         {
	            System.out.println("Program complete.");
	            break;
	         }

	         user.length();
	         user.trim().length();
	            
	         for (int i = 0; i < user.length(); i++)
	         {
	            if(user.charAt(i) != ' ')
	            {
	               nonBlankCharacters++;
	            }
	         }
	         
	         System.out.println("The value you entered, \"" + user + "\"");
	         System.out.println("has " + user.length() + " characters" + ", including all blanks,");
	         System.out.println("has " + user.trim().length() + " characters" + ", trimmed of all leading and trailing blanks,");
	         System.out.println("has " + nonBlankCharacters + " non-blank characters.");
	         System.out.println("");


	      }
	   }

	}


