package models;

import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "goals")
public class Goals extends Model{

    @Id
    public int clientID;
    public int targetBMI;
    public int targetWeight;

    @OneToOne
    public Client client;

    public String toString(){
        return clientID + " " + targetBMI + " " + targetWeight;
    }

}