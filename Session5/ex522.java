class ex522 
{
     static String [] cocoaBrands = new String[4];
    public static void main(String args[]) 
    {
        String[] cocoaBrands = new String[4];
        cocoaBrands[0]= "Regular";
        cocoaBrands[1]= "Dark Chocolate";
        cocoaBrands[2]= null;
        cocoaBrands[3]= "Sugar free";

       try
       { printItem(0);
        printItem(4); //test with index 3 as well
       }
       
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println("I think you tried to print something that doesn't exist.");
       }
       catch(Exception ex)
       {
           System.out.println("You have a different problem");
       }

       finally
       {
           System.out.println("Code complete.");
       }
    }

    static void printItem(int item)
    {
        System.out.println("Item number "+ item+ " is "+ cocoaBrands[item]);
    }
    

    
}
