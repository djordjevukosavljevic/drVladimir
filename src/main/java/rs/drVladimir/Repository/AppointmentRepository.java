package rs.drVladimir.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.drVladimir.Entity.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer>
{

}
