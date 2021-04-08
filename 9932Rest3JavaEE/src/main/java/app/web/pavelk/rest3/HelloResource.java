package app.web.pavelk.rest3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/user")
public class HelloResource {

    EntityManager em;

    @GET
    @Produces("text/plain")
    public String hello() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        em = emf.createEntityManager();
        List<User> resultList = em.createQuery("select s from User as s", User.class).getResultList();
        System.out.println(resultList);
        return resultList.toString();
    }
}