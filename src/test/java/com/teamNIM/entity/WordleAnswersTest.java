package com.teamNIM.entity;

import com.teamNIM.persistence.GenericDao;
import com.teamNIM.persistence.wordleDAO;
import com.teamNIM.test.util.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for wordleDAO
 * @author keithlienert
 */
class WordleAnswersTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    wordleDAO dao;
    LocalDate date;
    GenericDao genericDao;

    @BeforeEach
    void setUp() {
        date = LocalDate.now(); // current date
        dao = new wordleDAO();
//         use genericDao
        genericDao = new GenericDao(WordleAnswers.class);
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    @Test
    public void getCurrentSolutionTestSuccess() {
//        assertEquals("???", dao.getAnswer(String.valueOf(date)).getSolution());
        System.out.println("Wordle Answer for (" + date + ") is: " + dao.getAnswer(String.valueOf(date)).getSolution());
    }


    @Test
    public void getOlderSolutionTestSuccess() {
        assertEquals("moose", dao.getAnswer("2023-03-01").getSolution());
        assertEquals("above", dao.getAnswer("2023-03-02").getSolution());
        assertEquals("squat", dao.getAnswer("2023-03-03").getSolution());
        assertEquals("trend", dao.getAnswer("2023-03-04").getSolution());
        assertEquals("toxic", dao.getAnswer("2023-03-05").getSolution());
    }

}