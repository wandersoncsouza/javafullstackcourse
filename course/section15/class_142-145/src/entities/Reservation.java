package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");   // Foi colocado estático para que não ocorra várias instanciações

    public Reservation(){}
    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public Date getCheckin() {
        return checkin;
    }
    public Date getCheckout() {
        return checkout;
    }
    
    public long duration(){
        long  diff = checkout.getTime() - checkin.getTime();    // calcula a diferença entre as duas datas (em milisegundos com getTime). getTime() = Devolve a quantidade de milisegundos da data informada
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);     // Conversão de milisegundos para dias. TimeUnit converte o valor "diff" que está em milisegundos para dias (TimeUnit.DAYS.convert).
        
    }
    public  void updateDates(Date checkin, Date checkout){
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Room "
            + roomNumber
            + ", check-in: "
            + sdf.format(checkin)
            + ", check-out "
            + sdf.format(checkout)
            + ", "
            + duration()
            + " nights";
    }
}
