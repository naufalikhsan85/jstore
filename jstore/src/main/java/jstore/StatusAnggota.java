package jstore;
/**
 * Enumeration class StatusAnggota - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum StatusAnggota
{
   Aktif("Aktif"),InAktif("Hiatus"),Out("Keluar");
   private String value;
    
    public String toString()
   {
    return value;
   }

    private StatusAnggota(String value)
     {
    this.value=value;
   }
}
