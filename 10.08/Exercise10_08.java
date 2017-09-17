public class Exercise10_08{
	public static void main(String[] args) {
		Tax taxFor2001 = new Tax();
		System.out.println("2001 Tax Table");
    	System.out.println("taxable\tSingle\tMarried\tMarried\tHead of");
    	System.out.println("Income\tSingle\tJoint\tSeparate\ta House");
    	System.out.println("-----------------------------------------");
    	for (int taxableIncome = 50000; taxableIncome < 60000; taxableIncome += 1000) {
    		taxFor2001.setTaxableIncome(taxableIncome);
     		taxFor2001.setFilingStatus(0);
      		int taxForStatus0 = (int)taxFor2001.getTax();
      		taxFor2001.setFilingStatus(1);
		    int taxForStatus1 = (int)taxFor2001.getTax();
		    taxFor2001.setFilingStatus(2);
		    int taxForStatus2 = (int)taxFor2001.getTax();
		    taxFor2001.setFilingStatus(3);
		    int taxForStatus3 = (int)taxFor2001.getTax();
		    System.out.println("| " + taxableIncome + "\t|" + taxForStatus0 + "\t|" +
		      taxForStatus1 + "\t|" + taxForStatus2 + "\t|" + taxForStatus3 + "\t|");
		    System.out.println("-----------------------------------------");
    	}

    	int[][] bracketsFor2009 = {
    		{8350, 33950, 82250, 171550, 372950},  // Single filer
			{16700, 67900, 137050, 20885, 372950}, // Married jointly// -or qualifying widow(er)
			{8350, 33950, 68525, 104425, 186475},  // Married separately
			{11950, 45500, 117450, 190200, 372950} // Head of household
    	};
    	double[] ratesFor2009 = {0.1, 0.15, 0.25, 0.28, 0.33, 0.35};

    	Tax taxFor2009 = new Tax(0, bracketsFor2009, ratesFor2009, 50000);
    	System.out.println("2009 Tax Table");
    	System.out.println("taxable\tSingle\tMarried\tMarried\tHead of");
    	System.out.println("Income\tSingle\tJoint\tSeparate\ta House");
    	System.out.println("-----------------------------------------");
    	for (int taxableIncome = 50000; taxableIncome < 60000; taxableIncome += 1000) {
    		taxFor2009.setTaxableIncome(taxableIncome);
     		taxFor2009.setFilingStatus(0);
      		int taxForStatus0 = (int)taxFor2009.getTax();
      		taxFor2009.setFilingStatus(1);
		    int taxForStatus1 = (int)taxFor2009.getTax();
		    taxFor2009.setFilingStatus(2);
		    int taxForStatus2 = (int)taxFor2009.getTax();
		    taxFor2009.setFilingStatus(3);
		    int taxForStatus3 = (int)taxFor2009.getTax();
		    System.out.println("| " + taxableIncome + "\t|" + taxForStatus0 + "\t|" +
		      taxForStatus1 + "\t|" + taxForStatus2 + "\t|" + taxForStatus3 + "\t|");
		    System.out.println("-----------------------------------------");
    	}

	}
}
/*
			2001 Tax Table
		taxable Single  Married Married Head of
		Income  Single  Joint   Separate        a House
		-----------------------------------------
		| 50000 |10368  |8100   |10925  |9218   |
		-----------------------------------------
		| 51000 |10643  |8375   |11200  |9493   |
		-----------------------------------------
		| 52000 |10918  |8650   |11475  |9768   |
		-----------------------------------------
		| 53000 |11193  |8925   |11750  |10043  |
		-----------------------------------------
		| 54000 |11468  |9200   |12025  |10318  |
		-----------------------------------------
		| 55000 |11743  |9475   |12311  |10593  |
		-----------------------------------------
		| 56000 |12018  |9750   |12616  |10868  |
		-----------------------------------------
		| 57000 |12293  |10025  |12921  |11143  |
		-----------------------------------------
		| 58000 |12568  |10300  |13226  |11418  |
		-----------------------------------------
		| 59000 |12843  |10575  |13531  |11693  |
		-----------------------------------------
		2009 Tax Table
		taxable Single  Married Married Head of
		Income  Single  Joint   Separate        a House
		-----------------------------------------
		| 50000 |8687   |6665   |8687   |7352   |
		-----------------------------------------
		| 51000 |8937   |6815   |8937   |7602   |
		-----------------------------------------
		| 52000 |9187   |6965   |9187   |7852   |
		-----------------------------------------
		| 53000 |9437   |7115   |9437   |8102   |
		-----------------------------------------
		| 54000 |9687   |7265   |9687   |8352   |
		-----------------------------------------
		| 55000 |9937   |7415   |9937   |8602   |
		-----------------------------------------
		| 56000 |10187  |7565   |10187  |8852   |
		-----------------------------------------
		| 57000 |10437  |7715   |10437  |9102   |
		-----------------------------------------
		| 58000 |10687  |7865   |10687  |9352   |
		-----------------------------------------
		| 59000 |10937  |8015   |10937  |9602   |
		-----------------------------------------
 */