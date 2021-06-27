class ex131c  //We shifted salesTax variable from void main to class, this leads to its scope getting greater. Now we can use it even in the otherStates method/function
{   static double salesTax= 0;
    public static void main (String args[])
    {
        String location = "Arizona";
        
        if (location== "Utah")
        {
            salesTax= 0.047;
        }
        else 
        {
            otherStates();
        }
    

    System.out.println("Your sales tax rate is"+ salesTax*100+"%");
}

public static double otherStates()
{  
 salesTax = .05;
 return salesTax;
    
}

}