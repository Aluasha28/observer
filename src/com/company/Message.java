package com.company;

public class Message {
    private String topic;
    private String content;

    public Message(String topic) {
        this.setTopic(topic);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }


}
