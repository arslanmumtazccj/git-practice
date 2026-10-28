package products;
import date.Date;
public class Product{
    private static int nextId = 1;
    private static final String ID_SUFFIX = "-PRD";
    private final String id; 
    private String name;
    private double price;
    private Date manufacturingDate;

    public Product(String name,double price,Date manufacturingDate){
        this.name = name;
        this.id = nextId + ID_SUFFIX;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
    
    nextId++; 
} 
    public String name(){
        return name;
} 
    public double price(){
        return price;
}
    public String getId(){
        return id;
}
    public void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Price Rs. " + price);
        System.out.println("ID : " + id);
        System.out.println("Manufacturing Date :  ");
        manufacturingDate.displayDate();
}
}
