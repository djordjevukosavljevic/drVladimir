package rs.drVladimir.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.drVladimir.Repository.AppointmentRepository;

@Service
public class AppointmentService
{

    @Autowired
    private final AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository)
    {
        this.repository = repository;
    }


}
