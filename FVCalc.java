// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	int invested = Integer.parseInt(args[0]);
	double interestrate = Double.parseDouble(args[1]);
	int years = Integer.parseInt(args[2]);
	double futurevalue = invested * (double)(Math.pow((1 + interestrate/100), years));
	int futurevalueint = (int) Math.round(futurevalue);
	System.out.println( "After " + years + " years, $" + invested + " saved at " + interestrate + "% will yield $" + futurevalueint);
}
}