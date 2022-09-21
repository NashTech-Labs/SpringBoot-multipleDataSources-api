package com.knoldus.multipledb.example.employee;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Employee}
     *   <li>{@link Employee#setDepartment(String)}
     *   <li>{@link Employee#setId(Long)}
     *   <li>{@link Employee#setName(String)}
     *   <li>{@link Employee#getDepartment()}
     *   <li>{@link Employee#getId()}
     *   <li>{@link Employee#getName()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        Employee actualEmployee = new Employee();
        actualEmployee.setDepartment("Department");
        actualEmployee.setId(123L);
        actualEmployee.setName("Name");
        assertEquals("Department", actualEmployee.getDepartment());
        assertEquals(123L, actualEmployee.getId().longValue());
        assertEquals("Name", actualEmployee.getName());
    }
}

