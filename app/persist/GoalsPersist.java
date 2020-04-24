package persist;

import io.ebean.DB;
import io.ebean.Database;
import models.Goals;

import javax.inject.Inject;


import java.util.*;

public class GoalsPersist {
    private final Database database;

    @Inject 
    public GoalsPersist(){
        this.database = DB.getDefault();
    }

    public Map<String, String> getAllGoals(){
        Map<String, String> goals = new HashMap<String,String>();
        List<Goals> goalsList = database.find(Goals.class).findList();
        for(Goals goal : goalsList) {
            goals.put(String.valueOf(goal.clientID), String.valueOf(goal.targetBMI));
        }
        return goals;
    }
}