
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            cube(Integer.valueOf(input));
        }

    }
    
    public static void cube(int num){
        System.out.println(num * num * num);
    }
}
