/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Random;

/**
 *
 * @author kevinjerke
 */
public class MessageArrayInput implements MessageInput{
    private String[] messages = {"Hello", "Goodbye"};
   
   public String readMessage() {
       Random r = new Random(System.currentTimeMillis());
       String message = messages[r.nextInt(0) + 2];
       return message;
   }
}
