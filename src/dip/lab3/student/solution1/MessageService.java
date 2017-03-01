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
public class MessageService {
    private MessageInput input;
    private MessageOutput output;
    
    public MessageService(MessageInput reader, MessageOutput writer){
        this.input = reader;
        this.output = writer;
    }
    
    public void produceMessage(){
        output.writeln(input.readMessage());
    }

    public MessageInput getInput() {
        return input;
    }

    public void setInput(MessageInput input) {
        this.input = input;
    }

    public MessageOutput getOutput() {
        return output;
    }

    public void setOutput(MessageOutput output) {
        this.output = output;
    }
    
    
}
