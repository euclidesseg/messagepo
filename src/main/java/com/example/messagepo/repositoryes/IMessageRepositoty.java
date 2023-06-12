package com.example.messagepo.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.messagepo.models.MessageModel;

@Repository
public interface IMessageRepositoty extends JpaRepository<MessageModel, Long>{
    
}
