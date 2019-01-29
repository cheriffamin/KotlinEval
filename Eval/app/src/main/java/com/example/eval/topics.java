package com.example.eval;

public class topics {

    private String id;
    private String topic_title;
    private String topic_content;
    private String topic_messages;


    public topics(String id, String topic_title, String topic_content, String topic_messages) {
        this.id = id;
        this.topic_title = topic_title;
        this.topic_content = topic_content;
        this.topic_messages = topic_messages;
    }

    public String getId() {
        return id;
    }

    public String getTopic_title() {
        return topic_title;
    }

    public String getTopic_content() {
        return topic_content;
    }

    public String getTopic_messages() {
        return topic_messages;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTopic_title(String topic_title) {
        this.topic_title = topic_title;
    }

    public void setTopic_content(String topic_content) {
        this.topic_content = topic_content;
    }

    public void setTopic_messages(String topic_messages) {
        this.topic_messages = topic_messages;
    }
}