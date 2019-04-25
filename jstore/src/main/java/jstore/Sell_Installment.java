package jstore;

import java.util.*;
public class Sell_Installment extends Invoice
{
    private final static InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private final static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;
    private int totalPrice;
    
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(ArrayList<Integer> item, int installmentPeriod,Customer customer)
    {
        super(item);
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
        this.isActive=true;
        
    }
    
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public void setInstallmentPrice(int installmentPrice)
    {
        installmentPrice=(totalPrice/installmentPeriod)*(102/100);
    }
    
    public void setTotalPrice()
    {
        totalPrice=installmentPrice*installmentPeriod;
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
        String string="==========INVOICE SELL INSTALLMENT=======";
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
        string += "\nInstallment Price: " + installmentPrice;
        string += "\nCustomer ID: " + customer.getId();
        string += "\nCustomer Name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nInstallment period: " + installmentPeriod;
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
