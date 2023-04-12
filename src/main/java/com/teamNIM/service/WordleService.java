package com.teamNIM.service;

import com.teamNIM.entity.Wordle;
import com.teamNIM.entity.WordleAnswers;
import com.teamNIM.persistence.GenericDao;
import com.teamNIM.persistence.wordleDAO;

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

//    GET /WorldService/query?word_id={id}
    @GET
    @Path("/query")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getWordByID(@QueryParam("word_id") int id) {
        Wordle words = (Wordle)genericDao.getById(id);
        return Response.status(200).entity(words.toString()).build();
    }
}
