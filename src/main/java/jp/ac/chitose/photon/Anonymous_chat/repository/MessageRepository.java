package jp.ac.chitose.photon.Anonymous_chat.repository;

import jp.ac.chitose.photon.Anonymous_chat.entity.Message;
import jp.ac.chitose.photon.Anonymous_chat.entity.MessagePrimarykey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, MessagePrimarykey> {

}
