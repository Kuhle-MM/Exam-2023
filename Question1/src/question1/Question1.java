/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question1;

import java.text.DecimalFormat;

/**
 *
 * @author lab_services_student
 */
public class Question1 {

    public static void main(String[] args) {
        EstateAgent estateAgent = new EstateAgent();

        double[] totalSales = new double[estateAgent.propertySales.length];
        double[] totalCommissions = new double[estateAgent.propertySales.length];

//displaying sales information in format provided
        System.out.println("""
                           ESTATE AGENTS SALES REPORT
                                                   JAN                    FEB                     MAR
                           ----------------------------------------------------------------------------""");
        for (int i = 0; i < estateAgent.propertySales.length; i++) {
            System.out.print(estateAgent.estateAgentsArray[i]);
            for (int j = 0; j < estateAgent.propertySales[i].length; j++) {
                System.out.print("\t\tR " + estateAgent.propertySales[i][j]);
            }
            System.out.println("");
        }

        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
        
        System.out.println("");
        //Calculate and print total property sales and commissions for each estate agent
        for (int i = 0; i < estateAgent.propertySales.length; i++) {
            totalSales[i] = estateAgent.EstateAgentSales(estateAgent.propertySales[i]);
          
            // Create a DecimalFormat object with the desired pattern
        
        String formattedAmount = decimalFormat.format(totalSales[i]);
        
            System.out.println("Total property sales for " + estateAgent.estateAgentsArray[i] +": R " + formattedAmount);

        }
        System.out.println();
        for (int i = 0; i < estateAgent.propertySales.length; i++) {
            totalCommissions[i] = estateAgent.EstateAgentCommission(totalSales[i]);

            
        String formattedAmount = decimalFormat.format(totalCommissions[i]);
        
            System.out.println("Sales Commission for "+estateAgent.estateAgentsArray[i] + ": R " + formattedAmount );

        }
        System.out.println();
        // Identify and print the top-performing estate agent
        int topAgentIndex = estateAgent.TopEstateAgent(totalSales);
        System.out.println("Top Performing Estate Agent: " + estateAgent.estateAgentsArray[topAgentIndex]);
    }
}

//Java Programming, Ninth Edition. In: Java Programming, Ninth Edition.
// Farrell, J., 2012.
// pp 1 - 625

//https://www.youtube.com/watch?v=alwukGslBG8
//Java 2D arrays 🚚
//Bro Code
