
/**
 * Program ini merupakan class DatabaseSupplier yang berisi data dan informasi yang
 * berkaitan dengan DatabaseSupplier.
 *
 * @author (Naufal Ikhsan)
 * @version (28/02/2019)
 */
    public class DatabaseSupplier{
     // instance variables //
    private String listSupplier[];
    private Supplier supplier;
    /**
     * Constructor for objects of class DatabaseSupplier
     */
    public DatabaseSupplier(){
    }
    /**
     *  method untuk menambahkan data pada class Supplier
     *  @return true
     *  @param supplier
     *  
     */
    static public boolean addSupplier(Supplier supplier){
     return true;
    }
    /**
     *  method untuk mengurangi data pada class Supplier
     *  @return true
     *  @param supplier
     * 
     */
    public boolean removeSupplier(Supplier supplier){
     return true;
    }
    /**
     *  method untuk mengambil data pada class Supplier
     *  @return supplier
     *  @param no param
     * 
     */
    public Supplier getSupplier(){
     return supplier;
    }
    /**
     *  method untuk mendapat list data pada class Supplier
     *  @return getListSupplier
     *  @param no param
     * 
     */
    public String[] getListSupplier(){
    return listSupplier;
    }
}
