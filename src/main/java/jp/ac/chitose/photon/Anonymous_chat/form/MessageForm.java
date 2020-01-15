package jp.ac.chitose.photon.Anonymous_chat.form;

public class MessageForm {

    private String messageForm;

    private String timeStamp;

    private String session;

    public MessageForm(String messageForm, String timeStamp) {
        this.messageForm = messageForm;
        this.timeStamp = timeStamp;
        this.session = "";
    }

    public MessageForm() {
        this.messageForm = "";
        this.timeStamp = "";
        this.session = "";
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

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}
