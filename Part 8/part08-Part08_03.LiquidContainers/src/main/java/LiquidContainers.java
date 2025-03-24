
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] split = input.split(" ");
            String command = split[0];
            int amount = Integer.valueOf(split[1]);

            if (amount < 0) {
                continue;
            }

            if (command.equals("add")) {
                if (first + amount <= 100) {
                    first += amount;
                } else {
                    first = 100;
                }
            }

            if (command.equals("move")) {
                if (second + amount <= 100 && first - amount >= 0) {
                    second += amount;
                    first -= amount;
                } else if (first - amount < 0) {
                    second += first;
                    first = 0;
                    if (second > 100) {
                        second = 100;
                    }
                } else {
                    second = 100;
                    first -= amount;
                }
            }
            
            if(command.equals("remove")){
                if (second - amount >= 0) {
                    second -= amount;
                } else {
                    second = 0;
                }
            }

        }
    }

}
