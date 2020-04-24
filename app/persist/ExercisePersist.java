package persist;

import io.ebean.DB;
import io.ebean.Database;
import models.Exercise;

import javax.inject.Inject;


import java.util.*;

public class ExercisePersist {

    private final Database database;

    @Inject
    public ExercisePersist(){
        this.database = DB.getDefault();
    }

    public Map<String, String> getAllExercises() {
        Map<String, String> exercises = new HashMap<String,String>();
        List<Exercise> exerciseList = database.find(Exercise.class).findList();
        for(Exercise exercise : exerciseList) {
            exercises.put(String.valueOf(exercise.nameOfExercise), exercise.area);
        }
        return exercises;
    }
}