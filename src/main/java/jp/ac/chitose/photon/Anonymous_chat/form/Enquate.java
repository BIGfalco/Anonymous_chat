package jp.ac.chitose.photon.Anonymous_chat.form;

public class Enquate {

    private String message;

    private int Votes;

    private String deadLine;

    public Enquate(String message, int votes, String deadLine) {
        this.message = message;
        Votes = votes;
        this.deadLine = deadLine;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getVotes() {
        return Votes;
    }

    public void setVotes(int votes) {
        Votes = votes;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }
}
