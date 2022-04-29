
//Palestinian car agency:
//in this assignment we will print all the information about 5 cars and print the car with the maximum price in addition to its age and its guarantee.
import java.util.Date;

//Apply every step in the UML...
public class Car {
	private String PlateNo;
	private int yearmanufacture;
	private int monthmanufacture;
	private String color;
	private double price;
	private String manufactureby;
	private int guaranteedueyear;
	private int guaranteeduemounth;

	@SuppressWarnings("deprecation")
	public Car() {
		Date date = new Date();
		// we put here the default information from the given in the assignment if the
		// user does not enter any values
		PlateNo = "0123-A";
		yearmanufacture = date.getYear() + 1900;
		monthmanufacture = date.getMonth() + 1;
		color = "red";
		price = 50000.00;
		manufactureby = "marcedes";
		guaranteedueyear = (((date.getMonth() + 1 + 6) / 12) + date.getYear() + 1900);
		guaranteeduemounth = ((date.getMonth() + 7) % 12);
	}

	public Car(String PlateNo, int yearmanufacture, int monthmanufacture, String color, double price,
			String manufactureby, int guaranteedueyear, int guaranteeduemounth) {
		this.PlateNo = PlateNo;
		this.yearmanufacture = yearmanufacture;
		this.monthmanufacture = monthmanufacture;
		this.color = color;
		this.price = price;
		this.manufactureby = manufactureby;
		this.guaranteedueyear = guaranteedueyear;
		this.guaranteeduemounth = guaranteeduemounth;
	}

//we put the information that we are given in the UML:.
	public int getYearmanufacture() {
		return yearmanufacture;
	}

	public void setYearmanufacture(int yearmanufacture) {
		this.yearmanufacture = yearmanufacture;
	}

	public int getMonthmanufacture() {
		return monthmanufacture;
	}

	public void setMonthmanufacture(int monthmanufacture) {
		this.monthmanufacture = monthmanufacture;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public String getManufactureby() {
		return manufactureby;
	}

	public void setGuarantee(int month, int year) {
		this.yearmanufacture = year;
		this.monthmanufacture = month;
	}

//to calculate the car age we must do the following: 
	public String getCarAge() {
		Date date = new Date();
		// We subtract the current year from the year of manufacture
		@SuppressWarnings("deprecation")
		int year = ((date.getYear() + 1900) - (this.yearmanufacture));
		// After that, we convert the year into months
		int total = year * 12;
		// then we subtract the current month from the month of manufacture
		@SuppressWarnings("deprecation")
		int month = ((date.getMonth() + 1) - (this.monthmanufacture));
		// We add the months to the year that were previously converted into months
		total = month + total;
		// to get the number of years We divide the total by 12
		year = total / 12;
		// to get the number of months we take the modulus of 12
		month = total % 12;
		String et = ("car age in years:" + year + "\t" + "car age in months:" + month);
		et.toUpperCase();
		return et;
	}

	// we will do same as what we did in car age....
	@SuppressWarnings("deprecation")
	public String getCalculateGuarantee() {
		Date date = new Date();
		if (guaranteedueyear > date.getYear() + 1900) {
			// We subtract the current year from the year of manufacture
			int yearr = ((this.guaranteedueyear) - (date.getYear() + 1900));
			// After that, we convert the year into months
			int totall = yearr * 12;
			// then we subtract the current month from the month of manufacture
			int monthh = ((this.guaranteeduemounth) - (date.getMonth() + 1));
			// We add the months to the year that were previously converted into months
			totall = monthh + totall;
			// to get the number of years We divide the total by 12
			yearr = totall / 12;
			// to get the number of months we take the modulus of 12
			monthh = totall % 12;
			String ett = ("years of guarantee:" + yearr + "\t" + "months of guarantee:" + monthh);
			ett.toUpperCase();

			return ett;
		}
		return ("no guarantee ").toUpperCase();
	}

//the following will upper in the screen at the end...
	public String printCarsInfo() {
		String x = ("Car Information:" + "\n" + "PlateNo :" + PlateNo + "\n" + "Year manufacture :" + yearmanufacture
				+ "\n" + "Month manufacture: " + monthmanufacture + "\n" + "color: " + color + "\n" + "price: " + price
				+ "\n" + "Manufacture by: " + manufactureby + "\n" + "Guarantee due to year:" + guaranteedueyear + "\n"
				+ "Guarantee due to month:" + guaranteeduemounth);
		return x;
	}

}
// the end :)