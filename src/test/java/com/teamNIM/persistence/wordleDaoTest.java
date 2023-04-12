package com.teamNIM.persistence;

import com.teamNIM.entity.WordleAnswers;
import com.teamNIM.test.util.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * The type wordleDao test
 */
public class wordleDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    wordleDAO dao;

    @BeforeEach
    void setUp() {
        dao = new wordleDAO();
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

//    @Test
//    void getAllEntries_Success() {
//        List<WordleAnswers> wordles = dao.getAll();
//        logger.debug("    **** wordle [0]: " + wordles.get(0));
//        assertEquals(3, wordles.size());
//    }

    @Test
    void getFirstEntity_Success() {
        WordleAnswers words = dao.getAnswer("2023-04-05");
        assertEquals("smash", words.getSolution());
    }

}
