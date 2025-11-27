package rs.drVladimir.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;
import rs.drVladimir.Entity.Message;
import rs.drVladimir.Service.MessageService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/message")
public class MessageController
{
    private final JavaMailSender mailSender;

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService, JavaMailSender mailSender)
    {
        this.messageService = messageService;
        this.mailSender = mailSender;
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

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody Message message)
    {
        messageService.saveMessage(message);
        return ResponseEntity.ok("Messsge sent");
    }

    @DeleteMapping(path = "/{id}")
    public void deleteMessage(@PathVariable Integer id)
    {
        messageService.deleteMessageById(id);
    }





    public String buildEmailBody(Message m)
    {
        return String.format("""
                Nova poruka sa sajta:
                
                Napravljena: %s
                Ime: %s
                Prezime: %s
                Email: %s
                Contact number: %s
                Title: %s
                
                Message: %s
                """, m.getCreatedAt(),m.getName(),m.getLastname(), m.getEmail(), m.getMobileNumber(), m.getSubject(),m.getMessage());
    }


}
