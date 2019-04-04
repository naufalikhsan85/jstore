
/**
 * Program ini merupakan class Item yang berisi data dan informasi yang
 * berkaitan dengan Item
 *
 * @author (Naufal Ikhsan)
 * @version (28/02/2019)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int stock;
    private int price;
    private Supplier supplier;
    private ItemCategory category;
    private ItemStatus status;

    /**
     * Constructor for objects of class Item
     */
    public Item(int id,String name,int stock,int price,ItemStatus status,Supplier supplier,ItemCategory category)
    {
       this.id=id;
       this.name=name;
       this.stock=stock;
       this.supplier=supplier;
       this.price=price; 
       this.category=category;
    }
    /**
     *method untuk mendapatkan nilai id
     *@return to id
     * 
     */
    public int getId(){
        return id;
        
    }
    /**
     * method untuk mendapatkan nilai name
     * @return to name
     */
    public String getName(){
        return name;
    }
    /**
     * method untuk mendapatkan nilai stock
     * @return to stock
     */
    public int getStock(){
        return stock;
    }
    /**
     * method untuk mendapatkan nilai price
     * @return to price
     */
    public int getPrice(){
        return price;
    }
    /**
     * method untuk mendapatkan nilai category
     * @return to category
     */
    public ItemCategory getCategory(){
        return category;
    }
    public ItemStatus getStatus(){
        return status;
    }
    /**
     * method untuk mendapatkan nilai supplier
     * @return to supplier
     */
    public Supplier getSupplier(){
        return supplier;
    }
    /**
     * method untuk melakukan set nilai id
     * @param id
     */
    public void setId(int id){
        this.id=id;
    }
    /**
     * method untuk melakukan set nilai name
     * @param name
     */
    public void setName(String name){
        this.name=name;
    }
    /**
     * method untuk melakukan set nilai stock
     * @param stock
     */
    public void setStock(int stock){
        this.stock=stock;
    }
    /**
     * method untuk melakukan set nilai price
     * @param price
     */
    public void setPrice(int price){
        this.price=price;
    }
    /**
     * method untuk melakukan set nilai category
     * @param category
     */
    public void setCategory(ItemCategory category){
        this.category=category;
    }
    public void setStatus(ItemStatus status){
        this.status=status;
    }
    /**
     * method untuk melakukan set nilai supplier
     * @param supplier
     */
     public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }
    /**
     * method untuk melakukan pencetakan seluruh data Item
     * @param no param
     * @return no return
     */
    public void printData(){
    System.out.println("==========ITEM=======");
    System.out.println("ID :" + id);
    System.out.println("Name :"  + name );
    System.out.println("Stok :" + stock);
    System.out.println("Kategori :" + category);
    System.out.println("Status :" + status);
    System.out.println("Supplier :" + supplier.getName());    
}



    public  String toString()
    {
       return ("");
    }
    
   
}


