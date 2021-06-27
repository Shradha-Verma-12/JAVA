class ex112{
    public static void main (String args[])
    {
        Product product1= new Product (" Coffee", "Medium roast", 9.99);
        Product product2= new  Product(" Tea", "Organic white", 7.99);
        System.out.print(product1.name);
        System.out.print(product2.name);
        


    }
}

    class Product
    {
        String type;
        String name;
        double price;
     Product (String type, String name, double price)
{
    this.type= type;
    this.name= name;
    this.price=price;
}
        
    }
