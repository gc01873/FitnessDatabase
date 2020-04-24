package models;

import io.ebean.Model;
import play.data.validation.Constraints;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "exercise")
public class Exercise extends Model{
    @Id
    public int id;
    
    public String nameOfExercise;
    public String area;
    public int difficulty;
    public cat category;
    public enum cat{
        AEROBIC, WEIGHTLIFTING, BODYWEIGHT, BALANCE
    }

    @ManyToMany(cascade = CascadeType.ALL)
    public List<TargetArea> targetAreas;

    public String toString(){
        return nameOfExercise + " " + area + " " + difficulty + " " + category;
    }

}