package jstore;import java.util.ArrayList;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE;
    private InvoiceStatus INVOICE_STATUS;
    private boolean isActive;
    
    public Buy_Paid(ArrayList<Integer> item)
    {
        super(item);
        this.isActive=false;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    public  InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public void setInvoiceStatus(InvoiceStatus status){
    }
    
    
    public  String toString()
    {
        return "";
    }
}
