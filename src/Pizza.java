//CLASSE ABSTRAITE:Pizza
public interface Pizza extends Nourriture{
	
	//String pizzaDescription = "";
	
	public String affichePizzaDescription();
	
	public abstract double calculPrix();	
}