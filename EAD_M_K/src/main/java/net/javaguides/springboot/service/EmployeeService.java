package net.javaguides.springboot.service;

import java.util.List;
import org.springframework.data.domain.Page;
import net.javaguides.springboot.model.Employee;
import org.springframework.web.multipart.MultipartFile;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee, MultipartFile imageFile);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);

	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
