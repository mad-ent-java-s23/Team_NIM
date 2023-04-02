package edu.matc.service;

import com.teamNIM.entity.WordleAnswers;
import com.teamNIM.persistence.GenericDao;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/WordleService")
public class WordleService {
    GenericDao dao = new GenericDao(WordleAnswers.class);
//    private static final String SUCCESS_RESULT="<result>SUCCESS</result>";
//    private static final String FAILURE_RESULT="<result>FAILURE</result>";

    //    GET "/users"
    @GET
    @Path("/answers")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMessage() {
        List<WordleAnswers> resultList = new ArrayList<>();
        resultList = dao.getAll();
        return Response.status(200).entity(resultList.toString()).build();
    }

    //    GET /users?userid={id}
    @GET
    @Path("/query")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAnswerByDate(@QueryParam("answerDate") int userid) {
        WordleAnswers answers = new WordleAnswers();
        answers = (WordleAnswers) dao.getById(userid);
        return Response.status(200).entity(answers.toString()).build();
    }

//    POST "/users"

//    PUT "/users"

//    DELETE "/users/{userid}"

}
