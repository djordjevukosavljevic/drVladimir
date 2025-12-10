package rs.drVladimir.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

@Entity(name = "appointment")
public class Appointment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @JsonFormat
    private int id;
}
