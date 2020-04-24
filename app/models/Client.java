package models;

import io.ebean.Model;
import play.data.validation.Constraints;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.List;
import javax.persistence.CascadeType;

@Entity
@Table(name = "client")
public class Client extends Model{

    @Id
    public int id;

    public String fname;
    public String lname;
    public int weight;
    public int height;
    public int BMI;
    public int experience;
    

    @ManyToOne
    public Trainer trainer;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client", cascade = CascadeType.ALL)
    public List<TargetArea> targetAreas;

    @OneToOne
    public Goals goal;

    public String toString(){
        return fname + " " + lname + " " + weight + " " + height + " " + BMI + " " + experience;
    }

}