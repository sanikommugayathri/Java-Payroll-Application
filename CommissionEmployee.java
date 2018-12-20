public class CommissionEmployee extends Employee
{
   //instance variable grossSales of type double 
   private double grossSales; 
   
   //instance variable commissionrate oof type double
   private double commissionRate; 

   // constructor to initialize the instance variables
   public CommissionEmployee(String firstName, String lastName,String socialSecurityNumber, double grossSales, double commissionRate)
   {
      super(firstName, lastName, socialSecurityNumber);

      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate if commissionrate is less than equal to 0 or greater than equal to 1
         throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

      if (grossSales < 0.0) // validate if grosssales is less than 0
         throw new IllegalArgumentException("Gross sales must be >= 0.0");

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 

   // set method for gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   } 

   // get method for gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } 

   // set method for commission rate
   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
         throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   } 

   // get method for commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   } 

   // calculate earnings; override abstract method earnings in Employee
   @Override   
   //get method for getPaymentAmount
   public double getPaymentAmount()                                            
   {                                                                   
      return getCommissionRate() * getGrossSales();                    
   }                                             

   // return String representation of CommissionEmployee object
   @Override                                                   
   public String toString()                                    
   {                                                           
      return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",    
         "commission employee", super.toString(),              
         "gross sales", getGrossSales(),                       
         "commission rate", getCommissionRate());             
   } 
} // end class CommissionEmployee



