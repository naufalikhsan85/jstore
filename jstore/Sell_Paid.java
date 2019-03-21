
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



    public Sell_Paid(int id,Item item,String date,int totalItem,int totalPrice)
    {
        
        super(id,item,date,totalItem,totalPrice);
        this.INVOICE_TYPE=INVOICE_TYPE;
        this.INVOICE_STATUS=INVOICE_STATUS;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    public  InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
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
