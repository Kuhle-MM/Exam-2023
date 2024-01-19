/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question1;

/**
 *
 * @author lab_services_student
 */
class EstateAgent implements IEstateAgent {

    final double[][] propertySales = {{800000, 1500000, 2000000},
    {700000, 1200000, 1600000}};
    final String[] estateAgentsArray = {"Joe Bloggs", "Jane Doe"};

    // Implementing IEstateAgent interface
    @Override
    public double EstateAgentSales(double[] propertySales) {
        double totalSales = 0;
        for (double sale : propertySales) {
            totalSales += sale;
        }
        return totalSales;
    }

    //Calculating agent commission
    @Override
    public double EstateAgentCommission(double propertySales) {
        return 0.02 * propertySales;
    }

    //Figuring out the best agent
    @Override
    public int TopEstateAgent(double[] totalSales) {
        int topAgentIndex = 0;
        double maxSales = totalSales[0];

        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];
                topAgentIndex = i;
            }
        }

        return topAgentIndex;
    }
}
