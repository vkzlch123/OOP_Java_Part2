
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Mikael");
        printWithSmileys("Arto");
        printWithSmileys("Matti");
    }
    private static void printWithSmileys(String characterString){
        String middleString = createMiddleString(characterString);
        int number = middleString.length() / 2 + 2;
        printSmileys(number);
        System.out.println(":)" + middleString + ":)");
        printSmileys(number);
}
    private static void printSmileys(int number){
        for(int i = 0; i < number; i++){
            System.out.print(":)");
        }
        System.out.println();
    }
    private static String createMiddleString(String characterString){
        String middleString = " " + characterString + " ";
        if(middleString.length() % 2 == 1){
            middleString += " ";
        }
        return middleString;
    }

}
