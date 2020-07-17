package com.powerapps.main.dto;

import java.util.LinkedList;

public class StatementData {
	private String title;
	private String period1;
	private String period2;
	private String period3;
	private String company;
	private String unit;
	private LinkedList<SubjectData> subjectList;
	
	public StatementData() {}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPeriod1() {
		return period1;
	}

	public void setPeriod1(String period1) {
		this.period1 = period1;
	}

	public String getPeriod2() {
		return period2;
	}

	public void setPeriod2(String period2) {
		this.period2 = period2;
	}

	public String getPeriod3() {
		return period3;
	}

	public void setPeriod3(String period3) {
		this.period3 = period3;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public LinkedList<SubjectData> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(LinkedList<SubjectData> subjectList) {
		this.subjectList = subjectList;
	}
}
