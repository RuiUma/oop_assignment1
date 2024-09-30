package com.algonquin.cst8288.fall24.assignment1.treatment;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.Constants;

/**
 * 
 * This class is responsible for implementing the business logic related to generating a treatment plan. 
 * 
 * You can use any method you prefer, such as StringBuilder or standard String, to construct the plan. Think of
 * treatment plan is a doctor notes in a summary format. 
 * Later, you will attach the treatment plan to detailed prescription.
 * 
 * An example might look like this:
 * "The patient is diagnosed with xxx and requires surgery.
 *  The patient is xxx years old with a risk factor of xxx. It is required to perform a minor surgery
 *  in order to address the xxx issue."
 * 
 * */


public class SurgeryTreatmentPlan implements TreatmentPlan{

	@Override
	public String createTreatmentPlan(Patient patient) {
		StringBuilder sb = new StringBuilder();
        sb.append("The patient requires surgery. Age: ").append(patient.getAge()).append(". ");
        
        if (patient.getAge() < 6) {
            sb.append("Risk factor is high. No fasting required. Follow-up next day.");
            patient.getPrescription().setRiskFactor(Constants.HIGH);
            patient.getPrescription().setFastingRequired(false);
        } else if (patient.getAge() <= 18) {
            sb.append("Risk factor is medium. Fasting 2 hours before surgery. Follow-up in one week.");
            patient.getPrescription().setRiskFactor(Constants.MEDIUM);
            patient.getPrescription().setFastingRequired(true);
        } else {
            sb.append("Risk factor is low. Fasting 8 hours before surgery. Follow-up in one month.");
            patient.getPrescription().setRiskFactor(Constants.LOW);
            patient.getPrescription().setFastingRequired(true);
        }
        
        patient.setPlannedTreatment(sb.toString());
        return sb.toString();
	}

	

}
