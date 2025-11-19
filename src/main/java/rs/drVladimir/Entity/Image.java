package rs.drVladimir.Entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "image")
public class Image
{
    @Id
    @Column(name = "image_id")
    @JsonFormat
    public Integer id;
    @Column(name = "imgName")
    @JsonFormat
    public String imgName;
    @Column(name = "path")
    @JsonFormat
    public String path;
    @Column(name = "size")
    @JsonFormat
    public double size;
    @Column(name = "filetype")
    public FILE_TYPE filetype;

    private enum FILE_TYPE {JPG, JPEG, PNG}
}
