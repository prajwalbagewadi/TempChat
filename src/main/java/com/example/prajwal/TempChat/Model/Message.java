package com.example.prajwal.TempChat.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
@Data
@AllArgsConstructor
public class Message {
    private String chatKey; //identifies the room
    //private int userId;
    private int senderId; //who sent
    private int receiverId;  //who receives
    private String data; //msg
    private LocalDateTime time; //timestamp
    private String status; //sent/delivered/seen

    public Message(){

    }
    //setter
    public void setTime() {
        this.time = LocalDateTime.now();
    }
    public void setStatus(String stat){
        this.status=stat;
    }
    public void setChatKey(String chatKey){ this.chatKey=chatKey;}

    //getter
    public LocalDateTime getTime() {
        return time;
    }
    public String getStatus(){
        return status;
    }
    public String getChatKey() {return chatKey;}
}
