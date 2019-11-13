package jp.ac.chitose.photon.Anonymous_chat.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ENQUETE")
public class Enquete {

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private EnquetePrimaryKey enquetePrimaryKey;

    @Column(name = "メッセージ")
    private String masseage;

    @Column(name = "投票数")
    private int Votes;

    @Column(name = "制限時間")
    private String deadLine;
}
