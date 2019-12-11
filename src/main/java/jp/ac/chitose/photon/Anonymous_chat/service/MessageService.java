package jp.ac.chitose.photon.Anonymous_chat.service;

import jp.ac.chitose.photon.Anonymous_chat.entity.Message;

import java.util.Optional;

public interface MessageService {

    //Optional<Message> findById(String userId);

    void saveMessage(Message message);

    void deleteMessage(Message message);
}
