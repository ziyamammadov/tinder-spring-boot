package application.service;

import application.entity.Message;
import application.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageDbService {
    private final MessageRepository messageRepo;

    @Autowired
    public MessageDbService(MessageRepository messageRepo) {
        this.messageRepo = messageRepo;
    }

    public Iterable<Message> get_all() {
        return messageRepo.findAll();
    }

    public Message get_one(long id) {
        return messageRepo.findById(id).orElse(null);
    }

    public void put_one(Message message) {
        messageRepo.save(message);
    }

    public void delete_one(long id) {
        messageRepo.deleteById(id);
    }
}
