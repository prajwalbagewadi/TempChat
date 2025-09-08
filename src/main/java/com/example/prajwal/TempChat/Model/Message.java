package com.example.prajwal.TempChat.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
@Data
@AllArgsConstructor
public class Message {
    private int userId;
    private String data;
    private LocalDateTime time;
    private String status;

    public Message(){

    }
    //setter
    public void setTime() {
        this.time = LocalDateTime.now();
    }
    public void setStatus(String stat){
        this.status=stat;
    }

    //getter
    public LocalDateTime getTime() {
        return time;
    }
    public String getStatus(){
        return status;
    }
}
