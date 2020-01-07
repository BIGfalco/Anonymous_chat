package jp.ac.chitose.photon.Anonymous_chat.form;

public class Enquate {

    private String message;

    private int votes;

    private String deadLine;

    public Enquate(String message, int votes, String deadLine) {
        this.message = message;
        this.votes = votes;
        this.deadLine = deadLine;
    }

    public Enquate() {
        this.message = null;
        this.votes = -1;
        this.deadLine = null;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        votes = votes;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }
}
