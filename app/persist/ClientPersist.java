package persist;

import io.ebean.DB;
import io.ebean.Database;
import models.Client;

import javax.inject.Inject;
import java.util.*;

public class ClientPersist {
    private final Database database;

    @Inject
    public ClientPersist(){
        this.database = DB.getDefault();
    }

    public List<Client> getAllClients(){
        return database.find(Client.class).findList();
    }

    public Client findById(int id){
        return database.find(Client.class, id);
    }

    public void persist(Client client){
        database.insert(client);
    }

    public void update(Client client){
        database.update(client);
    }

    public Optional<List<Client>> findByKeyword(String query, String searchType){
        List<Client> clients;
        Set<Client> clientset = new HashSet<Client>();

        if(searchType.equals("fname")){
            clients = database.find(Client.class).where().like("fname", "%" + query + "%").findList();
        }else{
            clients = database.find(Client.class).where().like("lname", "%" + query + "%").findList();
        }
        return Optional.of(clients).filter(clientlist -> ! clientlist.isEmpty());
    }

}