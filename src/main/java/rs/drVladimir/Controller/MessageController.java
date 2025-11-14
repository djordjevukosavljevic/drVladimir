package rs.drVladimir.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.drVladimir.Entity.Message;
import rs.drVladimir.Service.MessageService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/message")
public class MessageController
{
    @Autowired
    private final MessageService messageService;

    public MessageController(MessageService messageService)
    {
        this.messageService = messageService;
    }

    @GetMapping
    public List<Message> getAllMessages()
    {
        return messageService.getAllMessages();
    }

    @GetMapping(path = "/{id}")
    public Optional<Message> findMessageById(Integer id)
    {
        return messageService.findMessageById(id);
    }
}
