package rs.drVladimir.Entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity(name = "message")
public class Message
{

    @Id
    @Column(name = "id")
    @JsonFormat
    private Integer id;
    @Column(name = "date_created_at")
    @JsonFormat
    private LocalDateTime dateCreatedAt = LocalDateTime.now();
    @Column(name = "name")
    @JsonFormat
    private String name;
    @Column(name = "lastname")
    @JsonFormat
    private String lastname;
    @Column(name = "email")
    @JsonFormat
    private String email;
    @Column(name = "mobile_number")
    @JsonFormat
    private String mobileNumber;

    private String subject;

    private String message;
}
