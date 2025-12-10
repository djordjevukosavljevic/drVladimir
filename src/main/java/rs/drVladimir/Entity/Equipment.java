package rs.drVladimir.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity(name = "equipment")
@NoArgsConstructor
public class Equipment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @JsonFormat
    private int id;
    @Column(name = "deviceName")
    @JsonFormat
    private String deviceName;
    @Column(name = "deviceCode")
    @JsonFormat
    private String deviceCode;
    @Column(name = "description")
    @JsonFormat
    private String description;
}
