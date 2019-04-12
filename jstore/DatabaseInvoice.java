import java.util.ArrayList;
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseInvoice
{
    // variabel yang digunakan dalam class
    private static ArrayList<Invoice> INVOICE_DATABASE;
    private static int LAST_INVOICE_ID = 0;
    
    
     public static ArrayList<Invoice> getInvoiceDatabase()
    {
        // return dari accessor 
        return INVOICE_DATABASE;
    }
    
    
    public static int getLastInvoiceID()
    {
    return LAST_INVOICE_ID;
    }
    
    public static boolean addInvoice(Invoice invoice)
    {
        INVOICE_DATABASE.add(invoice);
        return true;
    }

    public static Invoice getInvoice(int id)
    {
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == id ){
                return invoice;
            }
        }
        return null;
    }

    public static Invoice getActiveOrder(Customer customer){
        for(Invoice invoice : INVOICE_DATABASE){
            if( (invoice.getCustomer() == customer)  && (invoice.getInvoiceStatus() == InvoiceStatus.Unpaid) ){
                return invoice;
            }
        }
        return null;
    }
  
    public static boolean removeInvoice(int id)
    {
        for(Invoice invoice: INVOICE_DATABASE)
       {
        if(invoice.getId() == id)
        {
            if(invoice.getIsActive() == true)
            {
            invoice.setIsActive(false);
            INVOICE_DATABASE.remove(invoice);
            return true;
            } else
            
                {
            INVOICE_DATABASE.remove(invoice);
            return true;
                }   
        } 
        
       }
        return false;
    }
    

}