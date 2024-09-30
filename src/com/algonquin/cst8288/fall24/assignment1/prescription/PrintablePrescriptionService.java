package com.algonquin.cst8288.fall24.assignment1.prescription;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;


/**
 * 
 * Implement this
 * 
 */
public class PrintablePrescriptionService implements PrescriptionService {

	@Override
	public String generatePrescription(Patient patient) {
		StringBuilder sb = new StringBuilder();
        sb.append("Patient Name: ").append(patient.getName()).append("\n");
        sb.append("Date of Birth: ").append(patient.getDateOfBirth()).append("\n");
        sb.append("Diagnose: ").append(patient.getPlannedTreatment()).append("\n");
        sb.append("Rx:\n");
        sb.append("Dosage: ").append(patient.getPrescription().dailyDosageCount).append(" times/day\n");
        sb.append("Duration: ").append(patient.getPrescription().duration).append(" days\n");
        sb.append("Follow Up: In ").append(patient.getPrescription().followUpDate).append("\n");
        
        return sb.toString();
	}

	

	
}
