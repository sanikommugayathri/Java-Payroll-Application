public class PayableInterfaceTest
{
    public static void main(String[] args)
    {
        // create four-element Payable array
      Payable[] payableObjects = new Payable[6];
      
      // populate array with objects that implement Payable
      payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
      payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
      payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
      payableObjects[3] = new HourlyEmployee("Lisa", "Barnes", "888-88-8888", 700.00, 12.00);
      payableObjects[4] = new CommissionEmployee("Shocky", "Takes", "222-22-2222", 200.00, 0.50);
          payableObjects[5] = new BasePlusCommissionEmployee("Hugh", "Mungus", "777-77-7777", 1500.00, 0.50, 200.00);
      System.out.println("Invoices and Employees processed polymorphically:"); 
      // generically process each element in array payableObjects
       for (Payable currentPayable : payableObjects) 
      {
         System.out.println(currentPayable); // invokes toString
         
         // determine whether element is a BasePlusCommissionEmployee
         if (currentPayable instanceof BasePlusCommissionEmployee) 
         {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee payable =  (BasePlusCommissionEmployee) currentPayable;
            payable.setBaseSalary(1.10 * payable.getBaseSalary());
            System.out.printf("new base salary with 10%% increase is: $%,.2f%n",payable.getBaseSalary());
         }
         System.out.printf("earned $%,.2f%n%n", currentPayable.getPaymentAmount());
         
      }
       for (Payable currentPayable : payableObjects) 
      {
         System.out.println(currentPayable); // invokes toString
         
         System.out.printf("earned $%,.2f%n%n", currentPayable.getPaymentAmount());
      }
   } // end main
} // end class PayableInterfaceTest

    
    

