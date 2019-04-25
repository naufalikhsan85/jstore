package jstore;


import java.util.*;
import java.text.SimpleDateFormat;
import java.util.regex.*;
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username,String password, Calendar birthDate)
    {
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        id=DatabaseCustomer.getLastCustomerId()+1;
        this.birthDate=birthDate;
    }
    
    
    public Customer(String name,String email,String username,String password, int year,int month,int dayOfMonth)
    {
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        id=DatabaseCustomer.getLastCustomerId()+1;
        this.birthDate= new GregorianCalendar(year,month-1,dayOfMonth);
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public int getId()
    {
        return id;
    }
    
    public Calendar getBirthDate()
    {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        String birthDateString = sdf.format(birthDate.getTime());
        System.out.println("Birth date : "+ birthDateString);
        return birthDate;
        
       /*
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        String birthDateString = sdf.format(birthDate.getTime());
        System.out.printf("Birth date :  %s\n", birthDateString);
        return birthDate;
        */
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setEmail(String email)
    {
        String pattern =  "^([a-zA-Z0-9(&*_~)]+([.])?)+[a-zA-Z0-9(&*_~)]+@([a-zA-Z0-9]+[-]?[a-zA-Z0-9]+)+([.]([a-zA-Z0-9]+))+$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if (m.find()) {
            System.out.println("Email : " + m.group());
            this.email = email;
        } else {
            System.out.println("Email : null");
            this.email = email;
        }
    }
    
    public void setUsername(String username)
    {
        this.username=username;
    }
    
    public void setPassword(String password)
    {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z_0-9]{6,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        if(m.find()){
            System.out.println("Password: " + m.group());
            this.password = password;
        }else{
            System.out.println("Password: NULL");
            this.password = "NULL";
        }
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
    
    public void setBirthDate(Calendar birthDate)
    {
        this.birthDate=birthDate;
    }
    
    public void setBirthDate(int year, int month,int dayOfMonth)
    {
        this.birthDate= new GregorianCalendar(year,month,dayOfMonth);
    }
    
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        return "===Customer==="+
        "\nID: "+getId()+
        "\nNama: "+name+
        "\nUsername: "+username+
        "\nEmail: "+email+
        "\nPassword: "+password+"\nBirth Date :"+ sdf.format(birthDate.getTime());
    }
    
}
