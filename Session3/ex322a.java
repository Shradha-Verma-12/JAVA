
class ex322a
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
                break; //when loop hits null, it stops due to the break statement.
            }
            System.out.println(cocoaBrands[c]);
        }
    }
}

   

