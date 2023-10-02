package Quiz.App.com.example.Quiz.App.Dao;

import Quiz.App.com.example.Quiz.App.Model.quiztable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
// To fetch data from DB.
// It is the last layer when collecting Data.
// It connects to the database

//Jpa Repository Parameters must have a table name OR "A class name that maps with the table" and Primary Key Data Type
@Repository
public interface QuestionDao extends JpaRepository<quiztable, Integer> {
     List<quiztable> findByCategory(String item);


}
