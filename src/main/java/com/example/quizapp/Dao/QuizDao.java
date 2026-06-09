package com.example.quizapp.Dao;

import com.example.quizapp.model.Quiz;
import com.example.quizapp.service.QuizService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao  extends JpaRepository<Quiz, Integer> {
}
