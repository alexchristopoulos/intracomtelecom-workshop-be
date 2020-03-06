package com.intracomtelecom.workshop.be.index;

public class IndexEntity {

	private String message;

	public IndexEntity() {

	}

	public IndexEntity(String message) {

		this.message = "Hello " + message + "!";
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {

		if (this.message == null)
			return "Hello word";
		else
			return this.message;
	}
}
