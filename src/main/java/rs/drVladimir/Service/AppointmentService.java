package rs.drVladimir.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.drVladimir.Entity.Appointment;
import rs.drVladimir.Repository.AppointmentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService
{

    @Autowired
    private final AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository)
    {
        this.repository = repository;
    }

    public List<Appointment> getAllAppointments()
    {
        return repository.findAll();
    }

    public Optional<Appointment> findAppointmentById(Integer id)
    {
        return repository.findById(id);
    }

    public void deleteAppointmentById(Integer id)
    {
        repository.deleteById(id);
    }
}
