package rs.drVladimir.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.drVladimir.Service.EquipmentService;

@RestController
@RequestMapping(path = "/api/equipment")
public class EquipmentController
{
    private final EquipmentService equipmentService;

    @Autowired
    public EquipmentController(EquipmentService equipmentService)
    {
        this.equipmentService = equipmentService;
    }


}
