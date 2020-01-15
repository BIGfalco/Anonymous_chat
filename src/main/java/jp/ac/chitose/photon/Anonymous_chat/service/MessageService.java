package jp.ac.chitose.photon.Anonymous_chat.service;

import jp.ac.chitose.photon.Anonymous_chat.form.Message;
import jp.ac.chitose.photon.Anonymous_chat.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public void save(String userId, String message, int roomId, String timestamp) {
        messageRepository.insert(new Message(userId,message,roomId,timestamp));
    }

    public List<Message> findAll() {
        return messageRepository.select();
    }
}
