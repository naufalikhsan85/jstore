
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{

    // instance variables - replace the example below with your own
    private int x;
    private int id;
    private int idItem;
    private String date;
    private int totalPrice;
    private Item item;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id,Item item,String date,int totalPrice)
    {
      this.item=item;
      this.totalPrice=totalPrice;
      this.date=date;
      this.id=id;  
    }
    public int getId(){
        return id;
    }
    public int getidIdItem(){
        return idItem;
    }
    public String getDate(){
        return date;
    }
    public int getTotalPrice(){
        return totalPrice;
    }
    public void setId(int id){
        this.id=id;
    }
    public int setIdItem(int idItem){
        return idItem;
    }
    public void setDate(String date){
        this.date=date;
    }
    public void setTotalPrice(int totalPrice){
        this.totalPrice=totalPrice;
    }
    public void setItem(Item item){
        this.item=item;
    }
    public void printData(){
        
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
