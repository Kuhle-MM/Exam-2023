/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package question1;

/**
 *
 * @author lab_services_student
 */
public interface IEstateAgent {
    double EstateAgentSales(double[] propertySales);
     double EstateAgentCommission(double propertySales);
     int TopEstateAgent(double[] totalSales);
}
