import java.util.List;

public interface EmployeeService {
  
    List<Employee> getAllEmployees();
    void addNewEmployee (Employee employee);
    void updateEmployee (Employee employee);
    void deleteEmployee (int empId);
    Employee getEmployeeById(int empId);

    

    
}
