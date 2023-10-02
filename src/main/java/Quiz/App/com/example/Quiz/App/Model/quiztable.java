package Quiz.App.com.example.Quiz.App.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class quiztable {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;
    String category;
    String difficultyLevel;
    String questionTitle;
    String a;
    String b;
    String c;
    String d;
    String answers;
}
