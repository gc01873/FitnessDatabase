package models;

import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "trainer")
public class Trainer extends Model{

    @Id
    public int id;
    
    public String fname;
    public String lname;
    public String expertise;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "trainer", cascade = CascadeType.ALL)
    public List<Client> clients;

    public String toString(){
        return fname + " " + lname + " " + expertise + " Clients:" + clients.toString(); 
    }


}