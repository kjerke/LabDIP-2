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
public class ConsoleWriter implements MessageOutput{
     public void writeln(String line){
        System.out.println("Message: ");
        System.out.println(line);
    }
}
