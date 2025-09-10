package com.example.prajwal.TempChat.Service;

import com.example.prajwal.TempChat.Model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ChatService {
    @Autowired
    Message clock;

    //ds to store messages
    //List<Message> msg = new ArrayList<Message>();

    // Stores messages grouped by chatKey, so each chat has its own message list
    HashMap<String,ArrayList<Message>> chatBox = new HashMap<String,ArrayList<Message>>();

    public LocalDateTime getTime(){
        clock.setTime();
        return clock.getTime();
    }

    public String addMsg(Message txt){
        txt.setTime();
        txt.setStatus("sent");
        if(!chatBox.containsKey(txt.getChatKey())){
            chatBox.put(txt.getChatKey(),new ArrayList<Message>());
        }
        //If the chatKey is new, you create an empty ArrayList, but never add the first message into it.
//        else{
//            chatBox.get(txt.getChatKey()).add(txt);
//        }
        //No matter new or old chat, the message must be added.
        chatBox.get(txt.getChatKey()).add(txt);
        return "msg sent successful.";
    }

    public HashMap<String,ArrayList<Message>> getMsg(){
        return chatBox;
    }
}
