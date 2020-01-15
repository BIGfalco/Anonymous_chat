package jp.ac.chitose.photon.Anonymous_chat.form;

public class Message {

    private String userId;

    private String message;

    private int roomId;

    private String timeStamp;

    public Message(String userId,  String message, int roomId, String timeStamp) {
        this.userId = userId;
        this.message = message;
        this.roomId = roomId;
        this.timeStamp = timeStamp;
    }

    public Message() {
        this.userId = "";
        this.message = "";
        this.roomId = -1;
        this.timeStamp = "";
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
