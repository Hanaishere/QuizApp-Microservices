package com.example.quizapp.service;

import com.example.quizapp.Dao.QuestionDao;
import com.example.quizapp.model.Questions;
import com.example.quizapp.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Questions> getAllQuestions() {
      return   questionDao.findAll();
    }


}
