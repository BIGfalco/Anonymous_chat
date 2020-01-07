package jp.ac.chitose.photon.Anonymous_chat.form;

public class Message {

    private String message;

    private String timeStamp;

    public Message(String message, String timeStamp) {
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public Message() {
        this.message = null;
        this.timeStamp = null;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
