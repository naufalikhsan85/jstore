
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Calendar;
import java.util.ArrayList;
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private ArrayList<Integer> item;
    private Calendar date;
    public int totalPrice;
    private boolean isActive;
    private Customer customer;
    
    
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
       id = DatabaseInvoice.getLastInvoiceID() + 1;
       this.item = item;
    }

    /**
     * getId getter method
     * a method to get value of id of invoice
     * @return   the value of id variables as integer
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * getItem getter method
     * a method to get value of item of invoice
     * @return   the value of item variables as Item types
     */
    public ArrayList<Integer> getItem()
    {
        return item;
    }
    
    public Customer getCustomer()
    {
        return customer;
       
    }
    public boolean getIsActive()
    {
        return isActive;
    }
    
    
    /**
     * getDate getter method
     * a method to get value of date of invoice
     * @return   the value of date variables as String types
     */
    public Calendar getDate()
    {
        
        return date;
    }
    public void setIsActive(boolean isActive)
    {
        this.isActive=isActive;
    }
    /**
     * getTotalPrice getter method
     * a method to get value of total price of invoice
     * @return   the value of totalPrice variables as int types
     */
    public int getTotalPrice()
    {
        
        return totalPrice;
    }
    
    
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();
    
    /**
     * setId setter method
     * a method to set value of id of invoice
     * @param id as integer for replacing id number
     */
    public void setId(int id)
    {
        
        this.id = id; // use this as the variables name is same
    }
    
    /**
     * setItem setter method
     * a method to set value of item of invoice
     * @param item as Item types for replacing the item
     */
    public void setItem(ArrayList<Integer>item)
    {
        
        this.item = item; // use this as the variables name is same
    }
    
    /**
     * setDate setter method
     * a method to set value of date of invoice
     * @param date as String for replacing date of invoice
     */
    public void setDate(Calendar date)
    {
        
        this.date = date; // use this as the variables name is same
    }
    
    /**
     * setTotalPrice setter method
     * a method to set value of totalPrice variable of invoice
     * @param id as integer for replacing totalPrice number
     */
    public void setTotalPrice(int totalPrice)
    {
        
         this.totalPrice=totalPrice;// use this as the variables name is same
   
    }

    public  abstract void setInvoiceStatus(InvoiceStatus status);
    
    /**
     * printData method
     * a method to print totalPrice to terminal
     */
    
    
    public  String toString()
    {
     return"";
    }
    
}