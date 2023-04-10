package com.teamNIM.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity(name = "WordleAnswers")
@Table(name = "words")
public class WordleAnswers{

	@Column
	@JsonProperty("editor")
	private String editor;

	@Column
	@JsonProperty("solution")
	private String solution;

	@JsonProperty("days_since_launch")
	private int daysSinceLaunch;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@JsonProperty("id")
	private int id;

	@Column
	@JsonProperty("print_date")
	private String printDate;

//	Constructors

	public WordleAnswers() {}

	public WordleAnswers(String editor, String solution, int id, String printDate) {
		this.editor = editor;
		this.solution = solution;
		this.id = id;
		this.printDate = printDate;
	}

	//	 Getters & Setters
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

	@Override
	public String toString() {
		return "WordleAnswers{" +
				"editor='" + editor + '\'' +
				", solution='" + solution + '\'' +
				", daysSinceLaunch=" + daysSinceLaunch +
				", id=" + id +
				", printDate='" + printDate + '\'' +
				'}';
	}
}