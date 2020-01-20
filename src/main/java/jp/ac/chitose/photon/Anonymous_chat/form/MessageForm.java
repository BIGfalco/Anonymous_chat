package jp.ac.chitose.photon.Anonymous_chat.form;

public class MessageForm {

    private String messageForm;

    private String timeStamp;

    private String id;

    public MessageForm(String messageForm, String timeStamp, String id) {
        this.messageForm = messageForm;
        this.timeStamp = timeStamp;
        this.id = id;
    }

    public MessageForm() {
        this.messageForm = "";
        this.timeStamp = "";
        this.id = "";
    }

    public String getMessageForm() {
        return messageForm;
    }

    public void setMessageForm(String messageForm) {
        this.messageForm = messageForm;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String session) {
        this.id = session;
    }
}
