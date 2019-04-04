
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


    public Sell_Paid(int id, Item item,int totalItem,Customer customer)
    {
        
        super(id,  item, totalItem);
        
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
            System.out.println("Total Item :" + getTotalItem());
            System.out.println("Total harga :" + getTotalPrice());
            System.out.println("Status :" + getInvoiceStatus());
    }
    
    public  String toString()
    {
       return "===== Invoice =====" + "ID: " + this.getId() + "Item: " + this.getItem().getName() + "Amount:"
                + this.getTotalItem() + "Buy Date: " + this.getDate() + "Price: " + this.getItem().getPrice()
                + "Price total: " + this.getTotalPrice() + "Supplier ID: " + this.getItem().getSupplier().getId()
                + "Supplier name: " + this.getItem().getSupplier().getName() + "Customer ID: "
                + this.getCustomer().getId() + "Customer name: " + this.getCustomer().getName() + "status: "
                + this.INVOICE_STATUS + "Sell success";
    }
}
