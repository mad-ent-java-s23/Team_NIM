package com.teamNIM.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Objects;


@Entity(name = "WordleAnswers")
@Table(name = "words")
public class WordleAnswers{

	@Column(name="editor")
	@JsonProperty("editor")
	private String editor;

	@Column(name="solution")
	@JsonProperty("solution")
	private String solution;


	@JsonProperty("days_since_launch")
	private int daysSinceLaunch;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@JsonProperty("id")
	private int id;

	@Column(name="printDate")
	@JsonProperty("print_date")
	private String printDate;

//	Constructors

	/**
	 * Instantiates a new Wordle answers.
	 */
	public WordleAnswers() {}

	/**
	 * Instantiates a new Wordle answers.
	 *
	 * @param editor    the editor
	 * @param solution  the solution
	 * @param id        the id
	 * @param printDate the print date
	 */
	public WordleAnswers(String editor, String solution, int id, String printDate) {
		this.editor = editor;
		this.solution = solution;
		this.id = id;
		this.printDate = printDate;
	}

	/**
	 * Instantiates a new Wordle answers.
	 *
	 * @param editor    the editor
	 * @param solution  the solution
	 * @param printDate the print date
	 */
	public WordleAnswers(String editor, String solution, String printDate) {
		this.editor = editor;
		this.solution = solution;
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
				", id=" + id +
				", printDate='" + printDate + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		WordleAnswers that = (WordleAnswers) o;
		return id == that.id &&
				Objects.equals(editor, that.editor) &&
				Objects.equals(solution, that.solution) &&
				Objects.equals(printDate, that.printDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(editor, solution, id, printDate);
	}
}