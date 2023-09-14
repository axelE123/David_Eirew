import java.util.Scanner;
public class VariablePractice {
    static void line() {
        System.out.print("+");
        for (int i = 0; i < 38; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public static void main(String[] args) {
        System.out.println("Problem 1");
        int room_num = 113;
        double e_value = 2.71828;
        String class_name = "Computer Science";

        System.out.println("This is room # " + room_num);
        System.out.println("e is close to " + e_value);
        System.out.println("I am learning a bit about " + class_name);

        System.out.println();
        System.out.println("Problem 2");
        String[] teachers = {"Mr. Alves", "N/A", "Mr. Zaremba", "Ms. McCartin", "Mr. Wilkie", "Ms. Silvers", "Ms. Reed", "Ms. Reed"};
        String[] lessons = {"Law 12", "Spare", "Coding 12", "French 12", "AP Bio 12", "English 12", "Calculus 12", "Pre-Calculus 12"};

        line();
        for (int i = 0; i < 8; i++) {
            System.out.print("| " + (i + 1) + " |");
            for (int p = 0; p < (15 - teachers[i].length()); p++) {
                System.out.print(" ");
            }
            System.out.print(teachers[i]);
            System.out.print(" | ");
            for (int z = 0; z < (15 - lessons[i].length()); z++) {
                System.out.print(" ");
            }
            System.out.print(lessons[i]);
            System.out.println(" |");

        }
        line();

        System.out.println();
        System.out.println("Problem 3");
        Scanner scanner = new Scanner(System.in);
        int hotdogs;
        int drinks;
        System.out.print("How many hotdogs would you like? ");
        hotdogs = Integer.parseInt(scanner.nextLine());
        System.out.print("How many drinks would you like? ");
        drinks = Integer.parseInt(scanner.nextLine());

        double total = ( hotdogs * 5.50 + drinks * 2 ) * 1.12;
        total = Math.round(total * 100.0) / 100.0;
        System.out.println("Your total after tax is $" + total);
    }
}