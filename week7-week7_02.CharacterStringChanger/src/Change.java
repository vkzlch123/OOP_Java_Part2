/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juny9
 */
public class Change {
    private char fromCharacter;
    private char toCharacter;
    private String characterString="";
    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    public String change(String characterString){
//        for(int i = 0; i < characterString.length(); i++){
//            char charOfString = characterString.charAt(i);
//            if(charOfString == this.fromCharacter){
//                this.characterString += this.toCharacter;
//            }
//            else {
//                this.characterString += charOfString;
//            }
//        }
//        return this.characterString;
        return characterString.replace(fromCharacter, toCharacter);
    }
}