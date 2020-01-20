package jp.ac.chitose.photon.Anonymous_chat;

import jp.ac.chitose.photon.Anonymous_chat.form.MessageForm;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @MessageMapping("/endpoint") // エンドポイントの指定
    @SendTo("/topic/greetings") // メッセージの宛先を指定
    public MessageForm greeting(MessageForm messageForm) {
        //TimeUnit.SECONDS.sleep(300);
        return new MessageForm(messageForm.getMessageForm(),messageForm.getTimeStamp(),messageForm.getId());
    }
}
