/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juny9
 */

public class Calculator {
    private int statistics;
    private Reader reader;

    public Calculator(){
        reader = new Reader();
    }
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    private void statistics(){
        System.out.println("Calculations done " + statistics);
    }
    private void sum() {
       System.out.print("value1: ");
       int value1 = reader.readInteger();// read the value using the Reader-object
       System.out.print("value2: ");
       int value2 = reader.readInteger();// read the value using the Reader-object
       // print the value according to the example above
       System.out.println("sum of the values: " + (value1 + value2));
       statistics++;
    }
    private void difference() {
       System.out.print("value1: ");
       int value1 = reader.readInteger();// read the value using the Reader-object
       System.out.print("value2: ");
       int value2 = reader.readInteger();// read the value using the Reader-object
       // print the value according to the example above
       System.out.println("difference of the values: " + (value1 - value2));
       statistics++;
    }
    private void product() {
       System.out.print("value1: ");
       int value1 = reader.readInteger();// read the value using the Reader-object
       System.out.print("value2: ");
       int value2 = reader.readInteger();// read the value using the Reader-object
       // print the value according to the example above
       System.out.println("product of the values: " + (value1 * value2));
       statistics++;
    }
    
    
}
