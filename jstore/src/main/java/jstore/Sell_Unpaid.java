package jstore;

import java.util.*;
public class Sell_Unpaid extends Invoice
{
    private final static InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private final static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;

	
    public Sell_Unpaid(ArrayList<Integer> item,Customer customer)
    {
        super(item);
        this.customer=customer;
        this.dueDate = Calendar.getInstance();
        this.dueDate.add(Calendar.DATE,+1);
        this.isActive=true;
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
    
    public Calendar getDueDate()
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
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    
    public String toString()
    {
        String string="==========INVOICE SELL UNPAID=======";
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
        string += "\nDue date: " + getDueDate();
        string += "\nIf payment is not received by dueDate, transaction will be cancelled.";
        return string;
    }
        
    
    

    
}
