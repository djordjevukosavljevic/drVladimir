package rs.drVladimir.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.drVladimir.Service.AppointmentService;

@RestController
@RequestMapping(path = "/api/appointment")
public class AppointmentController
{
    @Autowired
    private final AppointmentService service;

    public AppointmentController(AppointmentService service)
    {
        this.service = service;
    }

}
