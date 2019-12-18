package jp.ac.chitose.photon.Anonymous_chat;

import jp.ac.chitose.photon.Anonymous_chat.form.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.concurrent.TimeUnit;

@Controller
public class GreetingController {

    @MessageMapping("/hello") // エンドポイントの指定
    @SendTo("/topic/greetings") // メッセージの宛先を指定
    public Message greeting(Message message) {
        //TimeUnit.SECONDS.sleep(300);
        return message;
    }
}
