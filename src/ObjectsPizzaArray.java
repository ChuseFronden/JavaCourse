import java.text.DecimalFormat;


class Pizza {
	
	private  String name;
	private  double price;
	
	public Pizza(String name, double price) {
		
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	DecimalFormat twoZero = new DecimalFormat("0.00");
	public String toString() {
		return name+" ("+twoZero.format(price).replace(".", ",")+" euros)";
	}
	}
public class ObjectsPizzaArray {

	public static void main(String[] args) {
		Pizza[] pizzaArray = {
		new Pizza("Diavolo",8.75),
		new Pizza("Frutti al Mare",9.00),
		new Pizza("Alla Pollo",7.50)};
		
	for (int i = 0; i < pizzaArray.length; i++) {
			System.out.println(pizzaArray[i]);
			}
			}
	}
