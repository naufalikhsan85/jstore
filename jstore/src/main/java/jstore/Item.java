package jstore;

public class Item
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;

    /**
     * Constructor for objects of class Item
     */
    public Item(String name,ItemStatus status, int price,Supplier supplier, ItemCategory category)
    {
        id=DatabaseItem.getLastItemId()+1;
        this.name = name;
        this.status = status;
        this.price = price;
        this.supplier = supplier;
        this.category = category;

    }

    /**
     * Metode ini digunakan untuk menampilkan isi dari variabel Id yang telah dimasukkan
     * @return id akan mengeluarkan variable Id
     */
    public int getId(){
        return id;
    }


    /**
     * Metode ini digunakan untuk menampilkan isi dari variabel name yang telah dimasukkan
     * @return name akan mengeluarkan variable name
     */
    public String getName(){
        return name;
    }


    /**
     * Metode ini digunakan untuk menampilkan isi dari variabel stock yang telah dimasukkan
     * @return stock akan mengeluarkan variable stock
     */



    /**
     * Metode ini digunakan untuk menampilkan isi dari variable price yang telah dimasukkan
     * @return price akan mengeluarkan variable price
     */
    public int getPrice(){
        return price;
    }


    /**
     * Metode ini digunakan untuk menampilkan isi dari variabel stock yang telah dimasukkan
     * @return category akan mengeluarkan variable stock
     */
    public ItemCategory getCategory(){
        return category;
    }

    public ItemStatus getStatus(){
        return status;
    }


    /**
     * Metode ini digunakan untuk menampilkan isi dari variabel supplier yang telah dimasukkan
     * @return supplier akan mengeluarkan variable supplier
     */
    public Supplier getSupplier(){
        return supplier;
    }


    /**
     * Metode ini digunakan untuk mengubah Id yang telah dimasukkan
     * @param id Variabel id
     */
    public void setId(int id){
        this.id=id;
    }


    /**
     * Metode ini digunakan untuk mengubah name yang telah dimasukkan
     * @param name Variabel name
     */
    public void setName(String name){
        this.name=name;
    }


    /**
     * Metode ini digunakan untuk mengubah stock yang telah dimasukkan
     * @param stock Variabel stock
     */



    /**
     * Metode ini digunakan untuk mengubah price yang telah dimasukkan
     * @param price Variabel price
     */
    public void setPrice(int price){
        this.price=price;
    }


    /**
     * Metode ini digunakan untuk mengubah category yang telah dimasukkan
     * @param category Variabel category
     */
    public void setCategory(ItemCategory category){
        this.category=category;
    }

    public void setStatus(ItemStatus status){
        this.status=status;
    }


    /**
     * Metode ini digunakan untuk mengubah supplier yang telah dimasukkan
     * @param supplier Variabel supplier
     */
    public void setSupplier(Supplier supplier){
        this.supplier=supplier;
    }

    public String toString(){
        return "==========ITEM======="+
                "\nID :" + id+
                "\nName :"  + name+
                "\nPrice :" +getPrice()+
                "\nKategori :" + category+
                "\nStatus :" + status+
                "\nSupplier :" + supplier.getName();
    }

}