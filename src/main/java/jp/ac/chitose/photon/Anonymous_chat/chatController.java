package jp.ac.chitose.photon.Anonymous_chat;

import jp.ac.chitose.photon.Anonymous_chat.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class chatController {

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


        int roomId = 0;
        while(true) {
            roomId++;
            if(!roomService.existsRoomId(roomId)) {
                break;
            }

        }
        roomService.save(roomId,name,pass);
        model.addAttribute("roomName",name);
        model.addAttribute("password",pass);
        model.addAttribute("roomId",roomId);
        return "create/create-after";
    }

    @GetMapping("Login")
    public String login(Model model){
        return "login/login";
    }

    @PostMapping("Logined")
    public String logined(Model model,int id,String pass){
        var room = roomService.getRoom(id);
        if(room.getPassword().equals(pass)){
            model.addAttribute("roomName",room.getRoomName());
            model.addAttribute("roomId",room.getRoomId());
            return "login/login-after";
        }
        return "login/login";
    }


}
