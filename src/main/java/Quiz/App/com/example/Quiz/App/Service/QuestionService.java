package Quiz.App.com.example.Quiz.App.Service;

import Quiz.App.com.example.Quiz.App.Dao.QuestionDao;
import Quiz.App.com.example.Quiz.App.Model.quiztable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<quiztable> getAllQuestions(){
    return questionDao.findAll();
    }

    public List<quiztable> getAllQuestionsByCategory(String item){
        return questionDao.findByCategory( item);

    }
}
