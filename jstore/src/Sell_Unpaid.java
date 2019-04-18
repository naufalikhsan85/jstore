import java.util.ArrayList;
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Calendar;
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(ArrayList<Integer> item,Customer customer)
    {
        super(item);
        this.isActive=true;
        this.customer = customer;
    }
    public void setInvoiceStatus(InvoiceStatus status){
    }
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    public Customer getCustomer()
    {
        return customer;
    }
    public Calendar getdueDate()
    {
        return dueDate;
    }
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate=dueDate;
    }

    public  String toString()
    {
         return "ID = \n" + "Item = \n" + "Amount = \n" + "Buy date = \n" + "Price = \n" + "Price total = \n" + "Supplier ID = \n" + "Supplier name = \n" + "Customer ID = \n" + "Customer name = \n" + "Status = UNPAID \n" + "Due date = \n" + "If payment is not received by dueDate, transaction will be cancelled.";
    }
}