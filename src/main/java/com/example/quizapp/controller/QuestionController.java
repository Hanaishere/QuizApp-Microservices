package com.example.quizapp.controller;

import com.example.quizapp.model.Questions;
import com.example.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public List<Questions> getAllQuestions()
    {
        return questionService.getAllQuestions();
    }

    @GetMapping("/category/{category}")
     public List<Questions> getQuestionsByCategory(@PathVariable("category") String category)
     {
        return questionService.getQuestionsByCategory(category);
     }
     @PostMapping("add")
     public Questions addQuestion(@RequestBody Questions questions)
     {
        return questionService.addQuestion(questions);

     }
}
