package flyaway;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="flights")
public class flights {
	@Id
	@Column(name="id")
int  id;
	@Column (name="src")
String source;
	@Column (name="des")
String destination;
@Column (name="airline")
String airline;
@Column (name=" ticket_price")
String ticket_price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getAirline() {
	return airline;
}
public void setAirline(String airline) {
	this.airline = airline;
}
public String getTicket_price() {
	return ticket_price;
}
public void setTicket_price(String ticket_price) {
	this.ticket_price = ticket_price;
}
	


}
