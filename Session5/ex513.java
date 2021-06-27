
class ex513 
{
    public static void main(String[] args) 
    {
        int orderQty = 100;
        String customerStatus= "";

        if (orderQty>=80) //if orderQty>=40, even 100 would prove the condition right, whereas it should be Gold, so we interchange conditions
        {
            customerStatus ="Gold";
        }
        else if (orderQty>=40)
        {
            customerStatus= "Silver";
        }

        System.out.println("Your customer status is "+ customerStatus);
    }
    
}
