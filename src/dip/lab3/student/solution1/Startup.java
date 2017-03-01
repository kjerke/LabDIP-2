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
        MessageInput input = new ConsoleReader();
       
        MessageOutput output = new ConsoleWriter();
        
        // MessageOutput output = new GuiWriter();

        MessageService service = new MessageService(input, output);
        
        service.produceMessage();
    }
}




