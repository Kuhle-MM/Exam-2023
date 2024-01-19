/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package question1;

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
    public void testEstateAgentSales() {
        System.out.println("EstateAgentSales");
        double[] propertySales = {800000, 1500000, 2000000};
        EstateAgent instance = new EstateAgent();
        double expResult = 4300000;
        double result = instance.EstateAgentSales(propertySales);
        assertEquals(expResult, result, 0);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testEstateAgentCommission() {
        System.out.println("EstateAgentCommission");
        double propertySales = 4300000;
        EstateAgent instance = new EstateAgent();
        double expResult = 86000;
        double result = instance.EstateAgentCommission(propertySales);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testTopEstateAgent() {
        System.out.println("TopEstateAgent");
        
        double[] totalSales = {4300000,3500000};
        EstateAgent instance = new EstateAgent();
        int expResult = 0;
        int result = instance.TopEstateAgent(totalSales);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
