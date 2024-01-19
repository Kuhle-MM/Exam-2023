/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

/**
 *
 * @author lab_services_student
 */
class EstateAgent implements IEstateAgent {
    @Override
    public double calculateCommission(double propertyPrice, double commissionPercentage) {
        return propertyPrice * ((commissionPercentage / 100) + (commissionPercentage%100));
    }

    @Override
    public boolean validateData(String location, String agentName, double propertyPrice, double commissionPercentage) {
        // Validate the data based on the specified rules
        return !location.isEmpty() &&
                !agentName.isEmpty() &&
                propertyPrice > 0 &&
                commissionPercentage > 0;
    }
}
