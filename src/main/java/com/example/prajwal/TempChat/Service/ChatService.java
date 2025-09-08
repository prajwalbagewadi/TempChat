package com.example.prajwal.TempChat.Service;

import com.example.prajwal.TempChat.Model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {
    @Autowired
    Message clock;

    List<Message> msg = new ArrayList<Message>();

    public LocalDateTime getTime(){
        clock.setTime();
        return clock.getTime();
    }

    public String addMsg(Message text){
        text.setTime();
        text.setStatus("sent");
        msg.add(text);
        return "msg sent successful.";
    }

    public List<Message> getMsg(){
        return msg;
    }
}
