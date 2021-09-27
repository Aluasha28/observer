package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Group group = new Group();

        Subsriber subsriber1 = new Subsriber("Alua");
        Subsriber subsriber2 = new Subsriber("Venti");
        Subsriber subsriber3 = new Subsriber("Dulic");

        group.subscribe(subsriber1);
        group.subscribe(subsriber3);

        group.setCurrentMessage(new Message("hello"));

        group.unsubscribe(subsriber1);
        group.unsubscribe(subsriber2);

        group.setCurrentMessage(new Message("leaving"));
    }
}
