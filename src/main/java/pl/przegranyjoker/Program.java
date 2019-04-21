import java.io.*;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner questionAccountsRegister = new Scanner(System.in);

        Log behaviour = new Log();

        System.out.println("Welcome, im bot ANDI and I want show you something here");
        behaviour.chatBotQuestions("ANDI", "BOT", "System", "c22", 100);
        System.out.println(" ");
        System.out.println("Hello my friend, I need your information to register account. Can you answer on question?(Y/N)");
        String yesOrNoQuestionRegister = questionAccountsRegister.nextLine();


        if (yesOrNoQuestionRegister.equalsIgnoreCase("y")) {
            System.out.println("Accepted");

        } else if (yesOrNoQuestionRegister.equalsIgnoreCase("n")) {
            System.out.println("Are you sure that you don't want register account here?(y/n)");
            String yesOrNoQuestionRegister2 = questionAccountsRegister.nextLine();

            if (yesOrNoQuestionRegister2.equalsIgnoreCase("n")) {
                System.out.println("Ok, See you later");
            } else if (yesOrNoQuestionRegister2.equalsIgnoreCase("y")) {
                System.out.println("Uff, Ok you can continue register");
            } else {
                System.out.println("Try again, you can write only Y/N");
            }
        } else {
            System.out.println("You can accept or no accepted register. Please try again and write Y/N");
        }

        System.out.println("Please press key and click enter to continue program");
        String personelRegister = questionAccountsRegister.nextLine();

        System.out.println("Answer on questions");
        behaviour.questionsForRegisterAccount();

        System.out.println("Write your password for register account");
        behaviour.passwordAccountRegisterUser();

        System.out.println("Thank your for register account, now your data will save in file TXT");


        try {
            PrintWriter saveDataRegisterAccountUser = new PrintWriter("dataUserRegister.txt");
            saveDataRegisterAccountUser.println("second line too working");
            saveDataRegisterAccountUser.println("third line to write something in note");
            saveDataRegisterAccountUser.close();
            behaviour.saveAll();
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

            System.out.println("Please give your age");
            int age = data.nextInt();
            int ageRight = 105;
            if (age < 105) {
                System.out.println("Great!");
            } else if (age > 105) {
                System.out.println("You cannot have above 105 years");
            } else {
                System.out.println("Write your age");
            }

            while (age > ageRight) {
                System.out.println("Please give your age");
                age = data.nextInt();

            }
            System.out.println("Thank you :) ");

            System.out.println("Please give your height");
            double heightRight = 235;
            double height = data.nextDouble();
            if (height < 235) {
                System.out.println("Great!");
            } else if (height > 235) {
                System.out.println("You cannot have above 235 ");
            } else {
                System.out.println("Write your height");
            }
            while (height > heightRight) {
                System.out.println("Please give your age");
                height = data.nextInt();

            }

            System.out.println("Please give your weight");
            double weightRight = 495;
            double weight = data.nextDouble();
            if (weight < 405) {
                System.out.println("Great!");
            } else if (weight > 405) {
                System.out.println("You cannot have above 405 ");
            } else {
                System.out.println("Write your weight");
            }
            while (weight > weightRight) {
                System.out.println("Please give your age");
                weight = data.nextInt();

            }

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
    }
}

