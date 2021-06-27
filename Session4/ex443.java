
class ex443 
{
    public static void main(String args[])
    {
        Product prod1 = new Product(1, "tea", "Green Tea", 8.99);  //Instantiated the class
        prodMsg(prod1);
        Product prod2 = new Product(2, "Coffee", "Colombian", 7.99, "11 oz");
        prodMsg(prod2);
    }
    
   public static class Product
    {
        int productId;
        String type, productName;
        String bagSize= null;
        double price;


        Product(int productIdValue, String typeValue, String productNameValue, double priceValue)
        {
            productId = productIdValue;
            type = typeValue;
            productName = productNameValue;
            price = priceValue;
        }

        Product(int productIdValue, String typeValue, String productNameValue, double priceValue, String bagSizeValue)
        {
            productId = productIdValue;
            type = typeValue;
            productName = productNameValue;
            price = priceValue;
            bagSize= bagSizeValue;
        }

}

public static void prodMsg(Product prod)
  
{
    if (prod.bagSize== null)
    {
        System.out.println("The "+prod.productName + " "+ prod.type+" sells for "+ prod.price );
    }
    else
    {
        System.out.println("The "+prod.productName + " "+ prod.type+" sells for "+ prod.price + " per "+ prod.bagSize+ " bag.");

    }
   }
}
