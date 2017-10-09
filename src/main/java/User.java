package main.java;

public class User extends Person{

    protected boolean isAdmin;

    public static void main(String[] args) {
        User joyce = new User ("Joyce", "Ling", true);
        System.out.println(joyce.sayHello());
    }

    public User (String firstName, String lastName, boolean isAdmin) {
        super(firstName, lastName);
        try {
        this.isAdmin = isAdmin;
        } catch (IllegalArgumentException e) {
            System.out.println("Either first or last name is null.");
        }
    }

    public boolean isAdmin() {
        if (isAdmin) {
            return true;
        }

        return false;
    }

}
