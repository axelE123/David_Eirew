import java.util.Scanner;
public class ConditionalPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Assignment 2: ");
        int age;
        String name;
        System.out.print("What's your name? ");
        name = scanner.nextLine();
        System.out.print("Ok, " + name + ", what's your age? ");
        age = Integer.parseInt(scanner.nextLine());

        if (age < 16){
            System.out.println("You can't drive.");
        }
        else if (age<= 17) {
            System.out.println("You can drive, but not vote.");
        }
        else if (age<= 24) {
            System.out.println("You can vote, but not rent a car.");
        }
        else {
            System.out.println("You can pretty much do anything.");
        }

        System.out.println("");
        System.out.println("Assignment 3:");
        int weight;
        int planet;
        System.out.print("What is your weight on earth? ");
        weight = Integer.parseInt(scanner.nextLine());
        System.out.println("What planet would you like to visit?");
        System.out.println("1: Venus");
        System.out.println("2: Mars");
        System.out.println("3: Jupiter");
        System.out.println("4: Saturn");
        System.out.println("5: Uranus");
        System.out.println("6: Neptune");
        planet = Integer.parseInt(scanner.nextLine());

        if (planet == 1){
            System.out.println("Your weight would be " + (weight * 0.78) + " lbs on Venus");
        }
        else if (planet == 2){
            System.out.println("Your weight would be " + (weight * 0.39) + " lbs on Mars");
        }
        else if (planet == 3){
            System.out.println("Your weight would be " + (weight * 2.65) + " lbs on Jupiter");
        }
        else if (planet == 4){
            System.out.println("Your weight would be " + (weight * 1.17) + " lbs on Saturn");
        }
        else if (planet == 5){
            System.out.println("Your weight would be " + (weight * 1.05) + " lbs on Uranus");
        }
        else if (planet == 6){
            System.out.println("Your weight would be " + (weight * 1.23) + " lbs on Neptune");
        }
        System.out.println("");
        System.out.print("Are you ready for a quiz: ");
        String ready;
        int q_one;
        int q_two;
        int q_three;
        int points = 0;
        ready = scanner.nextLine();
        System.out.println("Okay, here it comes: ");
        System.out.println("");
        System.out.println("What does “www” stand for in a website browser?");
        System.out.println("1) Wireless Wi-Fi Windows");
        System.out.println("2) Wikipedia Wild Wires");
        System.out.println("3) World Wide Web");
        q_one = Integer.parseInt(scanner.nextLine());
        if (q_one == 3){
            System.out.println("That's right");
            points++;
        }
        else{
            System.out.println("No, the answer is World Wide Web");
        }
        System.out.println("");
        System.out.println("How long is an olympic swimming pool in meters");
        System.out.println("1) 60m");
        System.out.println("2) 50m");
        System.out.println("3) 45m");
        q_two = Integer.parseInt(scanner.nextLine());
        if (q_two == 2){
            System.out.println("That's right");
            points++;
        }
        else{
            System.out.println("No, the answer is 50m");
        }
        System.out.println("");
        System.out.println("What shape is generally used for stop signs?");
        System.out.println("1) Octagon");
        System.out.println("2) Circle");
        System.out.println("3) Hectagon");
        q_three = Integer.parseInt(scanner.nextLine());
        if (q_three == 1){
            System.out.println("That's right");
            points++;
        }
        else{
            System.out.println("No, the answer is octagon");
        }
        System.out.println("");
        System.out.println("Overall, you got " + points + " out of 3.");
        System.out.println("Thanks for playing!");
    }
}
