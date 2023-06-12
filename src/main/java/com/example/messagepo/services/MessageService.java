package com.example.messagepo.services;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.messagepo.models.MessageModel;
import com.example.messagepo.repositoryes.IMessageRepositoty;

@Service
public class MessageService {
    
    @Autowired
    IMessageRepositoty messageRepositori;



    public List<MessageModel> getAllMessage(){
        List<MessageModel> lista;
        lista = messageRepositori.findAll();
        return lista;
    }

    // public ArrayList<MessageModel> getAllMessage(){
    //     return (ArrayList <MessageModel>) messageRepositori.findAll();
    
    // }

    /*
     * 
     * En el segundo ejemplo, estás utilizando el casting (ArrayList<MessageModel>) 
     * para realizar un cast directo del resultado de messageRepositori.findAll()
     * a ArrayList<MessageModel>
     */

    



     public MessageModel addMessage(MessageModel message){
        return this.messageRepositori.save(message);
     }
      
     public boolean deleteMessage(long id){
        try{
            messageRepositori.deleteById(id);
            return true;
        }catch(RuntimeException exec){
            return false;
        }
     }
}
