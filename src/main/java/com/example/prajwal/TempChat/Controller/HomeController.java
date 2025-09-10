package com.example.prajwal.TempChat.Controller;

import com.example.prajwal.TempChat.Model.Message;
import com.example.prajwal.TempChat.Service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    ChatService service;

    //@RequestMapping("/")
    @GetMapping("/")
    public String greet() {
        System.out.println("req recived from:");
        return "Helloworld.";
    }

    @GetMapping("/home")
    public String home() {
        System.out.println("home():");
        return "Homepage.";
    }

    @GetMapping("/gettime")
    public LocalDateTime showTime() {
        System.out.println("showTime():");
        return service.getTime();
    }

    @GetMapping("/msg")
    public List<Message> getMsg(){
        System.out.println("getMsg():");
        return service.getMsg();
    }

    @PostMapping("/msg")
    public String sendMsg(@RequestBody Message msg){
        System.out.println("sendMsg():");
//        msg.setTime();
//        msg.setStatus("sent");
        service.addMsg(msg);
        return "msg sent suceessful";
    }
}
