/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import dbase.Tools;
import dbase.bdd;
import static dbase.bdd.runNonQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class patient {
            bdd b=new bdd();

     public int id;
     public String Nom;
     public String prenom;
     public String Adresse;
     public int age;
     public String tel;
     public String GS;
     public int poids;
     public int taill;

    public patient( String Nom, String prenom,String adresse, int age, String tel, String GS, int poids, int taill) {
        this.Nom = Nom;
        this.prenom = prenom;
        this.age = age;
        this.tel = tel;
        this.GS = GS;
        this.Adresse=adresse;
        this.poids = poids;
        this.taill = taill;
    }

    public patient() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public int getDate_Ne() {
        return age;
    }

    public void setDate_Ne(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGS() {
        return GS;
    }

    public void setGS(String GS) {
        this.GS = GS;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getTaill() {
        return taill;
    }

    public void setTaill(int taill) {
        this.taill = taill;
    }

     
             

    
   
     public boolean Ajouter() throws ClassNotFoundException
     {
          String requete="insert into patient(nom,prenom,adresse,age,tel,gs,taill,poids)VALUES('"+Nom+"','"+prenom+"','"+Adresse+"','"+age+"','"+tel+"','"+GS+"','"+taill+"','"+poids+"')";
       
                        return b.runNonQuery(requete);
             
    }
     public boolean Supprimer() throws ClassNotFoundException
     {
         String requete="delete from patient where id = '"+id+"'";
           if (JOptionPane.showConfirmDialog (null,"Veillez Supprimer ce Patients","Confirmation",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
               
                      return  b.runNonQuery(requete);
       
             
            }
                return false;
     }
     public boolean Modifier() throws ClassNotFoundException
     {
         
            if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

         String Req=("update patient set nom='"+Nom+"',prenom='"+prenom+"',adresse='"+Adresse+"',age='"+age+"',tel='"+tel+"',gs='"+GS+"',taill='"+taill+"',poids='"+poids+"' where id ='"+id+"'");
                      return b.runNonQuery(Req);
        
         
      }
                return false;
     }
}
/*
     public void Modifier()
     {
         try { 
            if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

         String Req=("update client set Nom='"+Nom+"',Prenom='"+prenom+"',Adresse='"+adresse+"',Animaux='"+animaux+"',Tel='"+tel+"',credit='"+credit+"' where id_client ='"+id_client+"'");
                          boolean isadd= dbase.Go.runNonQuery(Req);
          if(isadd)
       {
           
           Tools.msgBox("Le Client est Bien Modifier");
           
       }
           
            } 
        } catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de modifier !!!!!!!"+e.getMessage());
        System.err.println(e);}
     }
     public void Supprimer() throws ClassNotFoundException
     {
         String requete="delete from client where id_client = '"+id_client+"'";
           if (JOptionPane.showConfirmDialog (null,"Veillez Supprimer ce Client","Confirmation",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                         boolean isadd= dbase.Go.runNonQuery(requete);
          if(isadd)
       {  
           Tools.msgBox("Le Client est Bien Supprimer");
           
       }

             
         }
     }
    
}
*/