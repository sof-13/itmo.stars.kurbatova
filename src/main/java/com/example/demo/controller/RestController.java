package com.example.demo.controller;

import com.example.demo.question.Question;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.web.bind.annotation.GetMapping;


import java.io.File;
import java.io.IOException;
import java.util.List;

@org.springframework.web.bind.annotation.RestController

public class RestController {
    @GetMapping("/questionsgeometry")
    public List<Question> getQuestionsGeometry() throws IOException {
        JsonMapper mapper = new JsonMapper();
        List<Question> questions = mapper.readValue(
                new File("questionsgeometry.json"),
                new TypeReference<>(){}
        );
        return questions;
    }

    @GetMapping("/questionsprobability")
    public List<Question> getQuestionsProbability() throws IOException {
        JsonMapper mapper = new JsonMapper();
        List<Question> questions = mapper.readValue(
                new File("questionsprobability.json"),
                new TypeReference<>(){}
        );
        return questions;
    }

    @GetMapping("/questionscomputations")
    public List<Question> getQuestionsComputations() throws IOException {
        JsonMapper mapper = new JsonMapper();
        List<Question> questions = mapper.readValue(
                new File("questionscomputations.json"),
                new TypeReference<>(){}
        );
        return questions;
    }

    @GetMapping("/questionsderivative")
    public List<Question> getQuestionsDerivative() throws IOException {
        JsonMapper mapper = new JsonMapper();
        List<Question> questions = mapper.readValue(
                new File("questionsderivative.json"),
                new TypeReference<>(){}
        );
        return questions;
    }

    @GetMapping("/questionswordproblems")
    public List<Question> getQuestionsWordproblems() throws IOException {
        JsonMapper mapper = new JsonMapper();
        List<Question> questions = mapper.readValue(
                new File("questionswordproblems.json"),
                new TypeReference<>(){}
        );
        return questions;
    }

}