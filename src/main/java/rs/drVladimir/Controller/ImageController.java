package rs.drVladimir.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rs.drVladimir.Entity.Image;
import rs.drVladimir.Service.ImageService;
import java.util.List;
import java.util.Optional;

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

    @GetMapping
    public List<Image> getAllImages()
    {
        return imageService.getAllImages();
    }

    @GetMapping(path = "/{id}")
    public Optional<Image> findImgById(@PathVariable Integer id)
    {
        return imageService.findImageById(id);
    }

    @PostMapping
    public void saveImage(@RequestBody Image image)
    {
        imageService.postImage(image);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteImage(@PathVariable Integer id)
    {
        imageService.deleteImage(id);
    }

    @PutMapping(path = "/{id}")
    public void updateImage(@RequestBody Image image)
    {
        imageService.updateImage(image);
    }
}
