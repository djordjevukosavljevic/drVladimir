package rs.drVladimir.Entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "image")
public class Image
{
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    @JsonFormat
    public Integer id;
    @Column(name = "name")
    @JsonFormat
    public String name;
    @Column(name = "path")
    @JsonFormat
    public String path;
    @Column(name = "size")
    @JsonFormat
    public double size;
    @Column(name = "created_at")
    @JsonFormat
    public LocalDateTime createAt = LocalDateTime.now();
    @Column(name = "extns")
    @JsonFormat
    public FILE_TYPE extns;
    private enum FILE_TYPE {JPG, JPEG, PNG, SVG}
}
