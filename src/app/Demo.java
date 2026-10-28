package app;
import date.Date;
import products.Product;
import products.product_types.ElectronicProduct;
import products.product_types.ClothingProduct;
import products.product_types.subelec.Laptop;

public class Demo{
    public static void main(String[] args){
    Product p1 = new Product("Adnan Noul",20000,new Date(1,1,1));

    p1.displayDetails();

    ElectronicProduct ep1 = new ElectronicProduct("LAptop",2000000,new Date(01,02,2026),12);
    
    ep1.displayDetails();
    
    Laptop lp1 = new Laptop("Laptop Adnan.condom",30,new Date(2,3,2006),12,25);
    
    lp1.displayDetails();

}
}
