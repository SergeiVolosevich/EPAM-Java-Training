public class Task03 {
    public static void main(String[] args) {
        int weightOfDinosaur = 3500;

	int weightInGr = WeightConversion.toGrams(weightOfDinosaur);
        long weightInMg = WeightConversion.toMilligrams(weightOfDinosaur);
	double weightInTons = WeightConversion.toTons(weightOfDinosaur);

	System.out.printf("\nDinosaur weight in grams is %d", weightInGr);
	System.out.printf("\nDinosaur weight in milligrams is %d", weightInMg);
	System.out.printf("\nDinosaur weight in tons is %.2f", weightInTons);
    }
}