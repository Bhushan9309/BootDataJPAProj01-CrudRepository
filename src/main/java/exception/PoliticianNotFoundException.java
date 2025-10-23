package exception;

public class PoliticianNotFoundException extends RuntimeException 
{
       public PoliticianNotFoundException()
       {
    	   
       }
       
       public PoliticianNotFoundException(String msg)
       {
    	   super(msg);
       }
}
