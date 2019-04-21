package pl.przegranyjoker;

import java.io.*;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome, im bot ANDI and I want show you something here");
        Log.chatBotQuestions("ANDI", "BOT", "System", "c22", 100);
        System.out.println(" ");
        System.out.println("Hello my friend, I need your information to register account. Can you answer on question?(Y/N)");
        String response = input.nextLine();


        if (response.equalsIgnoreCase("y")) {
            System.out.println("Accepted");

        } else if (response.equalsIgnoreCase("n")) {
            System.out.println("Are you sure that you don't want register account here?(y/n)");
            response = input.nextLine();

            if (response.equalsIgnoreCase("n")) {
                System.out.println("Ok, See you later");
            } else if (response.equalsIgnoreCase("y")) {
                System.out.println("Uff, Ok you can continue register");
            } else {
                System.out.println("Try again, you can write only Y/N");
            }
        } else {
            System.out.println("You can accept or no accepted register. Please try again and write Y/N");
        }

        System.out.println("Please press key and click enter to continue program");
        input.nextLine();

        System.out.println("Answer on questions");
        Log.questionsForRegisterAccount();

        System.out.println("Write your password for register account");
        Log.passwordAccountRegisterUser();

        System.out.println("Thank your for register account, now your data will save in file TXT");


        try {
            PrintWriter saveDataRegisterAccountUser = new PrintWriter("dataUserRegister.txt");
            saveDataRegisterAccountUser.println("second line too working");
            saveDataRegisterAccountUser.println("third line to write something in note");
            saveDataRegisterAccountUser.close();
            Log.saveAll();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }

    public static class Log {


        public static void chatBotQuestions(String name, String surname, String username, String password, int age) {
            System.out.println(name + " " + surname + " " + age + " " + username + " " + password);
            if (name == "ANDI") {
                System.out.println("Start program..");
            } else {
                System.out.println("Something went wrong..");
            }
        }

        public static void questionsForRegisterAccount() {
            Scanner data = new Scanner(System.in);

            System.out.println("Please give name");
            String name = data.nextLine();

            System.out.println("Please give surname");
            String surname = data.nextLine();

            int age = (int) fetchValue(data, "Please give your age", 105);
            double height = fetchValue(data, "Please give your height", 235);
            double weight = fetchValue(data, "Please give your weight", 495);

            System.out.println("Done, Congratulation your account is active");

            System.out.println("\n name: " + name +
                    "\n surname: " + surname +
                    "\n age: " + age +
                    "\n height: " + height +
                    "\n weight: " + weight);

            try {
                if (age < 18) {
                    System.out.println("You should have above 18 years old");
                }
                ;
            } catch (Exception e) {
                System.out.println("Something went wrong");
            }
        }

        public static void passwordAccountRegisterUser() {

            Scanner password = new Scanner(System.in);
            String passwordRegisterAccount = password.nextLine();
            String testing = passwordRegisterAccount.replaceAll("[a-zA-Z0-9]", "*");
            System.out.println(testing);
        }

        public static void saveAll() {

            System.out.println("Saving..");
        }

        private static double fetchValue(Scanner input, String instruction, double upperLimit) {
            while (true) {
                System.out.println(instruction);
                double value = input.nextDouble();
                if (value < 0) {
                    System.out.println("Negative values not allowed");
                } else if (value > upperLimit) {
                    System.out.println("Maximum value allowed: " + upperLimit);
                } else {
                    System.out.println("Great!");
                    return value;
                }
            }
        }
    }
}

