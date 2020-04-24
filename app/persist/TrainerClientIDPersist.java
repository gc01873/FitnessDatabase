package persist;

import io.ebean.DB;
import io.ebean.Database;
import models.TrainerClientID;

import javax.inject.Inject;


import java.util.*;

public class TrainerClientIDPersist {

    private final Database database;

    @Inject
    public TrainerClientIDPersist(){
        this.database = DB.getDefault();
    }
    public Map<String, String> getAllGoals(){
        Map<String, String> trainerClients = new HashMap<String,String>();
        List<TrainerClientID> trainerClientsList = database.find(TrainerClientID.class).findList();
        for(TrainerClientID trainerClient : trainerClientsList) {
            trainerClients.put(String.valueOf(trainerClient.clientID), String.valueOf(trainerClient.trainerID));
        }
        return trainerClients;
    }

}