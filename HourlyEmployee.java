public class HourlyEmployee extends Employee 
{
    //instance variable wage of type double
    private double wage; 
    
    //instance variable hours of type double
    private double hours; 

    // constructor to initialize the instance variables
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours)
    {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");

        if ((hours < 0.0) || (hours > 168.0)) // validate hours
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");

        this.wage = wage;
        this.hours = hours;
    } 

    // set method for wage
    public void setWage(double wage)
    {
        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException( "Hourly wage must be >= 0.0");

        this.wage = wage;
    } 

    // get method for wage
    public double getWage()
    {
       return wage;
    } 

    // set method for hours worked
    public void setHours(double hours)
    {
        if ((hours < 0.0) || (hours > 168.0)) // validate hours
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");

        this.hours = hours;
    } 

    // get method for hours worked
    public double getHours()
    {
        return hours;
    } 

    // calculate earnings; override abstract method earnings in Employee
    @Override    
    //get method for paymentamount
    public double getPaymentAmount()                                            
    {                                                                   
        if (getHours() <= 40) // no overtime 
            return getWage() * getHours();                                
        else                                                             
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }                                          

    // return String representation of HourlyEmployee object              
    @Override                                                             
    public String toString()                                              
    {                                                                     
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",super.toString(), "hourly wage", getWage(), "hours worked", getHours());                                   
    }                                    
} // end class HourlyEmployee



