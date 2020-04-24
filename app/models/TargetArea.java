package models;

import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "targetarea")
public class TargetArea extends Model{

    @Id
    public String area;

    public int intensity;
    public cat category;
    public enum cat{
        AEROBIC, WEIGHTLIFTING, BODYWEIGHT, BALANCE
    }

    @ManyToOne
    public Client client;

    public String toString(){
        return area + " " + intensity + " " + category;
    }

}