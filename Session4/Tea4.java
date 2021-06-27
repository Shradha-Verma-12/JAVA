public class Tea4 
{
    //objectives 4.2.4 and 4.2.5 
    // and 4.4.4
    protected int teaID;
    public String teaType;
    public String teaName;
    public double teaPrice;
    private double salePrice = teaPrice * 0.75; // Encapsulation is used. We made it private and it became inaccessible for any other classes. We hid information using it.

    Tea4 (int teaID, String teaType, String teaName, double teaPrice)
    {
        this.teaID= teaID;
        this.teaType= teaType;
        this.teaName= teaName;
        this.teaPrice= teaPrice;
        this.salePrice= teaPrice* 0.75;

    }

    Tea4()
    {   }

    public static void main (String args[])
    {
        Tea4 t4 = new Tea4(1, "Herbal", "Mint green", 9.99);
        System.out.println("Our first tea is "+ t4.teaName + " sells for "+ t4.teaPrice+ " and is on now for "+ String.format("%.2f", t4.salePrice) + ".");

        GourmetTea4 gt4 = new GourmetTea4 (2, "Herbal", "Super Lotus", "Lotus");
        System.out.println("We have a new gourmet tea called "+ gt4.teaName+ " on sale for "+ gt4.gourmetSalePrice+ ".");
        
        GourmetTea4 gt4a = new GourmetTea4 (3, "Herbal", "Super Oolong");
        System.out.println("We have a new gourmet tea called "+ gt4a.teaName+ " on sale for "+ gt4a.gourmetSalePrice+ " and ship for " + gt4a.gourmetShipping+ ".");
    
    }
    
}

class GourmetTea4 extends Tea4
{
    public String gourmetBrand;
    static double gourmetSalePrice = 10.99;
    static final double gourmetShipping = 2.99;

    GourmetTea4( int teaID, String teaType, String teaName, String gourmetBranD)
    {
        this.teaID= teaID;
        this.teaType= teaType;
        this.teaName= teaName;
        this.gourmetBrand= gourmetBrand;
        this.teaPrice= 12.99;
    }

    GourmetTea4 (int teaID, String teaType, String teaName)
    {
        this.teaID= teaID;
        this.teaType= teaType;
        this.teaName= teaName;
        this.gourmetBrand= "Oolong";
        this.teaPrice= 13.99;
        this.gourmetSalePrice = 11.99;
    }

}