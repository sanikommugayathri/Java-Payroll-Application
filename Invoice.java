public class Invoice implements Payable
{
   //instance variable partNumber of type string
   private final String partNumber; 
   
   //instance variable partdescription of type string
   private final String partDescription;
   
   //instance variable quantity of type int
   private int quantity;
   
   //instace variable priceperitem of type double
   private double pricePerItem;

   // constructor to initialize the instance variables
   public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem)
   {
      if (quantity < 0) // validate quantity
         throw new IllegalArgumentException("Quantity must be >= 0");

      if (pricePerItem < 0.0) // validate pricePerItem
         throw new IllegalArgumentException("Price per item must be >= 0");

      this.quantity = quantity;
      this.partNumber = partNumber;
      this.partDescription = partDescription;
      this.pricePerItem = pricePerItem;
   } // end constructor

   // get method for part number
   public String getPartNumber()
   {
      return partNumber; // should validate
   } 

   // get method for description
   public String getPartDescription()
   {
      return partDescription;
   } 

   // set method for quantity
   public void setQuantity(int quantity)
   {
      if (quantity < 0) // validate quantity
         throw new IllegalArgumentException("Quantity must be >= 0");

      this.quantity = quantity;
   } 

   // get method for quantity
   public int getQuantity()
   {
      return quantity;
   }

   // set method for price per item
   public void setPricePerItem(double pricePerItem)
   {
      if (pricePerItem < 0.0) // validate pricePerItem
         throw new IllegalArgumentException("Price per item must be >= 0");

      this.pricePerItem = pricePerItem;
   } 

   // get method for price per item
   public double getPricePerItem()
   {
      return pricePerItem;
   } 

   // return String representation of Invoice object
   @Override
   public String toString()
   {
      return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", 
         "invoice", "part number", getPartNumber(), getPartDescription(), 
         "quantity", getQuantity(), "price per item", getPricePerItem());
   } 

   // method required to carry out contract with interface Payable     
   @Override         
   //get method for paymentamount
   public double getPaymentAmount()                                    
   {                                                                   
      return getQuantity() * getPricePerItem(); // calculate total cost
   } 
} // end class Invoice
