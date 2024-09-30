package com.algonquin.cst8288.fall24.assignment1.treatment;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.Constants;


/**
 * 
 * Implement this
 */
public class MedicationTreatmentPlan implements TreatmentPlan {

	@Override
	public String createTreatmentPlan(Patient patient) {
		StringBuilder sb = new StringBuilder();
        sb.append("The patient is diagnosed with ");
        
        if (patient.getAge() <= 6) {
            sb.append("Acute illness and requires medication ").append(Constants.ACUTE_DURATION).append(" days.");
            patient.getPrescription().setDailyDosageCount(1);
            patient.getPrescription().setDuration(Constants.ACUTE_DURATION);
        } else if (patient.getAge() <= 18) {
            sb.append("Infection illness and requires antibiotics for ").append(Constants.INFECTION_DURATION).append(" days.");
            patient.getPrescription().setDailyDosageCount(2);
            patient.getPrescription().setDuration(Constants.INFECTION_DURATION);
        } else {
            sb.append("Chronic illness and requires specialized medication for ").append(Constants.CHRONIC_DURATION).append(" days.");
            patient.getPrescription().setDailyDosageCount(3);
            patient.getPrescription().setDuration(Constants.CHRONIC_DURATION);
        }
        patient.setPlannedTreatment(sb.toString());
        return sb.toString();
	}

	
	

}
