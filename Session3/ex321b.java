 
 class ex321b
{
 
    public static void main (String args[])
    {
        int totalOrders =1;
        int orderCount =1;

        do //Makes the loop atleast run once, if the condition is not true
        {
            System.out.println("An order will be sent to you in " + orderCount*30 + " days.");
            orderCount++;
        }  while (orderCount<totalOrders);
    }
}
