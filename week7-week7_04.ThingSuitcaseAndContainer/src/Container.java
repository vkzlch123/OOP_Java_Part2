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
public class Container {
    private List<Suitcase> suitcases;
    private int maxWeight;
 
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }
 
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() > maxWeight) {
            return;
        }
 
        this.suitcases.add(suitcase);
    }

    public int totalWeight() {
        int weight = 0;
        for (Suitcase suitcase : this.suitcases) {
            weight += suitcase.totalWeight();
        }
 
        return weight;
    }
    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "empty (0 kg)";
        }
 
        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }
 
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    
    public void printThings(){
        for(Suitcase suitcase : this.suitcases){
            suitcase.printThings();
        }
    }
}
