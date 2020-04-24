package models;

import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "trainerclientID")
public class TrainerClientID extends Model{

    @Id
    public int trainerID;
    public int clientID;

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Client> clients;

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Trainer> trainers;

    public String toString(){
        return "clients: " + clients.toString() + " Trainer: " + trainers.toString();
    }


}