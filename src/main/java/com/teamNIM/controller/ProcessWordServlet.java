package com.teamNIM.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.teamNIM.entity.WordleAnswers;
import com.teamNIM.persistence.wordleDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(
        urlPatterns = {"/processWord"}
)
public class ProcessWordServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String word = (String) request.getParameter("word");
        wordleDAO dao = new wordleDAO();
        LocalDate date = LocalDate.now();
        List<String> listOfColors = new ArrayList<>();
        WordleAnswers wordleAnswers = dao.getAnswer(String.valueOf(date));

        String rightWord = wordleAnswers.getSolution();
        System.out.println(word);
        System.out.println(rightWord);

        for (int index = 0; index < word.length(); index++) {
            char charactor = word.charAt(index);
            if (rightWord.charAt(index) == charactor) {
                listOfColors.add("bg-success");
            } else if (rightWord.contains((Character.toString(charactor)))) {
                listOfColors.add("bg-warning");
            } else {
                listOfColors.add("bg-white");
            }
        }
        List<Character> listOfCharactor = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        request.setAttribute("listOfColors", listOfColors);
        request.setAttribute("listOfCharactor", listOfCharactor);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/wordle.jsp");
        dispatcher.forward(request, response);
    }
}
