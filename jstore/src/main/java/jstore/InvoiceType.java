package jstore;


public enum InvoiceType
{
    Buy("Buy"),Sell("Sell");
    String list;
    
    InvoiceType(String type)
    {
        this.list=type;
    }
    
    public String toString()
    {
        return list;
    }
}
