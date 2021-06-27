 class ex131a //Pu the system out statement in if block and it will resolve the error. This is due to the scope of the variable.
 {
    
  public static void main (String args[])

  {
      String location = "Utah";

      if (location== "Utah")
      {
          double salesTax= .047;
          System.out.println ("Your sales tax rate is"+ salesTax* 100+ "%.");
      }
  }


  
 } 
