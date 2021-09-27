package com.company;

public class Group extends Observable{

    private Message currentMessage;

    public Group(){

    }

    public Group(Message message) {
        this.currentMessage = message;
    }

    public  Message getCurrentMessage(){
        return currentMessage;
    }

    public  void setCurrentMessage(Message newMessage){
        this.currentMessage = newMessage;
        System.out.println("A new message was posted");
        this.sendMessage(currentMessage );
    }
}
