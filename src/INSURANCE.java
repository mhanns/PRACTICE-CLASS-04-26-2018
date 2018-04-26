//Maurice Hanns CSC 242 04/26/2018

public class INSURANCE {

	private static int Age;
	private static double weight;
	private static double income;
	
	public INSURANCE(int Ag, double wght, double inc) {
		
		Age = Ag;
		weight = wght;
		income = inc;
	}

	public static String riskCategory() {
		
		String risk;
		
		if (Age > 58){
			risk = "High Risk Categorie";}
		
		else if (Age <= 58 && Age >= 38 && income >= 50000){
			risk = "Low Risk Categorie";}
		
		else if (Age <= 18 && Age < 38 && weight < 200){
			risk = "Healty Categorie";}
		
		else {
			risk = "Minor Categorie";}
		
		return risk;
	}
	
	
}
