
package reservation_rdv;

public class Reservation {

    public String date_Reservation;
    public String Code_Gen_for_Reservation;
    public String Motif_Reservation;
    
    public Reservation(String date_Reservation,String Code_Gen_for_Reservation,String Motif_Reservation){
       
        this.Code_Gen_for_Reservation = "HOTEL_KLHS5XBSND555";
        this.Motif_Reservation = Motif_Reservation;
        this.date_Reservation = date_Reservation;        
    }
    
}
