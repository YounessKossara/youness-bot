package org.example.younessbot.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AITools {
    @Tool(name = "getEmployee" , description = "get information about given employee")
    public Employee getEmployee(@ToolParam (description = "The employee name") String name) {
        return new Employee(name, 5000 , 5);
    }

    @Tool(name = "getAllEmployees" , description = "get information about all employees")
    public List<Employee> getAllEmployees() {
        return List.of(
                new Employee("Youness", 5000, 5),
                new Employee("Anass", 6000, 6),
                new Employee("Khadija", 7000, 7)
        );
    }
}

record Employee(String name, double salary , int seniority) {}