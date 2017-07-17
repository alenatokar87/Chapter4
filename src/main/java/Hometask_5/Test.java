package Hometask_5;

import javax.persistence.EntityManager;
        import javax.persistence.EntityManagerFactory;
        import javax.persistence.EntityTransaction;
        import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.Date;

public class Test {
    public static void main( String[] args )
    {   System.out.println( "Step_1" );
        ContragentType contragenttype = new ContragentType("eee","HOmee", 7);
        Category category = new Category("MOOON",new Date());
        System.out.println( "STEP2" );
        Address address = new Address();
        address.setCountry("Ukraine");
        address.setCity("Kiev");
        address.setDistrict("Golosievo");
        address.setStreet("Stepana Banderu");
        address.setHouseno("1");
        address.setFlat("77");
        address.setPostcode("44444");

        ContragentId contragentId = new ContragentId(1, 852258);

        Contragent contragent = new Contragent (contragentId,"deal deal","7656836883", category, contragenttype);

        Aaccaunt account = new Aaccaunt(contragent, new Date(), "26000000000", new Date(), new BigDecimal("20.15"));

        ContragentGroup contragentGroup = new ContragentGroup("VIP");
        ContragentGroup contragentGroup1 = new ContragentGroup ("MID");
        ContragentGroup contragentGroup2 = new ContragentGroup ( "R");

         /*Task5*/
        Address address2 = new Address("Ukraine", "11111", "rrrrrr", "TTTTTYT", "RRRRRR", "58",
                "r", contragent);



        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(contragenttype);
        em.persist(category);
        em.persist(address);
        em.persist(address2);
        em.persist(contragent);
        em.persist(account);
        em.persist(contragentGroup);
        em.persist(contragentGroup1);
        em.persist(contragentGroup2);
        tx.commit();
        em.close();
        emf.close();

    }
}
