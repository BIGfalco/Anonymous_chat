package jp.ac.chitose.photon.Anonymous_chat;

import jp.ac.chitose.photon.Anonymous_chat.service.EnqueteService;
import jp.ac.chitose.photon.Anonymous_chat.service.MessageService;
import jp.ac.chitose.photon.Anonymous_chat.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class chatController {

    @Autowired
    private EnqueteService enqueteService;
    @Autowired
    private MessageService messageService;
    @Autowired
    private RoomService roomService;

    @GetMapping("index")
    public String index(Model model) {
        return "index/index";
    }

    @GetMapping("Create")
    public String create(Model model) {
        return "create/create";
    }

    @PostMapping("Created")
    public String created(Model model,String name,String pass) {
        model.addAttribute("roomName",name);
        model.addAttribute("password",pass);

        int roomId = 0;
        while(true) {
            var idExists = roomService.existsRoomId(0);
            if(idExists){
                roomId++;
            }
            else{
                break;
            }
        }
        model.addAttribute("roomId",roomId);
        return "create/create-after";
    }


}
