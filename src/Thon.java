public class Thon extends DecorateurPizza{
	public Thon(Nourriture pizza){
		super(pizza);
	}
	public double calculPrix(){
		return 6.10+super.pizza.calculPrix();
	}
	public String affichePizzaDescription(){
		return super.pizza.affichePizzaDescription()+", Thon";
	}
}
