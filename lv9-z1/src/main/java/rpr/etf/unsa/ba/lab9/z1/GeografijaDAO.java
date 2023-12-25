package rpr.etf.unsa.ba.lab9.z1;

import java.sql.*;
import java.util.ArrayList;

public class GeografijaDAO {
    private static GeografijaDAO instance=null;
    private Connection conn;
    private PreparedStatement dajGlavniGrad, dajDrzavu, dajBrojStanovnika, dajGradove;

    private GeografijaDAO() {
        String url="jdbc:sqlite:identifier.sqlite";
        try{
            conn= DriverManager.getConnection(url);
            dajGlavniGrad=conn.prepareStatement("SELECT grad.naziv" +
                                                    "from grad, drzava" +
                                                    "where grad.id=drzava.glavni_grad and lower(drzava.naziv)=lower('?');");
            dajDrzavu=conn.prepareStatement("SELECT drzava.naziv" +
                                                "from grad, drzava" +
                                                "where grad.drzava=drzava.id and lower(grad.naziv)=lower('?');");
            dajBrojStanovnika=conn.prepareStatement("Select grad.broj_stanovnika" +
                                                        "from grad" +
                                                        "where lower(grad.naziv)=lower('?');");
            dajGradove=conn.prepareStatement("select id, naziv, broj_stanovnika, drzava"+
                                                 "from grad" +
                                                 "order by broj_stanovnika desc;");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static GeografijaDAO getInstance(){
        if(instance==null) instance=new GeografijaDAO();
        return instance;
    }

    public static void removeInstance(){
        if(instance!=null){
            try{
                instance.conn.close();
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
        instance=null;
    }
    public ArrayList<Grad> gradovi(){
        ArrayList<Grad> gradovi=new ArrayList<>();
        try {
            //Statement stmt = conn.createStatement();
            ResultSet result = dajGradove.executeQuery();

            while (result.next()) {
                Grad grad = new Grad(result.getInt(1),result.getString(2),result.getInt(3),result.getInt(4));
                gradovi.add(grad);
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return gradovi;
    }
}