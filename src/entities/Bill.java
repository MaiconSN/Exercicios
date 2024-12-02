package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	
	public double feeding() {
		return (beer * 5.0) + (barbecue * 7.0) + (softDrink * 3.00); 
	}
	
	public double ticket() {
		double ticketValue = 0;
		if (gender == 'M') {
			ticketValue = 10.00;
		}
		else if (gender == 'F') {
			ticketValue = 8.00;
		}
		return ticketValue;
	}
	
	public double cover() {
		double coverValue = 0;
		if (feeding() > 30.0) {
		    coverValue = 0;;	
		}
		if (feeding() <= 30.0) {
			coverValue = 4.00;
		}
		return coverValue;
}
	
	public double total() {
		return feeding() + ticket() + cover();
	}
	
	public String toString() {
		if (cover() == 0) {
			return "\nRELATÓRIO\n" + "Consumo = R$ " + String.format("%.2f",feeding()) + "\nInsento de Couvert\n" + "Ingresso = R$ " + String.format("%.2f",ticket()) + "\n" + "\nValor a pagar = R$ " + String.format("%.2f",total());
		}
		else {
			return "\nRELATÓRIO\n" + "Consumo = R$ " + String.format("%.2f",feeding()) + "\nCouvert = R$ " + String.format("%.2f", cover()) + "\nIngresso = R$ " + String.format("%.2f",ticket()) + "\n" + "\nValor a pagar = R$ " + String.format("%.2f",total());
		}
	
	}
	

}
