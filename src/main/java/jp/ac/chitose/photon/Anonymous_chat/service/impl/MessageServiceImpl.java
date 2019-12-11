package jp.ac.chitose.photon.Anonymous_chat.service.impl;

import jp.ac.chitose.photon.Anonymous_chat.entity.Message;
import jp.ac.chitose.photon.Anonymous_chat.repository.MessageRepository;
import jp.ac.chitose.photon.Anonymous_chat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageRepository messageRepository;

    @Autowired
    MessageService messageService;

    @Override
    public void saveMessage(Message message) {
        messageRepository.save(message);
    }

    @Override
    public void deleteMessage(Message message) {
        messageRepository.delete(message);
    }

    /*
    @Override
    public Optional<Message> findById(String userId) {
        return messageRepository.findById(userId);
    }*/
    
}
