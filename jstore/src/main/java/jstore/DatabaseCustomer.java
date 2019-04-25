package jstore;

import java.util.ArrayList;
public class DatabaseCustomer
{
    //variabel yang dipakai
    private static ArrayList<Customer> CUSTOMER_DATABASE=new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID=0;

    //Menambah supplier
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }


    public static int getLastCustomerId()
    {
        return LAST_CUSTOMER_ID;
    }

    //Menghapus supplier
    /**
     * Method remove Supplier()
     * @param customer
     */
    public static boolean addCustomer(Customer customer) throws CustomerAlreadyExistsException
    {

        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customer.getName()==customerDB.getName()||customer.getEmail()==customerDB.getEmail())
            {
            throw new CustomerAlreadyExistsException(customer);
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID=customer.getId();
        return true;
    }

    //Menampilkan nama supplier
    /**
     * Method getSupplier()
     * @return supplier
     */
    public static Customer getCustomer(int id)
    {
        Customer value=null;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId()==id)
            {
                value=customerDB;
            }
        }
        return value;
    }



    /**
     * Method addSupplier()
     * @param id
     * @return false
     */
    public static boolean removeCustomer(int id) throws CustomerNotFoundException
    {

        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId()==id)
            {
                CUSTOMER_DATABASE.remove(id);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }

    public static Customer getCustomerLogin(String email, String password){
        for (Customer customerPtr : CUSTOMER_DATABASE){
            if (customerPtr.getEmail().equals(email) && customerPtr.getPassword().equals(password))
            {
                return customerPtr;
            }
        }
        return null;
    }


}


