package com.company;

public class Subsriber implements Observer{

    private String name;
    private Message currentMessage;

    public Subsriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Message message) {
        currentMessage = message;
        System.out.println(name + " has received Message about " + currentMessage.getTopic());
    }
}
