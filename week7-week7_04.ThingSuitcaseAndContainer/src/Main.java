public class Main {
 
   public static void main(String[] Container) {
        Container container = new Container(1000);
        
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
 
    public static void addSuitcasesFullOfBricks(Container container) {
        // Add 100 suitcases with everyone containing one brick inside
        for (int weight = 1; weight <= 100; weight++) {
            Thing thing = new Thing("Brick", weight);
 
            Suitcase suitcase = new Suitcase(weight);
            suitcase.addThing(thing);
            container.addSuitcase(suitcase);
        }
    }
}
