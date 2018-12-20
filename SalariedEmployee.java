public class SalariedEmployee extends Employee
{
    //instance variable weeklysalar of type double
     private double weeklySalary;

   // constructor for initializing the variables from employee and salariedemployee
   public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary)
   {
      super(firstName, lastName, socialSecurityNumber); 

      if (weeklySalary < 0.0)
         throw new IllegalArgumentException("Weekly salary must be >= 0.0");//if weeklysalary is less than 0 it throws an argument.

      this.weeklySalary = weeklySalary;
   } 

   // set method for weeklysalary
   public void setWeeklySalary(double weeklySalary)
   {
      if (weeklySalary < 0.0)
         throw new IllegalArgumentException("Weekly salary must be >= 0.0");//if weeklysalary is less than 0 it throws an argument exception

      this.weeklySalary = weeklySalary;
   } 

   // get method for weeklysalary
   public double getWeeklySalary()
   {
      return weeklySalary;
   } 

   // calculate earnings; implement interface Payable method that was
   // abstract in superclass Employee                                
   //get method for paymentAmount
   public double getPaymentAmount()                                  
   {                                                                 
      return getWeeklySalary();                                      
   } 

   // return String representation of SalariedEmployee object   
   @Override                                                    
   public String toString()                                     
   {                                                            
      return String.format("salaried employee: %s%n%s: $%,.2f",
         super.toString(), "weekly salary", getWeeklySalary());
   } 
} // end class SalariedEmployee

