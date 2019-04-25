package jstore;
import java.util.*;
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private final static InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private final static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;



    public Sell_Paid(ArrayList<Integer> item,Customer customer)
    {
        super(item);
        this.customer=customer;
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
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    
    public String toString()
    {
        String string="==========INVOICE SELL PAID=======";
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
        string += "\nCustomer ID: " + customer.getId();
        string += "\nCustomer Name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        if(isActive==true)
        {
        string += "\nSell Success";
        }
        else if (isActive==false)
        {
        string += "\nSell Cancel";
        }
    
        return string;
    }
    
    

    
}
