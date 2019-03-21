
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Unpaid;
    private String dueDate;
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(int id, Item item, String date, int totalPrice, int totalItem, String dueDate)
    {
        super(id,item,date,totalPrice,totalItem);
        this.dueDate=dueDate;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public String getdueDate()
    {
        return dueDate;
    }
    
    public void printData()
    {
            System.out.println("==========INVOICE=======");
            System.out.println("ID :" + getId());
            System.out.println("Date :" + getDate());
            System.out.println("Item yang terdapat :" + getItem());
            System.out.println("Total Item :" + getTotalItem());
            System.out.println("Total harga :" + getTotalPrice());
            System.out.println("Status :" + getInvoiceStatus());
    
 
    }
    
}