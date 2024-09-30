package com.algonquin.cst8288.fall24.assignment1.prescription;

import java.util.Date;

/**
 * 
 * Calculate the details of the prescription according to the business rules.
 * The information to include should cover daily doses, duration, disease type,
 * surgery date, etc.
 * 
 */


public class Prescription {
		
	
	long dailyDosageCount;
	long duration;
	String diseaseType;
	Date surgeryDate;
	String riskFactor;
	boolean isFastingRequired;
	Date followUpDate;
	// Add any other required attributes

	public Prescription() {
		
	}

	public long getDailyDosageCount() {
		return dailyDosageCount;
	}

	public void setDailyDosageCount(long dailyDosageCount) {
		this.dailyDosageCount = dailyDosageCount;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public String getDiseaseType() {
		return diseaseType;
	}

	public void setDiseaseType(String diseaseType) {
		this.diseaseType = diseaseType;
	}

	public Date getSurgeryDate() {
		return surgeryDate;
	}

	public void setSurgeryDate(Date surgeryDate) {
		this.surgeryDate = surgeryDate;
	}

	public String getRiskFactor() {
		return riskFactor;
	}

	public void setRiskFactor(String riskFactor) {
		this.riskFactor = riskFactor;
	}

	public boolean isFastingRequired() {
		return isFastingRequired;
	}

	public void setFastingRequired(boolean isFastingRequired) {
		this.isFastingRequired = isFastingRequired;
	}

	public Date getFollowUpDate() {
		return followUpDate;
	}

	public void setFollowUpDate(Date followUpDate) {
		this.followUpDate = followUpDate;
	}
	
	
	
	
	
	

}
