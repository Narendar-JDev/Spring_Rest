package in.ineuron.response;




public class Ticket {

	private String ticketId;
	private String ticketStatus;
	private Double ticketPrice;
	private String passengerName;
	private String from;
	private String to;
	private String journeyDate;
	private String trainNumber;
	
	public Ticket() {
		
	}
	public Ticket(String ticketId, String ticketStatus, Double ticketPrice, String passengerName, String from,
			String to, String journeyDate, String trainNumber) {
		super();
		this.ticketId = ticketId;
		this.ticketStatus = ticketStatus;
		this.ticketPrice = ticketPrice;
		this.passengerName = passengerName;
		this.from = from;
		this.to = to;
		this.journeyDate = journeyDate;
		this.trainNumber = trainNumber;
	}


	public String getTicketId() {
		return ticketId;
	}


	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}


	public String getTicketStatus() {
		return ticketStatus;
	}


	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}


	public Double getTicketPrice() {
		return ticketPrice;
	}


	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}


	public String getPassengerName() {
		return passengerName;
	}


	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getJourneyDate() {
		return journeyDate;
	}


	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}


	public String getTrainNumber() {
		return trainNumber;
	}


	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}


	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", ticketStatus=" + ticketStatus + ", ticketPrice=" + ticketPrice
				+ ", passengerName=" + passengerName + ", from=" + from + ", to=" + to + ", journeyDate=" + journeyDate
				+ ", trainNumber=" + trainNumber + "]";
	}
	
	
	
	
}
