package rs.drVladimir.Entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "image")
@NoArgsConstructor
@Getter
@Setter
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


    //    Not sure why I actually need hardcoded getters cuz I implemented them using
    //    lombok, but I guess they do not work

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public double getSize() {
        return size;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public FILE_TYPE getExtns() {
        return extns;
    }

}
