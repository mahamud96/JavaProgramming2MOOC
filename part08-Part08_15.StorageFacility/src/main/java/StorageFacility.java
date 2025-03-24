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
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageUnit;
    
    public StorageFacility(){
        this.storageUnit = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.storageUnit.putIfAbsent(unit, new ArrayList<>());
        
        this.storageUnit.get(unit).add(item);            
    }
    
    public ArrayList<String> contents(String storageUnit){
        if(this.storageUnit.get(storageUnit) == null){
            return new ArrayList<>();
        }
        return this.storageUnit.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item){
        if(this.storageUnit.get(storageUnit).contains(item)){
            this.storageUnit.get(storageUnit).remove(item);
        }
        if(this.storageUnit.get(storageUnit).isEmpty()){
            this.storageUnit.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> storageUnits = new ArrayList<>();
        for(String unit:this.storageUnit.keySet()){
            storageUnits.add(unit);
        }
        return storageUnits;
    }
}
