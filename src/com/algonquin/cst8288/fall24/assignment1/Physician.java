package com.algonquin.cst8288.fall24.assignment1;

import java.io.IOException;

import com.algonquin.cst8288.fall24.assignment1.management.PatientManagement;
import com.algonquin.cst8288.fall24.assignment1.patient.Inpatient;
import com.algonquin.cst8288.fall24.assignment1.patient.Outpatient;

public class Physician {
	
    public static void main(String[] args) throws IOException {
    	
    	
    	 // Create two patient instances
        Inpatient patient1 = new Inpatient("001", "John Doe", "john.doe@example.com", "+1234567890", "1987-10-17", "A101");
        Outpatient patient2 = new Outpatient("002", "Jane Smith", "jane.smith@example.com", "+1987654321", "2005-05-23", "2024-09-30");

        // Patient Management instance
        PatientManagement management = new PatientManagement();

        // Create treatment plans
        management.createTreatmentPlan(patient1);
        management.createTreatmentPlan(patient2);

        // Generate and save prescriptions in .txt and .html formats
        management.generatePrescription(patient1, "john_doe_prescription.txt");
        management.generatePrescription(patient2, "jane_smith_prescription.html");

        System.out.println("Prescriptions generated successfully.");
     
        
    }

   
}


