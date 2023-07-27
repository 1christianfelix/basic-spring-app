package com.christian.tissues.tissuesbe.model;

import java.time.LocalDate;

public class createIssueRequest {
	 	private String username;
		private String description;
	    private LocalDate targetDate;
	    private boolean done;
	    
	    public createIssueRequest(String username, String description, LocalDate targetDate, boolean done) {
	    	super();
	    	this.username = username;
	    	this.description = description;
	    	this.targetDate = targetDate;
	    	this.done = done;
	    }

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public LocalDate getTargetDate() {
			return targetDate;
		}

		public void setTargetDate(LocalDate targetDate) {
			this.targetDate = targetDate;
		}

		public boolean isDone() {
			return done;
		}

		public void setDone(boolean done) {
			this.done = done;
		}
	    
}
