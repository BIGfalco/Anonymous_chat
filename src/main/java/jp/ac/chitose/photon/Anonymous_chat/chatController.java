package jp.ac.chitose.photon.Anonymous_chat;

import jp.ac.chitose.photon.Anonymous_chat.service.EnqueteService;
import jp.ac.chitose.photon.Anonymous_chat.service.MessageService;
import jp.ac.chitose.photon.Anonymous_chat.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class chatController {

    @Autowired
    private EnqueteService enqueteService;
    @Autowired
    private MessageService messageService;
    @Autowired
    private RoomService roomService;


}
