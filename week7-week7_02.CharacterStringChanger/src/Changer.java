/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juny9
 */
import java.util.ArrayList;    // imports ArrayList
import java.util.List;            // imports all tools from java.util, including ArrayList, Scanner ja Random

public class Changer {
    private ArrayList<Change> changes = new ArrayList<Change>();
    public Changer(){
        
    }
    public void addChange(Change change){
        changes.add(change);
    }
    public String change(String characterString){
        String word = characterString;
        for(Change Change: changes) {
            word = Change.change(word);
        }
        return word;
    }
    
}
