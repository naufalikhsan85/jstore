
/**
 * Program ini merupakan class Location yang berisi data dan informasi yang
 * berkaitan dengan Location.
 *
 * @author (Naufal Ikhsan)
 * @version (28/02/2019)
 */
public class Location
{
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     */
    public Location
    (String province, String description, String city){
        this.province=province;
        this.city=city;
        this.description=description;
    }
    /**
     * method untuk mengambil nilai province
     * @return province
     */
    public String getProvince(){
        return province;
    }
    /**
     * method untuk mengambil nilai descriptiom
     * @return description
     */
    public String getDescription(){
        return description;
    }
    /**
     * method untuk mengambil nilai city
     * return city
     *
     */
    public String getCity(){
        return city;
    }
    /**
     * method untuk melakukan set nilai province
     * @param province
     */
    public void setProvince(String province){
        this.province=province;
    }
    /**
     * method untuk melakukan set nilai description
     * @param description
     */
    public void setDescription(String description){
        this.description=description;
    }
    
    /**
     * method untuk melakukan set nilai city
     * @param city
     */
    public void setCity(String city){
        this.city=city;
    }

    /**
     * method untuk melakukan print data dari class location
     * @return no return
     * @param no param
     */
    public void printData(){
       System.out.println("==========LOCATION=======");
       System.out.println("Provinsi :" + province);
       System.out.println("Kota :" + city);
       System.out.println("Deksripsi :" + description);
    }
    
}
