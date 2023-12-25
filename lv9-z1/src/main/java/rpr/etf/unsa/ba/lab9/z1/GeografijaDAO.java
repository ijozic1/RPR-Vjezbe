package rpr.etf.unsa.ba.lab9.z1;

import java.sql.*;
import java.util.ArrayList;

public class GeografijaDAO {
    private static GeografijaDAO instance=null;
    private Connection conn;
    private PreparedStatement dajGlavniGrad, dajDrzavu, dajBrojStanovnika, dajGradove, kreirajGrad, kreirajDrzavu, alterGrad, upitSviGradovi;

    private void stvoriBazu(){
        try{
            kreirajGrad.executeQuery();
            kreirajDrzavu.executeQuery();
            alterGrad.executeQuery();

            String upitG1="insert into grad(id,naziv,broj_stanovnika, drzava) " +
                        "values ((select max(id) from grad)+1,'London',8539000, 1);";
            String upitD1="insert into drzava(id, naziv, glavni_grad) " +
                    "values((select max(id) from drzava)+1,'Ujedinjeno Kraljevstvo',1);";
            Statement stmt= conn.createStatement();
            stmt.execute(upitG1);
            stmt.execute(upitD1);


            upitG1="insert into grad(id,naziv,broj_stanovnika, drzava) " +
                    "values ((select max(id) from grad)+1,'Pariz',2161000, 2);";
            upitD1="insert into drzava(id, naziv, glavni_grad) " +
                    "values((select max(id) from drzava)+1,'Francuska',2);";
            stmt.execute(upitG1);
            stmt.execute(upitD1);

            upitG1="insert into grad(id,naziv,broj_stanovnika, drzava) " +
                    "values ((select max(id) from grad)+1,'Bec',1800000, 3);";
            upitD1="insert into drzava(id, naziv, glavni_grad) " +
                    "values((select max(id) from drzava)+1,'Austrija',3);";
            stmt.execute(upitG1);
            stmt.execute(upitD1);

            upitG1="insert into grad(id,naziv,broj_stanovnika, drzava) " +
                    "values ((select max(id) from grad)+1,'Graz',280800, 3);";
            stmt.execute(upitG1);

            upitG1="insert into grad(id,naziv,broj_stanovnika, drzava) " +
                    "values ((select max(id) from grad)+1,'Mancester',520215, 1);";
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
    private void provjeriKonekciju(){
        try{
            upitSviGradovi=conn.prepareStatement("Select * from grad;");
        }
        catch(SQLException e){
            stvoriBazu();
            try{
               upitSviGradovi=conn.prepareStatement("Select * from grad");
            }
            catch(SQLException e1){
                System.out.println(e1.getMessage());
            }
        }
    }

    private GeografijaDAO() {
        String url="jdbc:sqlite:identifier.sqlite";
        try{
            conn= DriverManager.getConnection(url);
            provjeriKonekciju();
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
            kreirajDrzavu=conn.prepareStatement("create table grad(id number primary key, naziv varchar2, broj_stanovnika number);");
            kreirajGrad=conn.prepareStatement("create table drzava(id number primary key ,naziv varchar2,glavni_grad number references grad(id));");
            alterGrad=conn.prepareStatement("alter table grad add drzava number references drzava(id);");
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