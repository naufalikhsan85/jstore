import java.util.ArrayList;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    private Customer customer;
    private boolean isActive;
    private static final InvoiceType INVOICE_TYPE= InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS= InvoiceStatus.Paid;
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        this.isActive=false;
    }
    public void setInvoiceStatus(InvoiceStatus status){
    }
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    public  InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    public void printData()
    {
            System.out.println("==========INVOICE=======");
            System.out.println("ID :" + getId());
            System.out.println("Date :" + getDate());
            System.out.println("Item yang terdapat :" + getItem());
          
            System.out.println("Total harga :" + getTotalPrice());
            System.out.println("Status :" + getInvoiceStatus());
    }
    
    public  String toString()
    {
       return "";
    }
}
