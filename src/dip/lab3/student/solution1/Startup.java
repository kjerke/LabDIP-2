/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author kevinjerke
 */
public class Startup {
    public static void main(String[] args) {
        Input input = new MessageReader();
        Output output = new ConsoleWriter();
        
        Messager message1 = new Messager(input, output);
        
        message1.produceMessage();
    }
}




