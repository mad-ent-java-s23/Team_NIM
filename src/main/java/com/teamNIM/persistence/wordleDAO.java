package com.teamNIM.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.teamNIM.entity.WordleAnswers;
import com.teamNIM.util.PropertiesLoader;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.apache.logging.log4j.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;

/**
 * The type Wordle dao.
 */
public class wordleDAO implements PropertiesLoader {
    Properties properties;
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
    public static String API_URL;

    /**
     * Load Properties for correct URI
     */
    private void loadProperties() {
        try {
            properties = loadProperties("/wordle.properties");
            API_URL = properties.getProperty("wordle.nytimes");
        } catch (IOException ioException) {
            logger.error("Cannot load properties..." + ioException);
        } catch (Exception e) {
            logger.error("Error loading properties..." + e);
        }
    }

    public WordleAnswers getAnswer(String date) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target(url_key() + date + ".json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        WordleAnswers newWord = new WordleAnswers();
        try {
            newWord = mapper.readValue(response, WordleAnswers.class);
        } catch (JsonProcessingException e) {
            logger.error("Error processing JSON... " + e);
        }
        return newWord;
    }

    /**
     * Helper method, load properties and get correct URL
     * **May need to change this to a different API
     * @return  String with API URI prefix
     */
    private String url_key () {
        loadProperties();
        return properties.getProperty("wordle.nytimes");
    }

    public List<WordleAnswers> getAll() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<WordleAnswers> query = builder.createQuery(WordleAnswers.class );
        Root<WordleAnswers> root = query.from(WordleAnswers.class);
        List<WordleAnswers> answers = session.createQuery( query ).getResultList();
        logger.debug("List of answers " + answers);
        session.close();
        return answers;

    }

}
