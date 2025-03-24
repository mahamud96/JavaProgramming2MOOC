/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahamud
 */
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;
    
    public TodoList(){
        this.todoList = new ArrayList<>();
    }
    
    public void add(String task){
        this.todoList.add(task);
    }
    
    public void print(){
        int i = 1;
        for(String item:this.todoList){
            System.out.println(i + ": " + item);
            i++;
        }
    }
    
    public void remove(int number){
        this.todoList.remove(number - 1);
    }
    
}
