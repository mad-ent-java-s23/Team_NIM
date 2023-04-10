package com.teamNIM.util;

import com.teamNIM.persistence.wordleDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solutions {
    private int id;
    private String solution;
    private LocalDate printDate;
    private String editor;
    static wordleDAO dao;
    LocalDate date;

    public Solutions() { }

    public Solutions(int id, String solution, LocalDate printDate, String editor) {
        this.id = id;
        this.solution = solution;
        this.printDate = printDate;
        this.editor = editor;
    }

    /**
     * Constructor for just the printDate
     * @param printDate
     */
    public Solutions (LocalDate printDate) {
        this.printDate = printDate;
    }

    public LocalDate getDate() {
        return printDate;
    }

    @Override
    public String toString() {
        return "Solutions [" +
                "id=" + id +
                ", solution=" + solution +
                ", printDate=" + printDate +
                ", editor=" + editor + "]";
    }

    /**
     * produces a collection of dates in a range
     * @param start -- start Date
     * @param end -- end Date (which could be the current Date)
     * @return  a List of LocalDate in the range specified
     * https://www.baeldung.com/java-between-dates
     */
    public static List<String> getDates(LocalDate start, LocalDate end) {
        List<LocalDate> dateList = start.datesUntil(end).collect(Collectors.toList());
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < dateList.size(); i++) {
            strList.add(String.valueOf(dateList.get(i)));
        }
        return strList;
    }

    /**
     * Retrieves the NYTimes API information (wordleDAO) with the dates information
     * @param dates -- String List of dates to search words for
     * @return --
     */
    public static List<String> queryValues (List<String> dates) {
        List<String> solutions = new ArrayList<>();
        for (int i = 0; i < dates.size(); i++) {
            solutions.add
                    ("('" + String.valueOf(dao.getAnswer(dates.get(i)).getSolution() + "', " +
                    dao.getAnswer(dates.get(i)).getPrintDate() + ", " + "'" +
                    dao.getAnswer(dates.get(i)).getEditor())+ "')");

        }
        return solutions;
    }


    public static void main(String[] args) {
        dao = new wordleDAO();
//        LocalDate startDate = LocalDate.parse("2021-06-19"); // starting date for NYTimes
        LocalDate startDate = LocalDate.parse("2023-04-01"); // just for a test
        LocalDate currDate = LocalDate.now();
        System.out.println(queryValues(getDates(startDate, currDate)));

//        System.out.println(dao.getAnswer("2021-06-19"));



    }
}
