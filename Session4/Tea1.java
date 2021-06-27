public class Tea1
{
    //objective 4.2.1

    protected int teaId;
    public String teaType;
    public String teaName;
    public double teaPrice;
    private double salePrice = teaPrice * 0.7;
    public double sale()
    {   salePrice = teaPrice* 0.7;
        return salePrice; 
    }

    Tea1 (int teaId, String teaType, String teaName, double teaPrice)
    {
        this.teaId= teaId;
        this.teaType = teaType;
        this.teaName = teaName;
        this.teaPrice = teaPrice;
    }

    Tea1()
    {

    }
    
   
public static void main(String args[])
{
    Tea1 t1 = new Tea1 (1, "Herbal", "Mint Green", 9.99);
    System.out.println("Our first tea is "+ t1.teaName+"sells for"+t1.teaPrice+ "and is on sale now for "+ t1.sale() );

    GourmetTea1 gt1 = new GourmetTea1(2, "Herbal", "Super lotus", "Lotus");
    System.out.println("We have a new gourmet tea called "+ gt1.teaName + " for "+ gt1.teaPrice+ ".");
}
}


 class GourmetTea1 extends Tea1
 {  
     public String gourmetBrand;
       
    GourmetTea1 (int teaId, String teaType, String teaName, String gourmetBrand)
       { 
           this.teaId = teaId;
           this.teaType =teaType;
           this.teaName = teaName;
           this.gourmetBrand = gourmetBrand;
           this.teaPrice = 12.99;
          // this.salePrice= 10.99; we converted it into a comment because else this private member poses an error
       }

    };

    