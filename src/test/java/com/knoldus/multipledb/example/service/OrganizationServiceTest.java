package com.knoldus.multipledb.example.service;

import com.knoldus.multipledb.example.contractor.Contractor;
import com.knoldus.multipledb.example.employee.Employee;
import org.junit.Ignore;
import org.junit.Test;

public class OrganizationServiceTest {
    /**
     * Method under test: {@link OrganizationService#getAllEmployee()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetAllEmployee() {
        // TODO: Complete this test.
        (new OrganizationService()).getAllEmployee();
    }

    /**
     * Method under test: {@link OrganizationService#saveEmployee(Employee)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSaveEmployee() {

        OrganizationService organizationService = new OrganizationService();

        Employee employee = new Employee();
        employee.setDepartment("Department");
        employee.setId(123L);
        employee.setName("Name");
        organizationService.saveEmployee(employee);
    }

    /**
     * Method under test: {@link OrganizationService#saveContractor(Contractor)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSaveContractor() {
        OrganizationService organizationService = new OrganizationService();

        Contractor contractor = new Contractor();
        contractor.setId(123L);
        contractor.setName("Name");
        contractor.setParentOrg("Parent Org");
        organizationService.saveContractor(contractor);
    }

    /**
     * Method under test: {@link OrganizationService#getEmployee(Long)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetEmployee() {


        (new OrganizationService()).getEmployee(123L);
    }
}

