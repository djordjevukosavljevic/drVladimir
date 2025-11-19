package rs.drVladimir.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.drVladimir.Service.ImageService;

@RestController
@RequestMapping(path = "/api/image")
public class ImageController
{
    @Autowired
    private final ImageService imageService;

    public ImageController(ImageService imageService)
    {
        this.imageService = imageService;
    }

}
