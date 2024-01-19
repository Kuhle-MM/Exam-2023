/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package question2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class EstateAgentTest {
    
    public EstateAgentTest() {
    }

    @Test
    public void testCalculateCommission() {
        System.out.println("calculateCommission");
        double propertyPrice = 1600000;
        double commissionPercentage = 0.02;
        EstateAgent instance = new EstateAgent();
        double expResult = 32320;
        double result = instance.calculateCommission(propertyPrice, commissionPercentage);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testValidateData() {
        System.out.println("validateData");
        String location = "Cape Town";
        String agentName = "John Bloggs";
        double propertyPrice = 1600000;
        double commissionPercentage = 2;
        EstateAgent instance = new EstateAgent();
        boolean expResult = true;
        boolean result = instance.validateData(location, agentName, propertyPrice, commissionPercentage);
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }
    
}
