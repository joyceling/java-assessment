package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assessment {
    public static void main(String[] args) {
        ////////////
        // SQUARE //
        ////////////

        // 5 * 5 = 25
        System.out.println("\nThis is 5 squared:");
        System.out.println(square(5));

        /////////
        // SUM //
        /////////

        // 1 + 5 = 6
        System.out.println("\nThis is 1 plus 5:");
        System.out.println(sum(1, 5));
        // 1.5234 + 1232 = 1233.5234
        System.out.println("\nThis is 1.5234 plus 1232:");
        System.out.println(sum(1.5234, 1232));

        /////////////
        // AVERAGE //
        /////////////

        // average: 5.5
        System.out.println("\nThis is the average of one through ten:");
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(average(numbersArray));

        ///////////
        // USERS //
        ///////////

        User joyceling = new User("joyce","Ling", true);
        User boblong = new User("Bob", "long", false);
        User jerryterry = new User("jerry", "terry", false);

        List<User> userList = new ArrayList<User>();
        userList.add(joyceling);
        userList.add(boblong);
        userList.add(jerryterry);


        System.out.println("\nThis is the old list of users:");
        for (User user : userList) {
            System.out.println(user.getFirstName() + " " +user.getLastName());
        }



        List<User> newUserList = capitalizeRecords(userList);

        System.out.println("\nThis is the new list of capitalized users:");
        for (User user : newUserList) {
            System.out.println(user.getFirstName() + user.getLastName());
        }


    }

    public static int square (int number) {
        int squared = number * number;
        return squared;
    }

    public static int sum (int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    public static double sum (double number1, double number2) {
        double sum = number1 + number2;
        return sum;
    }

    public static double average (int[] numbersArray) {
        int sum = 0;

        for (int number : numbersArray) {
            sum = number + sum;
        }

        double average = (double) sum/numbersArray.length;
        return average;
    }

    public static List<User> capitalizeRecords (List<User> Users) {

        for (User user : Users) {
            if (!user.getFirstName().substring(0,1).equals(user.getFirstName().substring(0,1).toUpperCase()) || !user.getLastName().substring(0,1).equals(user.getLastName().substring(0,1).toUpperCase())) {

                    user.setFirstName(user.getFirstName().substring(0,1).toUpperCase() + user.getFirstName().substring(1));
                    user.setLastName(" " + user.getLastName().substring(0,1).toUpperCase() + user.getLastName().substring(1));

            }
        }

        return Users;

    }

}
