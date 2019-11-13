package jp.ac.chitose.photon.Anonymous_chat.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="MESSAGE")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ユーザID")
    private String userID;

    @Column(name="ルームID")
    private Integer roomID;

    @Column(name="メッセージ")
    private String message;

}
