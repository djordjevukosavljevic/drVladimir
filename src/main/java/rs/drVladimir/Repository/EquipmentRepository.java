package rs.drVladimir.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.drVladimir.Entity.Equipment;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer>
{
    String findEquipmentByName(String deviceName);
}
