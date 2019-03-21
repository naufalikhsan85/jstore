
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    
   
     public static void main(String[] args){
     Anggota anggota1   =new Anggota(args[0],StatusAnggota.Aktif,args[1]);
     System.out.println(anggota1.toString());
   
    }

}
