public abstract class Employee implements Payable
{
    //instance variable firstnamw of type String
    private final String firstName;
    
    //instance variable lastname of type string
    private final String lastName;
    
    //instance variable socialsecuritynumber of type string
    private final String socialSecurityNumber;

    //constructor that initilaizes the instance variables
    public Employee(String firstName, String lastName, String socialSecurityNumber) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //get method for firstname
    public String getFirstName() 
    {
        return firstName;
    }

    //get method for lastname
    public String getLastName() 
    {
        return lastName;
    }

    //get method for socialsecuritynumber
    public String getSocialSecurityNumber() 
    {
        return socialSecurityNumber;
    }
    
    //method for string format
    public String toString()
    {
        return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
     
}
