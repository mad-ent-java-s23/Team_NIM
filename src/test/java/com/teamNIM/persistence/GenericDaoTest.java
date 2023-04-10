package com.teamNIM.persistence;

import com.teamNIM.entity.WordleAnswers;
import com.teamNIM.test.util.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for GenericDao -- using DB
 * @author keithlienert
 */
class GenericDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    LocalDate date;
    GenericDao dao;

    @BeforeEach
    void setUp() {
        date = LocalDate.now(); // current date
        dao = new GenericDao(WordleAnswers.class);
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    @Test
    public void getSolutionByID_Success() {
        assertEquals("???", dao.getById(2));
    }



}
