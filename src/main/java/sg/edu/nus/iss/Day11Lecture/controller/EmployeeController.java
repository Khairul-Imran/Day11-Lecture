package sg.edu.nus.iss.Day11Lecture.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.Day11Lecture.model.Employee;

// Controller Allows spring boot to know that this is a controller -> generates the endpoint routes for you when compiling. Endpoint to all the url resources.
// He changed it to RestController -> returns object. -> for redirecting data
// Controller returns strings?
@RestController
@RequestMapping("/employees") 
public class EmployeeController {

  @GetMapping(path = "/list")
  public List<Employee> getAllEmployees() {
    
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Bob", "Tan", "bobtan@gmail.com"));
    employees.add(new Employee("Ali", "Man", "aliman@gmail.com"));
    employees.add(new Employee("Ronaldo", "Cristiano", "cr7@gmail.com"));

    return employees;
  }

  
}
