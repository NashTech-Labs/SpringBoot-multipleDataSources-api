package com.knoldus.multipledb.example.contractor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContractorTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Contractor}
     *   <li>{@link Contractor#setId(Long)}
     *   <li>{@link Contractor#setName(String)}
     *   <li>{@link Contractor#setParentOrg(String)}
     *   <li>{@link Contractor#getId()}
     *   <li>{@link Contractor#getName()}
     *   <li>{@link Contractor#getParentOrg()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        Contractor actualContractor = new Contractor();
        actualContractor.setId(123L);
        actualContractor.setName("Name");
        actualContractor.setParentOrg("Parent Org");
        assertEquals(123L, actualContractor.getId().longValue());
        assertEquals("Name", actualContractor.getName());
        assertEquals("Parent Org", actualContractor.getParentOrg());
    }
}

