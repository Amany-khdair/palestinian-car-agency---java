
public class Driver {
	static Car max;

	public static void main(String[] args) {
		Car[] array = new Car[5];
		// we fill the arrays as follow:
		array[0] = new Car("0123-A", 2020, 10, "red", 50000, "mercedes", 2021, 4);
		array[1] = new Car("1124-B", 2009, 6, "black", 120000, "BMW", 2009, 12);
		array[2] = new Car("4143-C", 2015, 3, "blue", 80000, "jaguar", 2015, 9);
		array[3] = new Car("1223-A", 2018, 10, "silver", 100000, "land rover", 2019, 4);
		array[4] = new Car("0333-D", 2019, 2, "yellow", 70000, "mini cooper", 2019, 8);
		printCarsInfo(array);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("maximum price car informations are *-*");
		System.out.println(maxPrice(array).printCarsInfo().toUpperCase());
	}

//the following method will print all the information about cars..
	public static void printCarsInfo(Car[] cars) {
		System.out.println("the cars we have are:");
		// we put the counter (c=1) to print the number of cars from 1 to 5
		int c = 1;
		for (Car array : cars) {
			System.out.println(c + ".");
			System.out.println(array.printCarsInfo().toUpperCase());// as required all output must be in upper case
			c++;
		}
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("the car age and the guarantee *-*");
		// to get the car age and the guarantee we do the following....
		for (int x = 0; x <= cars.length - 1; x++) {
			// (to upper case) means that all the letters will be in Capital letter
			System.out.println("THE CAR AGE IS : " + "\t" + cars[x].getCarAge().toUpperCase() + "\n"
					+ "TIME OF GUARANTEE IS :" + "\t" + cars[x].getCalculateGuarantee().toUpperCase());
		}
	}

//to get the maximum price we should do the following operation..
	private static Car maxPrice(Car[] array) {
		Car max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i].getPrice() > max.getPrice())
				max = array[i];
		}
		return max;

	}
}
//end of the assignment :)