package persist;

import io.ebean.DB;
import io.ebean.Database;
import models.Trainer;

import javax.inject.Inject;


import java.util.*;


public class TrainerPersist {

    private final Database database;

    @Inject
    public TrainerPersist(){
        this.database = DB.getDefault();
    }

    public List<Trainer> getAllTrainers(){
        return database.find(Trainer.class).findList();
    }

    public Trainer findById(int id){
        return database.find(Trainer.class, id);
    }
    public void persist(Trainer trainer){
        database.insert(trainer);
    }
    public void update(Trainer trainer){
        database.update(trainer);
    }
    public Optional<List<Trainer>> findByKeyword(String query, String searchType){
        List<Trainer> trainers;
        Set<Trainer> trainerSet = new HashSet<Trainer>();

        if(searchType.equals("fname")){
            trainers = database.find(Trainer.class).where().like("fname", "%" + query + " ").findList();
        }else{
            trainers = database.find(Trainer.class).where().like("lname", "%" + query + " ").findList();
        }
        return Optional.of(trainers).filter(trainerlist -> !trainerlist.isEmpty());
    }


}