public class Tax{
	private int filingStatus;
	public final static int SINGLE_FILER = 0;
	public final static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public final static int MARRIED_SEPARATELY = 2;
	public final static int HEAD_OF_HOUSEHOLD = 3;
	private int[][] brackets;
	private double[]rates;
	private double taxableIncome;

	public Tax(){
		filingStatus = SINGLE_FILER;
		int[][] brackets = {
			{27050, 65550, 136750, 297350},
			{45200, 109250, 166500, 297350},
			{22600, 54625, 83250, 148675,},
			{36250, 93650, 151650, 297350}
		};
		setBrackets(brackets);
		double[] rates = {0.15, 0.275, 0.305, 0.355, 0.391};
		setRates(rates);
		taxableIncome = 0;
	}

	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome){
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}

	public int getFilingStatus(){
		return filingStatus;
	}

	public void setFilingStatus(int filingStatus){
		this.filingStatus = filingStatus;
	}

	public int[][] getBrackets(){
		return brackets;
	}

	public void setBrackets(int[][] brackets){
		this.brackets = brackets;
	}

	public double[] getRates(){
		return rates;
	}

	public void setRates(double[] rates){
		this.rates = rates;
	}

	public double getTaxableIncome(){
		return taxableIncome;
	}

	public void setTaxableIncome(double taxableIncome){
		this.taxableIncome = taxableIncome;
	}

	public double getTax(){
		double tax = 0;

		if (taxableIncome <= brackets[filingStatus][0]) {
			return tax = taxableIncome * rates[0];
		}
		else{
			tax = brackets[filingStatus][0] * rates[0];
		}

		int i;
		for (i = 1; i < brackets[0].length; i++) {
			if (taxableIncome > brackets[filingStatus][i]) {
				tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];
			}
			else{
				tax += (taxableIncome - brackets[filingStatus][i - 1]) * rates[i];
				break;
			}

		}
		if (i == brackets[0].length && taxableIncome > brackets[filingStatus][i - 1]) {
			tax += (taxableIncome - brackets[filingStatus][i-1]) * rates[i];
		}
		return tax;
	}
}