package com.algonquin.cst8288.fall24.assignment1.prescription;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

/**
 * 
 * Implement this
 * 
 */
public class OnlinePrescriptionService implements PrescriptionService{

	@Override
	public String generatePrescription(Patient patient) {
		StringBuilder sb = new StringBuilder();
        sb.append("<html><body>");
        sb.append("<h1>Patient Prescription</h1>");
        sb.append("<p><strong>Patient Name:</strong> ").append(patient.getName()).append("</p>");
        sb.append("<p><strong>Date of Birth:</strong> ").append(patient.getDateOfBirth()).append("</p>");
        sb.append("<p><strong>Diagnose:</strong> ").append(patient.getPlannedTreatment()).append("</p>");
        sb.append("<h2>Prescription</h2>");
        sb.append("<p>Rx: </p>");
        sb.append("<p>Dosage: ").append(patient.getPrescription().dailyDosageCount).append(" times/day</p>");
        sb.append("<p>Duration: ").append(patient.getPrescription().duration).append(" days</p>");
        sb.append("<p>Follow Up: In ").append(patient.getPrescription().followUpDate).append("</p>");
        sb.append("</body></html>");
        
        return sb.toString();
	}
	
}
