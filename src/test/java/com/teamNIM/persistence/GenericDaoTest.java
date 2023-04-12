package com.teamNIM.persistence;

import com.teamNIM.entity.Wordle;
import com.teamNIM.entity.WordleAnswers;
import com.teamNIM.test.util.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for GenericDao -- using DB
 * @author keithlienert
 */
class GenericDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao dao;
    Wordle sample;

    @BeforeEach
    void setUp() {
        dao = new GenericDao(Wordle.class);
        sample = new Wordle("Keith Lienert", "Test1", "2023-04-11");
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    @Test
    public void getAll_Success() {
        logger.debug("    **** wordles " + dao.getAll());
        assertEquals(3, dao.getAll().size());
    }

    @Test
    public void getByIdSuccess() {
        Wordle retrievedWord = (Wordle)dao.getById(2);
        assertNotNull(retrievedWord);
        assertEquals("leafy", retrievedWord.getSolution());
    }

    @Test
    public void insertSuccess() {
        int id = dao.insert(sample);
        assertNotEquals(0, id);
        Wordle insertedWord = (Wordle)dao.getById(id);
        assertEquals(sample, insertedWord);
    }

    @Test
    public void updateSuccess() {
        String newWord = "Test9";
        Wordle wordToUpdate = (Wordle)dao.getById(3);
        wordToUpdate.setSolution(newWord);
        dao.saveOrUpdate(wordToUpdate);
        Wordle retrievedWord = (Wordle)dao.getById(3);
        assertEquals(wordToUpdate, retrievedWord);
    }



}
