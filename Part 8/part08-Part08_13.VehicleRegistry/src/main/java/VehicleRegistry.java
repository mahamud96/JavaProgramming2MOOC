/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahamud
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> licensePlateRegister;
    
    public VehicleRegistry(){
        this.licensePlateRegister = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(!(this.licensePlateRegister.containsKey(licensePlate))){
            this.licensePlateRegister.put(licensePlate, owner);
            return true;            
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate){
        return this.licensePlateRegister.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        return this.licensePlateRegister.remove(licensePlate) != null;
    }
    
    public void printLicensePlates(){
        for(LicensePlate licensePlate: this.licensePlateRegister.keySet()){
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> names = new ArrayList<>();
        for(String owner:this.licensePlateRegister.values()){
            if(!(names.contains(owner))){
                names.add(owner);
            }
        }
        
        for(String name:names){
            System.out.println(name);
        }
        
    }
}
