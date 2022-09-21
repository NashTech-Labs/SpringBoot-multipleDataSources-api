package com.knoldus.multipledb.example.controller;

import com.knoldus.multipledb.example.contractor.Contractor;
import com.knoldus.multipledb.example.employee.Employee;
import org.junit.Ignore;
import org.junit.Test;

public class OrganizationControllerTest {
    /**
     * Method under test: {@link OrganizationController#getAllEmployee()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetAllEmployee() {
        (new OrganizationController()).getAllEmployee();
    }

    /**
     * Method under test: {@link OrganizationController#getAllContractor()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetAllContractor() {

        (new OrganizationController()).getAllContractor();
    }

    /**
     * Method under test: {@link OrganizationController#getEmployee(Long)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetEmployee() {
        // TODO: Complete this test.

        (new OrganizationController()).getEmployee(123L);
    }

    /**
     * Method under test: {@link OrganizationController#saveContractor(Contractor)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSaveContractor() {
        // TODO: Complete this test.

        OrganizationController organizationController = new OrganizationController();

        Contractor contractor = new Contractor();
        contractor.setId(123L);
        contractor.setName("Name");
        contractor.setParentOrg("Parent Org");
        organizationController.saveContractor(contractor);
    }
}

