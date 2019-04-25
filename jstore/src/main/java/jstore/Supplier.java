package jstore;
/**
 * Program ini merupakan class Supplier yang berisi data dan informasi yang
 * berkaitan dengan Supplier
 *
 * @author (Naufal Ikhsan)
 * @version (28/02/2019)
 */
public class Supplier
{
    // instance variables //
    
    protected int id;
    protected String name;
    protected String email;
    protected String phoneNumber;
    protected Location location;

    /**
     * Constructor for objects of class Supplier
     */
    public Supplier(String name, String email,String phoneNumber,
                    Location location)
    {
        this.id=DatabaseSupplier.getLastSupplierId()+1;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
    }
    /**method untuk mendapatkan nilai id
     * @return to id
     * 
     */
    public int getId(){
        return id;
    }
    /**
     * method untuk mendapatkan nilai name
     * @return to name
     */
    public String getName(){
        return name;
    }
    /**
     * method untuk mendapatkan nilai email
     * @return to email
     */
    public String getEmail(){
        return email;
    }
    /**
     * method untuk mendapatkan phonenumber
     * @return phoneNumber
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }
    /**
     * method untuk mendapatkan nilai location
     * @return to location
     */
    public Location getLocation(){
        return location;
    }
    /**
     * method untuk mendapatkan nilai city
     * @return to city
     */

    /**
     * method untuk melakukan set nilai id
     * @param int id
     */
    public void setId(int id){
        this.id=id;
    }
    /**
     * method untuk melakukan set nilai name
     * @param name
     */
    public void setName(String name){
        this.name=name;
    }
    /**
     * method untuk melakukan set nilai email
     * @param email
     */
    public void setEmail(String email){
        this.email=email;
    }
    /**
     * method untuk melakukan set nilai phoneNumber
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    /**
     * method untuk melakukan set nilai location
     * @param location
     */
    public void setLocation(Location location){
        this.location=location;
    }
    /**
     * method untuk melakukan print data dari supplier
     * @param no param
     * @return no return
     */
     public void printData(){
         System.out.println("==========SUPPLIER=======");
         System.out.println("ID :" + id);
         System.out.println("Name :" + name);
         System.out.println("Email :" + email);
         System.out.println("No telpon :" + phoneNumber);
         System.out.println("Lokasi Supplier :" + location.getCity());
    }
    
    public  String toString()
    {
        return "SUPPLIER"+
        "\nID: " + id+
        "\nName: " + name+
        "\nEmail: " + email+
        "\nPhone Number: " + phoneNumber+
        "\nLocation: " + location.getCity();
    }

    
}
