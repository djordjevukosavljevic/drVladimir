package rs.drVladimir.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.drVladimir.Entity.Equipment;
import rs.drVladimir.Repository.EquipmentRepository;

import java.util.List;

@Service
public class EquipmentService
{
    private final EquipmentRepository equipmentRepository;

    @Autowired
    public EquipmentService(EquipmentRepository equipmentRepository)
    {
        this.equipmentRepository = equipmentRepository;
    }

    public List<Equipment> findAllEquipment()
    {
        return  equipmentRepository.findAll();
    }
}
