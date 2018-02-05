
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juny9
 */
public class Suitcase {
    private int maximum_weight_limit;
    private List<Thing> things;
    
    public Suitcase(int maximum_weight_limit){
        this.maximum_weight_limit = maximum_weight_limit;
        this.things = new ArrayList<Thing>();
    }
    public void addThing(Thing thing){
        if(this.totalWeight() + thing.getWeight() > this.maximum_weight_limit){
            return;
        }
        this.things.add(thing);
    }
    public String toString() {
        
        switch (this.things.size()){
        case 0:
            return ("empty (0 kg)");
        case 1:
            return ("1 thing ("+ this.totalWeight() + " kg)");
        default:
            return (this.things.size() + " things ("+ this.totalWeight() + " kg)");
        }       
    }
    public void printThings(){
        for(Thing thing : this.things){
            System.out.println(thing);
        }
    }
    public int totalWeight() {
        int weight = 0;
        for(Thing thing : this.things){
            weight += thing.getWeight();
        }
        return weight;
    }
    public Thing heaviestThing(){
        Thing heaviest = null;
        for(Thing thing : this.things){
            if(heaviest == null || heaviest.getWeight() < thing.getWeight()){
            heaviest = thing;
            }
        }
        return heaviest;
    }
}
