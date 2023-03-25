package com.teamNIM.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WordleAnswers{

	@JsonProperty("editor")
	private String editor;

	@JsonProperty("solution")
	private String solution;

	@JsonProperty("days_since_launch")
	private int daysSinceLaunch;

	@JsonProperty("id")
	private int id;

	@JsonProperty("print_date")
	private String printDate;

	public void setEditor(String editor){
		this.editor = editor;
	}

	public String getEditor(){
		return editor;
	}

	public void setSolution(String solution){
		this.solution = solution;
	}

	public String getSolution(){
		return solution;
	}

	public void setDaysSinceLaunch(int daysSinceLaunch){
		this.daysSinceLaunch = daysSinceLaunch;
	}

	public int getDaysSinceLaunch(){
		return daysSinceLaunch;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setPrintDate(String printDate){
		this.printDate = printDate;
	}

	public String getPrintDate(){
		return printDate;
	}
}