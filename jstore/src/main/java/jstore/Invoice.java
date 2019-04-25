package jstore;

import java.util.*;
public abstract class Invoice
{

    private int id;
    private ArrayList<Integer> item;
    private Calendar date=Calendar.getInstance();
    private int totalPrice;
    private boolean isActive;
    private Customer customer;
    

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
        this.item=item;
        id=DatabaseInvoice.getLastInvoiceID()+1;
    }
    
    
       /**
         * Metode ini digunakan untuk menampilkan isi dari variabel Id yang telah dimasukkan
         * @return id akan mengeluarkan variable Id
         */
    public int getId()
    {
        return id;
    }
    
    
    
       /**
         * Metode ini digunakan untuk menampilkan isi dari variabel Item yang telah dimasukkan
         * @return item akan mengeluarkan variable item
         */
    public ArrayList<Integer> getItem()
    {
        return item;
    }
    
    
    
       /**
         * Metode ini digunakan untuk menampilkan isi dari variabel date yang telah dimasukkan
         * @return date akan mengeluarkan variable date
         */
    public Calendar getDate()
    {
        return date;
    }
    
    
    
       /**
         * Metode ini digunakan untuk menampilkan isi dari variabel totalPrice yang telah dimasukkan
         * @return totalPrice akan mengeluarkan variable totalPrice
         */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    
    
    public abstract InvoiceStatus getInvoiceStatus();
    public abstract InvoiceType getInvoiceType();
    
    public boolean getIsActive()
    {
        return isActive;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    
       /**
         * Metode ini digunakan untuk mengubah Id yang telah dimasukkan
         * @param id Variabel id
         */
    public void setId(int id)
    {
        this.id=id;
    }
    
    
    
       /**
         * Metode ini digunakan untuk mengubah item yang telah dimasukkan
         * @param item Variabel item
         */
    public void setItem(ArrayList<Integer> item)
    {
        this.item=item;
    }
    
    
    
       /**
         * Metode ini digunakan untuk mengubah date yang telah dimasukkan
         * @param date Variabel date
         */
    public void setDate(Calendar date)
    {
        this.date=date;
    }
    
    
    
       /**
         * Metode ini digunakan untuk mengubah totalPrice yang telah dimasukkan
         * @param totalPrice Variabel totalPrice
         */
    public void setTotalPrice(int totalPrice)
    {
        for(Integer invoice : item)
        {
            totalPrice=totalPrice+Database_Item.getItemFromID(invoice).getPrice();
        }
    }
    
    
    
    public abstract void setInvoiceStatus(InvoiceStatus status);
    
    public void setIsActive(boolean isActive)
    {
        this.isActive=isActive;
    }
    
    public abstract String toString();


}
