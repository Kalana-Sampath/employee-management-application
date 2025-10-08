package net.KsProduction.springboot;

import net.KsProduction.springboot.model.Employee;
import net.KsProduction.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Kalana");
		employee.setLastName("Sampath");
		employee.setEmailId("kalana@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Kalum");
		employee1.setLastName("Sampatha");
		employee1.setEmailId("kalana@gmail.com");
		employeeRepository.save(employee1);
	}
}
