import java.util.ArrayList;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE;
    private InvoiceStatus INVOICE_STATUS;
    private Customer customer;
    private boolean isActive;

    public Sell_Paid(ArrayList<Integer> item)
    {
        super(item);
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
