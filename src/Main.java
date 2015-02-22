
public class Main {
	
	public static void main(String []args){
		Pizza p1 = new PizzaPateFine();
		DecorateurPizza b = new BouletteViande(p1);
		DecorateurPizza f = new Fromage(p1);

		System.out.println(p1.affichePizzaDescription());
		System.out.println(b.affichePizzaDescription());
		System.out.println(f.affichePizzaDescription());
		
		Nourriture p2 = new BouletteViande( new Fromage( new Thon(new PizzaClassique())) );
		System.out.println(p2.affichePizzaDescription());
	}

}
