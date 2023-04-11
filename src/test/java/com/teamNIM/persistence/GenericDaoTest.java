package com.teamNIM.persistence;

import com.teamNIM.entity.WordleAnswers;
import com.teamNIM.test.util.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for GenericDao -- using DB
 * @author keithlienert
 */
class GenericDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    LocalDate date;
    wordleDAO dao;
//    GenericDao dao;
    WordleAnswers sample;

    @BeforeEach
    void setUp() {
        date = LocalDate.now(); // current date
//        dao = new GenericDao(WordleAnswers.class);
        dao = new wordleDAO();
        sample = new WordleAnswers("Joe Cool", "Test1", "2023-04-10" );
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

    }

    @Test
    public void getAll_Success() {
        dao.getAll();
//        List<WordleAnswers> wordleWords = dao.getAll();
//        logger.debug("    **** Answer [0]: " + wordleWords.get(0).getSolution());
//        assertEquals(3, dao.getAll().size());
    }

//    @Test
//    public void getSolutionByID_Success() {
//        assertEquals("leafy", dao.getById(2));
//    }


}
