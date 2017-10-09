package main.java;

public abstract class Person implements Greeter{
    protected String firstName;
    protected String lastName;

    public Person (String firstName, String lastName) {
        try {
            this.firstName = firstName;
            this.lastName = lastName;
        } catch (IllegalArgumentException e) {
            System.out.println("Either first or last name is null.");
        }
    }

    @Override
    public String sayHello() {
        return "Hello from " + firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
