
/**
 * Write a description of class Supplier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Supplier
{
    // instance variables - replace the example below with your own
    private int x;
    protected int id;
    protected String name;
    protected String email;
    protected String phoneNumber;
    protected String city;
    protected Location location;

    /**
     * Constructor for objects of class Supplier
     */
    public Supplier(int id,String name, String email,String phoneNumber,
                    Location location)
    {
       this.location=location;
       this.phoneNumber=phoneNumber;
       this.email=email;
       this.name=name;
       this.id=id; 
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public Location getLocation(){
        return location;
    }
    
    public String getCity(){
        return city;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void setLocation(Location location){
        this.location=location;
    }
     public void printData(){

    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
