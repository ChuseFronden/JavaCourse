import java.text.DecimalFormat;
import java.util.ArrayList;

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
public class ObjectsPizzaArrayList {

	public static void main(String[] args) {
		ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
		pizzaList.add(new Pizza("Diavolo",8.75));
		pizzaList.add(new Pizza("Frutti al Mare",9.00));
		pizzaList.add(new Pizza("Alla Pollo",7.50));
		
		for (int i = 0; i < pizzaList.size(); i++) {
			 System.out.println(pizzaList.get(i));
			}

		}

	}

