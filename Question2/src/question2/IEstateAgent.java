/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package question2;

/**
 *
 * @author lab_services_student
 */
interface IEstateAgent {
    double calculateCommission(double propertyPrice, double agentCommission);
    boolean validateData(String location, String agentName, double propertyPrice, double commissionPercentage);
}
