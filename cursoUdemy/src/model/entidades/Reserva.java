package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private Integer numQuarto;
	private Date checkIn;
	private Date checkOut;
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva() {
	
	}
	
	public Reserva(Integer numQuarto, Date checkIn, Date checkOut) {
		this.numQuarto = numQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long periodoEstadia() {
		long periodo = checkOut.getTime()- checkIn.getTime();
		return TimeUnit.DAYS.convert(periodo, TimeUnit.MILLISECONDS);
	}
	
	public void alterarData (Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Reserva -> Quarto: " + numQuarto + ", checkIn: " + sdf.format(checkIn) 
		+ ", checkOut: " + sdf.format(checkOut) + ", " + periodoEstadia() + " noites.";
	}
	
	
}
