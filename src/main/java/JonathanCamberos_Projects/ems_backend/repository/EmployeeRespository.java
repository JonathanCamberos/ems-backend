package JonathanCamberos_Projects.ems_backend.repository;

import JonathanCamberos_Projects.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRespository extends JpaRepository<Employee, Long> {
}
