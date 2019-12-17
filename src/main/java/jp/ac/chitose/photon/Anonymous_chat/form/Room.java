package jp.ac.chitose.photon.Anonymous_chat.form;

public class Room {
    private int roomId;

    private String roomName;

    private String password;

    public Room(int roomId, String roomName, String password) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.password = password;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
