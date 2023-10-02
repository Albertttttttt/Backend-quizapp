package Quiz.App.com.example.Quiz.App.Controller;


import Quiz.App.com.example.Quiz.App.Model.quiztable;
import Quiz.App.com.example.Quiz.App.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// Because this is where I want to accept the request
@RequestMapping("/question")

public class QuestionController {
    @Autowired
            //Object of Question Service
    QuestionService questionService;
    @GetMapping("/allQuestions")
    public List<quiztable> getAllQuestions() { //We don't want to return a string but an object
       return questionService.getAllQuestions() ;
    }


    @GetMapping("/category/{item}")
    public List<quiztable> getAllQuestionsByCategory(@PathVariable String item){
        return questionService.getAllQuestionsByCategory(item);

    }
}
