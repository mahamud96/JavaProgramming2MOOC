/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahamud
 */
import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todoList = todolist;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add: ");
                String item = this.scanner.nextLine();
                
                this.todoList.add(item);
                continue;
            }
            
            if(command.equals("list")){
                this.todoList.print();
                continue;
            }
            
            if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                int item = Integer.valueOf(this.scanner.nextLine());
                this.todoList.remove(item);                
            }

        }

    }

  
}
