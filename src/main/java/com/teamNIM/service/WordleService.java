package com.teamNIM.service;

import com.teamNIM.entity.Wordle;
import com.teamNIM.entity.WordleAnswers;
import com.teamNIM.persistence.GenericDao;
import com.teamNIM.persistence.wordleDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Path("/WordleService")
public class WordleService {
    private final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao genericDao = new GenericDao(Wordle.class);
    wordleDAO dao = new wordleDAO();
    LocalDate date;

    // GET "/words"
    @GET
    @Path("/today")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getWordByDate() {
        date = LocalDate.now();
        String answer = String.valueOf(dao.getAnswer(String.valueOf(date)));
        WordleAnswers word = new WordleAnswers();
        word = (WordleAnswers)dao.getAnswer(String.valueOf(date));

        //        List<WordleAnswers> resultList = new ArrayList<>();
//        resultList = (List<WordleAnswers>) dao.getAnswer(String.valueOf(date));
//        return Response.status(200).entity(resultList.toString()).build();
        return Response.status(200).entity(word.toString()).build();
    }

//    GET "/all"
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllWords() {
        List<Wordle> wordList = genericDao.getAll();
        return Response.status(200).entity(wordList.toString()).build();
    }


//    GET /WorldService/query?word_id={id}
    @GET
    @Path("/getById")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getWordByID(@QueryParam("word_id") int id) {
        Wordle words = (Wordle)genericDao.getById(id);
        return Response.status(200).entity(words.toString()).build();
    }

//  GET /WordleService/query?date={date}
    @GET
    @Path("/query")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getWordByDate(@QueryParam("date") String date) {
        List<Wordle> result = genericDao.findByPropertyEqual("printDate", date);
        logger.debug("   **** List size: " + result.size());
        if (result.size() < 1) {
            return Response.status(200).entity("Oops! There might not be a word for the date you selected").build();
        }
        return Response.status(200).entity(result.get(0).toString()).build();
    }

}
