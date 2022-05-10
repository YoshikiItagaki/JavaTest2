package jp.co.aforce.practice;

public class Tax{

	private static final double TAX_RATE = 0.1;
	double item;
	double price;

	public void purchase(double item) {
		this.item = item;

		price = (item*(1+TAX_RATE));
		System.out.println(Integer.valueOf((int)price));
		/*		System.out.println(Double.valueOf((double)price));
		*/
		}

	public static void main(String[] args) {

		Tax tax = new Tax();
		tax.purchase(1500);

	}

}
