public class BouletteViande extends DecorateurPizza{
	public BouletteViande(Nourriture pizza){
		super(pizza);
	}
	public double calculPrix(){
		return 5.10+super.pizza.calculPrix();
	}
	public String affichePizzaDescription(){
		return super.pizza.affichePizzaDescription()+", Boulette de viande";
	}
	//coucou
}
