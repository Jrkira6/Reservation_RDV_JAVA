
package reservation_rdv;

import java.util.*;

public class Main {


    public static void main(String[] args) {
      
        Scanner per = new Scanner(System.in);
        
        // Instance des classes ... 
        
        Personne personne = new Personne(null,null,0);
        Structure structure = new Structure(null,null);
        Reservation reservation = new Reservation(null,null,null);
        
        
        System.out.println("Bonjour, on vous souhaite la bienvenue sur notre plateforme de reservation\n ");
        System.out.println("Que voulez-vous faire ?");
         System.out.println("1. Faire une reservation ");
         System.out.println("2. Annuler une reservation en cours ");
         System.out.println("3. A propos de notre Structure");
         
         // variable pour la Switch() ....
         Scanner chx = new Scanner(System.in);
         int choix = chx.nextInt();
         switch(choix){
             case 1 :
                 
                 // Recuperation des informations ...
                  System.out.println("Veillez renseigner votre nom et prenom(si vous en avez)");
                  personne.Nom = per.nextLine();
                  System.out.println("Veillez renseigner également votre age");
                  personne.age = per.nextInt();
                  System.out.println("Quel est votre profession(Si vous en avez) ?");
                  personne.Profession = per.nextLine();
                 
                  // Reservation en cours
                  System.out.println("\n Vos informations ont été bien pris en compte "+personne.Nom);
                  System.out.println("Que voulez vous reserver ?");
                  System.out.println("1. Une chambre");
                  System.out.println("2. Une table au restaurant");
                  System.out.println("3. Un Bar");
                  System.out.println("4. Un parcking");
                  System.out.println("5. Une salle de conférence");
                  System.out.println("6. Autre chose");
                  
                  Scanner chx_typ_res = new Scanner(System.in);
                  int choix_type_reserv = chx_typ_res.nextInt();
                  
                  Scanner res = new Scanner(System.in);
                  
                  switch(choix_type_reserv){
                      case 1 :
                          System.out.println("Trés bien, une chambre");
                      break;
                      case 2 :
                          System.out.println("Trés bien, une table au restaurant");
                      break;
                      case 3 :
                          System.out.println("Trés bien, un Bar");
                      break;
                      case 4 :
                          System.out.println("Trés bien, un parcking");
                      break;
                      case 5 :
                          System.out.println("Trés bien, une Salle de conférence");
                      break;
                      case 6 :
                          System.out.println("Trés bien, veillez renseigner votre reservation : ");
                          reservation.Motif_Reservation = res.nextLine();
                          System.out.println("Trés bien, une reservation pour "+reservation.Motif_Reservation+", Veillez vous rendre à la structure pour plus de détails par rapport a votre reservation ");
                      break;
                      default:
                          System.out.println("Entrée non valide");
                      break; 
                  }
                  
                  System.out.println("Renseinez la date de votre reservation (format : dd/mm/yyyy)");
                  Scanner date_reser = new Scanner(System.in);
                  reservation.date_Reservation = date_reser.nextLine();
                  
             break;
         }
        
        
    }
    
}
