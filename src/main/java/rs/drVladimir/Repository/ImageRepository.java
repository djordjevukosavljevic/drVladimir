package rs.drVladimir.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.drVladimir.Entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer>
{

}
