package jp.ac.chitose.photon.Anonymous_chat.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ROOM")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ルームID")
    private int roomID;

    @Column(name="ルーム名")
    private String roomName;

    @Column(name="パスワード")
    private String password;

    public Room(int roomID, String roomName, String password) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.password = password;
    }

    public Room(){
        this.roomID = 0;
        this.roomName = "";
        this.password = "";
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
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
