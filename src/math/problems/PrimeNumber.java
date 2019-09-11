package math.problems;

import databases.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<Object> list = new ArrayList<>();


		int counter = 0;
		for (int i = 2; i <= 1000000; i++) {
			if ((isPrime(i))) {
				counter++;
				System.out.println(i);
				list.add(i);


			}
		}

       // connectToSqlDB.insertDataFromArrayToSqlTable(newArray, "tbl_lowestNumber", "SortingNumbers");
       // lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "SortingNumbers");

    }

	public static boolean isPrime(int n) {
		if (n == 2) return true;

		if (n % 2 == 0) return false;

		for (int i = 3; i * i <= n; i = i + 2) {
			if (n % i == 0) {
				return false;

			}
		}
		return true;
	}
}






