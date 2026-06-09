public class CinemexTicket extends MovieTicket{
    public boolean status;
    public String genre;
    public static int total;
    public int id;
    public static int getTotalTickets(){
        return total;
    }
    public CinemexTicket(String movie, String time, String genre, String date){
        super(movie,date,time,seatPrices[0]); super.seat = "Regular"; this.genre = genre; CinemexTicket.total++; this.id = CinemexTicket.total;
    }
    public CinemexTicket(String movie, String time, String genre, String date, String seat){
        super(movie,date,time,seatPrices[0]); super.seat = seat; this.genre = genre; CinemexTicket.total++; this.id = CinemexTicket.total;
    }
    public void calculateTicketPrice(){
        String [] time = super.showtime.split(":");
        int x = Integer.parseInt(time[0]);
        for(int i =0; i<super.seatPrices.length; i++){
            if(super.seat.equalsIgnoreCase(super.seatTypes[i])){
                setPrice(seatPrices[i]);
            }
        }
        if(x-12>=6 && x-12<=11){
            setPrice(getPrice()+(getPrice()*CinemexTicket.nightShowCharge/100.0));
        }
        System.out.println("Ticket price is calculated successfully.");
    }
    public String confirmPayment(){
        if(this.status == true){
            return ("Ticket price is already paid!");
        }
        this.status = true;
        return("Payment Successful.");
    }
    public String toString(){
        String payment;
        if(this.status == true){
            payment = "Paid";
        }
        else{
            payment = "Not Paid";
        }
        String s = String.format("Genre: %s\nSeat Type: %s\nPrice(tk): %.1f\nStatus: %s",this.genre,super.seat,getPrice(),payment);
        return ("Ticket ID: "+super.getMovie()+"-"+super.seat.charAt(0)+"-"+this.id+"\n"+super.toString()+"\n"+s);
    }
}
