package com.teamNIM.entity;


import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Objects;


/**
 * The type Wordle.
 */
@Entity(name = "Wordle")
@Table(name = "words")
public class Wordle {

	@Column
	private String editor;

	@Column
	private String solution;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;

	@Column
	private String printDate;

	//	Constructors

	/**
	 * Instantiates a new Wordle.
	 */
	public Wordle() { }

	/**
	 * Instantiates a new Wordle.
	 *
	 * @param editor    the editor
	 * @param solution  the solution
	 * @param printDate the print date
	 */
	public Wordle(String editor, String solution, String printDate) {
		this.editor = editor;
		this.solution = solution;
		this.printDate = printDate;
	}

	/**
	 * Instantiates a new Wordle.
	 *
	 * @param editor    the editor
	 * @param solution  the solution
	 * @param id        the id
	 * @param printDate the print date
	 */
	public Wordle(String editor, String solution, int id, String printDate) {
		this.editor = editor;
		this.solution = solution;
		this.id = id;
		this.printDate = printDate;
	}

	//	 Getters & Setters
	/**
	 * Gets editor.
	 *
	 * @return the editor
	 */
	public String getEditor() {
		return editor;
	}

	/**
	 * Sets editor.
	 *
	 * @param editor the editor
	 */
	public void setEditor(String editor) {
		this.editor = editor;
	}

	/**
	 * Gets solution.
	 *
	 * @return the solution
	 */
	public String getSolution() {
		return solution;
	}

	/**
	 * Sets solution.
	 *
	 * @param solution the solution
	 */
	public void setSolution(String solution) {
		this.solution = solution;
	}

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets print date.
	 *
	 * @return the print date
	 */
	public String getPrintDate() {
		return printDate;
	}

	/**
	 * Sets print date.
	 *
	 * @param printDate the print date
	 */
	public void setPrintDate(String printDate) {
		this.printDate = printDate;
	}

	@Override
	public String toString() {
		return "Wordle{" +
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
		Wordle wordle = (Wordle) o;
		return id == wordle.id &&
				Objects.equals(editor, wordle.editor) &&
				Objects.equals(solution, wordle.solution) &&
				Objects.equals(printDate, wordle.printDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(editor, solution, id, printDate);
	}
}