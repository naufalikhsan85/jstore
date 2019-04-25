package jstore;
import java.util.ArrayList;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    private InvoiceType INVOICE_TYPE =InvoiceType.Sell; 
    private InvoiceStatus INVOICE_STATUS =InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Installment (ArrayList<Integer> item,int installmentPeriod,Customer customer)
    {
        super(item);
        this.isActive=true;
        this.customer = customer;
        this.installmentPeriod = installmentPeriod;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    public void setInvoiceStatus(InvoiceStatus status){
    }
    public Customer getCustomer()
    {
        return customer;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }

    public void setInstallmentPrice(int totalPrice){
        installmentPrice=getTotalPrice() / installmentPeriod * 102/100;

    }

    public void setTotalPrice()
    {
        totalPrice=installmentPrice*installmentPeriod;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
   
    
    public  String toString()
    {
           return "ID = \n" + "Item = \n" + "Amount = \n" + "Buy date = \n" + "Price = \n" + "Price total = \n" + "Supplier ID = \n" + "Supplier name = \n" + "Customer ID = \n" + "Customer name = \n" + "Status = INSTALLMENT \n" + "Sell success.";

    }
}