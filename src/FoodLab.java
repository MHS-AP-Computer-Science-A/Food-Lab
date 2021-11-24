import java.io.File;
import java.util.Scanner;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class FoodLab{
	public static void main(String[] args) {

		// Create an array for 8790 foods
		FoodItem[] foodList = new FoodItem[8790];

		try {
			System.out.println("Inputting list of foods...");
			int index = 0;

			// Open the file with a Scanner
			URL url = new URL("https://codehs.com/uploads/20316c74a18a845a4995c0604c18b20a");
			Scanner file = new Scanner(url.openStream());
			// Loop while there are lines left in the file
			while (file.hasNextLine()) {
				// Input entire line containing data for one food
				String line = file.nextLine();
				// Separate data using comma as a delimiter
				String[] items = line.split(",");

				// Instantiate a new FoodItem with data extracted from the line
				FoodItem f = new FoodItem(items[0], Double.parseDouble(items[1]), Double.parseDouble(items[2]),
						Double.parseDouble(items[3]), Double.parseDouble(items[4]), Double.parseDouble(items[5]),
						Double.parseDouble(items[6]), Double.parseDouble(items[7]), Double.parseDouble(items[8]));

				// Add f to the next open spot in the array
				foodList[index++] = f;
			}
			System.out.println("Input Complete");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Your code here

	}

	// Put your Linear Search Method here

}
