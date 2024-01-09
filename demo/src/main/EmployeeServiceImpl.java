import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    private EmployeeRepositery repository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepositery repository) {
        this.repository = repository;
    }

    @Override
    public List<Employee> getAEmployees() {
        return repository.findAll();
    }
    
    @Override
    public void addNewEmployee(Employee employee){
       repository.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee){
       repository.save(employee);
    }

    public void deleteEmployee(int empId){
       repository.deleteById(empId);
    }

     public void getEmployee(int empId){
       return repository.findById(empId).orElse(null);
    }
}