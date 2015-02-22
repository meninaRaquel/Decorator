public abstract class DecorateurPizza implements Nourriture{
	Nourriture pizza;
	
	public DecorateurPizza(Nourriture pizza){
		this.pizza = pizza;
	}
	public abstract double calculPrix();/*{
		return pizza.calculPrix();
	}*/
	public abstract String affichePizzaDescription ();/*{
		return pizza.affichePizzaDescription();
	}*/
}
