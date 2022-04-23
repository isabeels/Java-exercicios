package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.excecoes.DataInvalidaException;

public class Reserva {

	private Integer numQuarto;
	private Date checkIn;
	private Date checkOut;
	
	Date now = new Date();
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
	
	public void alterarData (Date checkIn, Date checkOut) throws DataInvalidaException {
		
		if(checkIn.before(now) || (checkOut.before(now))) {
			throw new DataInvalidaException("As datas não podem ser anteriores ao dia de hoje");
		}
		if (!checkOut.after(checkIn)) {
			throw new DataInvalidaException("O checkout não pode ser antes do checkin");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public void verificarData()throws DataInvalidaException {
		
		if(checkIn.before(now) || (checkOut.before(now))) {
			throw new DataInvalidaException("As datas não podem ser anteriores ao dia de hoje");
		}
		if (!checkOut.after(checkIn)) {
			throw new DataInvalidaException("O checkout não pode ser antes do checkin");
		}
	}

	@Override
	public String toString() {
		return "Reserva -> Quarto: " + numQuarto + ", checkIn: " + sdf.format(checkIn) 
		+ ", checkOut: " + sdf.format(checkOut) + ", " + periodoEstadia() + " noites.";
	}
	
	
}
