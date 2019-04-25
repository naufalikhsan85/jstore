package jstore;

import java.util.*;
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private final static InvoiceType INVOICE_TYPE=InvoiceType.Buy;
    private final static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Paid;
    private boolean isActive;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(ArrayList<Integer> item)
    {
        super(item);
        this.isActive=false;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    
    public String toString()
    {
       String string="==========INVOICE=======";
        string += "\nID ="+getId();
        string += "\nBuy date =" + getDate();
        for (Integer invoice : getItem())
        {
            Item item = Database_Item.getItemFromID(invoice.intValue());
            string += "\nItem: " + item.getName();
            string += "\nAmount: " + getItem().size();
            string += "\nPrice: " + item.getPrice();
            string += "\nSupplier ID: " + item.getSupplier().getId();
            string += "\nSupplier Name: " + item.getSupplier().getName();
        }
        string += "\nPrice Total: " + getTotalPrice();
        string += "\nStatus: " + INVOICE_STATUS;
        if(isActive==true)
        {
        string += "\nBuy Success";
        }
        else
        {
        string += "\nBuy Cancel";
        }
        return string;
    }
 
}
