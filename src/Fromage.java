public class Fromage extends DecorateurPizza{
	public Fromage(Nourriture pizza){
		super(pizza);
	}
	public double calculPrix(){
		return 7.10+super.pizza.calculPrix();
	}
	public String affichePizzaDescription(){
		return super.pizza.affichePizzaDescription()+", Fromage";
	}
}
