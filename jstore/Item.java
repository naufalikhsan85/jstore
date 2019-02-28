
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int x;
    private int id;
    private String name;
    private int stock;
    private int price;
    private Supplier supplier;
    private String category;

    /**
     * Constructor for objects of class Item
     */
    public Item(int id,String name,int stock,int price, String category)
    {
       this.id=id;
       this.name=name;
       this.stock=stock;
       this.supplier=supplier;
       this.category=category;
       this.price=price; 
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getStock(){
        return stock;
    }
    public int getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
    public Supplier getSupplier(){
        return supplier;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setCategory(String category){
        this.category=category;
    }
     public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }
    
    public static void printData()
    {
        
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}


