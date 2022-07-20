package Chapter9.Ex10;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final int socialNumber;

    public Employee(String firstName, String lastName, int socialNumber){

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialNumber = socialNumber;

    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getSocialNumber(){
        return socialNumber;
    }

    public String toString(){
        return String.format("%s: %s %s, %s: %d", "Employee", getFirstName(),getLastName(), "social number", getSocialNumber());
    }

}
