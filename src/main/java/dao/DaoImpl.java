package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
       /*
       se connecter a la bd pour recuperer la temperature
        */
        System.out.println("version bd");
        double temp=Math.random()*40;
        return temp;
    }
}
