
/**
 * Program ini merupakan class Invoice yang berisi data dan informasi yang
 * berkaitan dengan Invoice
 *
 * @author (Naufal Ikhsan)
 * @version (28/02/2019)
 */
public class Invoice
{

    // instance variables
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
	/**method untuk mendapatkan nilai id
     * @return to id
     * 
     */
    public int getId(){
        return id;
    }
	/**method untuk mendapatkan nilai idItem
     * @return to idItem
     * 
     */
    public int getidIdItem(){
        return idItem;
    }
	/**method untuk mendapatkan nilai date
     * @return to date
     * 
     */
    public String getDate(){
        return date;
    }
	/**method untuk mendapatkan nilai totalPrice
     * @return to totalPrice
     * 
     */
    public int getTotalPrice(){
        return totalPrice;
    }
	 /**
     * method untuk melakukan set nilai id
     * @param int id
     */
    public void setId(int id){
        this.id=id;
    }
	 /**
     * method untuk melakukan set nilai idItem
     * @param idItem
     */
    public int setIdItem(int idItem){
        return idItem;
    }
	 /**
     * method untuk melakukan set nilai date
     * @param date
     */
    public void setDate(String date){
        this.date=date;
    }
	 /**
     * method untuk melakukan set nilai totalPrice
     * @param totalPrice
     */
    public void setTotalPrice(int totalPrice){
        this.totalPrice=totalPrice;
    }
	 /**
     * method untuk melakukann set nilai item
	 * @param item
     */
    public void setItem(Item item){
        this.item=item;
    }
	/**
     * method untuk melakukan print data dari invoice
     * @param no param
     * @return no return
     */
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
