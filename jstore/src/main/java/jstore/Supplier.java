

package jstore;


public class Supplier{

    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

      /**
     * @param id,name,email,phoneNumber,location
     * 
     */

    public Supplier(String name, String email, String phoneNumber, Location location){
        id=DatabaseSupplier.getLastSupplierID()+1;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
    }
      /**
     * Method untuk mereturn id supplier
     *
     * @return int id supplier
     */
    
    public int getId(){
        return id;
    }
       /**
     * Method untuk mereturn nama supplier
     *
     * @return String name supplier
     */
    
    public String getName(){
        return name;
    }
     /**
     * Method untuk mereturn email supplier
     *
     * @return String email supplier
     */
    
    public String getEmail(){
        return email;
    }
    
      /**
     * Method untuk mereturn nomor telfon supplier
     *
     * @return String phoneNumber supplier
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }
      /**
     * Method untuk mereturn lokasi/alamat supplier
     *
     * @return objek location supplier
     */
    
    public Location getLocation(){
        return location;
    }
     /**
     * Method untuk mengubah id supplier
     *
     * @param id adalah parameter untuk method setID
     */
    
    public void setId(int id){
        this.id=id;
    }
    /**
     * Method untuk mengubah nama supplier
     *
     * @param name adalah parameter untuk method setName
     */
    
    public void setName(String name){
        this.name=name;
    }
      /**
     * Method untuk mengubah email supplier
     *
     * @param email adalah parameter untuk method setEmail
     */

    public void setEmail(String email){
        this.email=email;
    }
        /**
     * Method untuk mengubah nomor telfon supplier
     *
     * @param phoneNumber adalah parameter untuk method setPhoneNumber
     */

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

      /**
     * Method untuk mengubah location supplier
     *
     * @param location adalah parameter untuk method setLocation
     */
    

    public void setLocation(Location location){
        this.location=location;
    }

       /**
     * Method untuk mencetak nama supplier
     *
     *      
     */    
    public String toString(){
        return "========SUPPLIER=========\nID: "+id+"\nnama: "+name+"\nemail: "+email+"\nnomor telepon: "+phoneNumber+"\nlokasi: "+location.getCity()+", "+location.getProvince();
    }
}
