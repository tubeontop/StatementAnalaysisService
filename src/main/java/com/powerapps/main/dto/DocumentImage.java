package com.powerapps.main.dto;

public class DocumentImage {
	private String formtype;
	private String resultString;
	
	public DocumentImage() {}

	public String getFormtype() {
		return formtype;
	}

	public void setFormtype(String formtype) {
		this.formtype = formtype;
	}

	public String getResultString() {
		return resultString;
	}

	public void setResultString(String resultString) {
		this.resultString = resultString;
	}

	@Override
	public String toString() {
		return "Document [formtype=" + formtype + ", resultString=" + resultString + "]";
	}
}
