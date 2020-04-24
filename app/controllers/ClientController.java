package controllers;

import models.Client;
import models.Trainer;
import models.Goals;
import persist.ClientPersist;
import persist.TrainerPersist;
import persist.GoalsPersist;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import misc.Search;
import views.html.BMI.*;
import views.html.Home.*;

import javax.inject.Inject;
import java.util.*;


public class ClientController extends Controller{

    private final ClientPersist clientPersist;
    private final TrainerPersist trainerPersist;
    private final GoalsPersist goalsPersist;

    @Inject
    FormFactory formFactory;

    @Inject
    public ClientController(){
        clientPersist = new ClientPersist();
        trainerPersist = new TrainerPersist();
        goalsPersist = new GoalsPersist();
    }

    public Result index(Http.Request request, int height, int weight){
        double bmi = (703 * weight)/ (height * height);
        return request.session().getOptional(bmi)
                .map(() -> ok(bodyMassIndex.render(request.session(), bmi)))
                .orElseGet(() -> ok(home.render(request.session())));
    }
    public Result home(Http.Request request){
        return ok(home.render(request.session()));
    }

}