package com.example.quizapp.controller;

import com.example.quizapp.model.Questions;
import com.example.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired private QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Questions>> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Questions>> getQuestionsByCategory(@PathVariable("category") String category) {
        List<Questions> questions = questionService.getQuestionsByCategory(category);
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    @PostMapping("add")
    public ResponseEntity<Questions> addQuestion(@RequestBody Questions questions) {
        Questions saved = questionService.addQuestion(questions);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}