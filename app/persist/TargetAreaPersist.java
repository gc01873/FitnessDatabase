package persist;

import io.ebean.DB;
import io.ebean.Database;
import models.TargetArea;

import javax.inject.Inject;


import java.util.*;

public class TargetAreaPersist {
    private final Database database;

    @Inject
    public TargetAreaPersist(){
        this.database = DB.getDefault();
    }

    public Map<String, String> getAllTargetAreas(){
        Map<String, String> targetAreas = new HashMap<String,String>();
        List<TargetArea> targetAreaList = database.find(TargetArea.class).findList();
        for(TargetArea targetArea : targetAreaList) {
            targetAreas.put(String.valueOf(targetArea.area), String.valueOf(targetArea.category));
        }
        return targetAreas;
    }

}