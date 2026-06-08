package com.example.quizapp.service;

import com.example.quizapp.Dao.QuestionDao;
import com.example.quizapp.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<List<Questions>> getAllQuestions() {
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }


    public List<Questions> getQuestionsByCategory(String category)
    {

            return questionDao.findByCategory(category);

    }

    public Questions addQuestion(Questions questions) {
        return questionDao.save(questions);
    }
}
