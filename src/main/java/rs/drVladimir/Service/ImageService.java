package rs.drVladimir.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.drVladimir.Entity.Image;
import rs.drVladimir.Repository.ImageRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ImageService
{
    @Autowired
    private final ImageRepository imageRepository;

    public ImageService(ImageRepository _imageRepository)
    {
        this.imageRepository = _imageRepository;
    }

    public List<Image> getAllImages()
    {
        return imageRepository.findAll();
    }

    public Optional<Image> findImageById(Integer id)
    {
        return imageRepository.findById(id);
    }

    public void postImage(Image image)
    {
        imageRepository.save(image);
    }
}
