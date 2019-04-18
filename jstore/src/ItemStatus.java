
/**
 * Enumeration class ItemStatus - write a description of the enum class here
 *
 * @author (Naufal Ikhsan)
 * @version (version number or date here)
 */
public enum ItemStatus
{
     New
    {
        public String toString()
        {
            return "New";
        }
    },
    Second
    {
        public String toString()
        {
            return "Second";
        }
    },
    Refurbished
    {
        public String toString()
        {
            return "Refurbished";
        }
    },
    Sold
    {
        public String toString()
        {
            return "Sold";
        }
    }
}
