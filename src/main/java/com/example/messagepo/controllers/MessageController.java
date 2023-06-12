package com.example.messagepo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.messagepo.models.MessageModel;
import com.example.messagepo.services.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageController {
      @Autowired
        MessageService messageService;

    @GetMapping()

    public List<MessageModel> getMessages(){
        return this.messageService.getAllMessage();
    }

    @PostMapping()
    public MessageModel setMessage(@RequestBody MessageModel message){
        return this.messageService.addMessage(message);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteMessage(@PathVariable("id") long id){
            boolean ok = messageService.deleteMessage(id);
            if(ok){
                return "mensage eliminado correctamente";
            }
            else{
                return "Error eliminanando el mensage";
            }
    }
}
