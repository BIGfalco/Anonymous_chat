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

}
