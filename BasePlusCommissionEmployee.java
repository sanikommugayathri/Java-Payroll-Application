

public class BasePlusCommissionEmployee extends CommissionEmployee 
{
   //instance variable basesalary of type double
   private double baseSalary; 

   // constructor to initialize the instance variables
   public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary)
   {
      super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

      if (baseSalary < 0.0) // validate baseSalary                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
            
      this.baseSalary = baseSalary;                
   }

   // set method for base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0) // validate baseSalary                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
            
      this.baseSalary = baseSalary;                
   } 

   // get method for base salary
   public double getBaseSalary()
   {
      return baseSalary;
   }

   // calculate earnings; override method earnings in CommissionEmployee
   @Override        
   //get method for paymentAmount
   public double getPaymentAmount()                                             
   {                                                                    
      return getBaseSalary() + super.getPaymentAmount();                        
   } 

   // return String representation of BasePlusCommissionEmployee object
   @Override                                                           
   public String toString()                                            
   {                                                                   
      return String.format("%s %s; %s: $%,.2f",                       
         "base-salaried", super.toString(),                            
         "base salary", getBaseSalary());                             
   } 
} // end class BasePlusCommissionEmployee




