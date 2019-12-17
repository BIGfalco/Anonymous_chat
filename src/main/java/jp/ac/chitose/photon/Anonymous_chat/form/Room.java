package jp.ac.chitose.photon.Anonymous_chat.form;

public class Room {
    private int roomId;

    private String password;

    private String roomName;



    public Room(int roomId, String password, String roomName) {
        this.roomId = roomId;
        this.password = password;
        this.roomName = roomName;

    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
