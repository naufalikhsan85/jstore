package jstore;
/**
 * Enumeration class InvoiceType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum InvoiceType
{
    Buy ("buy"),Sell ("sell");
    String value;
    
    public String toString()
   {
    return value;
   }

    private  InvoiceType(String value)
     {
    this.value=value;
   }
}
