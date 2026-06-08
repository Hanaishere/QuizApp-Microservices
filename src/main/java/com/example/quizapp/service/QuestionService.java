package com.example.quizapp.service;

import com.example.quizapp.Dao.QuestionDao;
import com.example.quizapp.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Questions> getAllQuestions() {
      return   questionDao.findAll();
    }


    public List<Questions> getQuestionsByCategory(String category)
    {

            return questionDao.findByCategory(category);

    }

    public Questions addQuestion(Questions questions) {
        return questionDao.save(questions);
    }
}
