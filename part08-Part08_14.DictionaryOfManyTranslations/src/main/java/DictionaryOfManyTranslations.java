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

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translation;
    
    public DictionaryOfManyTranslations(){
        this.translation = new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.translation.putIfAbsent(word, new ArrayList<>());
        
        ArrayList<String> translations = this.translation.get(word);
        translations.add(translation);
    }
    
    public ArrayList<String> translate(String word){
        if (this.translation.containsKey(word)) {
            return this.translation.get(word);
        }
        return new ArrayList<>();
    }
    
    public void remove(String word){
        this.translation.replace(word, new ArrayList<>());
    }
}
