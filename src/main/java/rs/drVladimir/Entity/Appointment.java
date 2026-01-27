package rs.drVladimir.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "appointment")
public class Appointment
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonFormat
    private Integer id;

    private String name;

    private String lastname;

    private String email;

    private String mobileNumber;

    private String message;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime createdFor;


}
