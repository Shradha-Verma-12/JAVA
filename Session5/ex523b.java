import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ex523b 
{

    static String [] cocoaBrands = new String[4];
    public static void main(String args[]) 
    {
        FileInputStream testFile = null;
        
        try
        {
            testFile = new FileInputStream("test.txt");
            System.out.println("Test file found");
        }
        
       
       catch (FileNotFoundException ex)
       {
           System.out.println("Test file not found");
       }
       
    }

     
}
