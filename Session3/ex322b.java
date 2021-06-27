
class ex322b 
{
    
    public static void main (String args[])
    {
        String[] cocoaBrands = new String[4];

        cocoaBrands[0] = "Regular";
        cocoaBrands[1] = "Dark chocolate";
        cocoaBrands[2] = null;
        cocoaBrands[3] = "Sugar free";

        for (int c=0; c<cocoaBrands.length; c++)
        {   if (cocoaBrands[c]== null)
            {
                continue; //when loop hits null, it does not print null, skips that statement and print the next loop value.
            }
            System.out.println(cocoaBrands[c]);
        }
    }
    
}
