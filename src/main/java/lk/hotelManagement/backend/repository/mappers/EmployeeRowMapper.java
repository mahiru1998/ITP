package lk.hotelManagement.backend.repository.mappers;
import lk.hotelManagement.backend.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setEmployeeId(resultSet.getString("employee_id"));
        employee.setFirstName(resultSet.getString("first_name"));
        employee.setLastName(resultSet.getString("last_name"));
        employee.setAddress1(resultSet.getString("addrees_1"));
        employee.setAddress2(resultSet.getString("addrees_2"));
        employee.setEmail(resultSet.getString("email"));
        employee.setCity(resultSet.getString("city"));
        employee.setContact(resultSet.getString("contact"));
        return employee;
    }
}
