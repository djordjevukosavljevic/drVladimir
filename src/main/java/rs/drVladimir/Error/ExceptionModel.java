package rs.drVladimir.Error;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ExceptionModel
{

    private String name;

    private String message;

    private String path;

    public ExceptionModel()
    {

    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
