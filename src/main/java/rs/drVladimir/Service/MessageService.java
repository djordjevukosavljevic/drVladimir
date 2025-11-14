package rs.drVladimir.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.drVladimir.Entity.Message;
import rs.drVladimir.Repository.MessageRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService
{
    @Autowired
    private final MessageRepository messageRepository;
    public MessageService(MessageRepository messageRepository)
    {
        this.messageRepository = messageRepository;
    }

    public List<Message> getAllMessages()
    {
        return messageRepository.findAll();
    }

    public Optional<Message> findMessageById(Integer id)
    {
        return messageRepository.findById(id);
    }
}
