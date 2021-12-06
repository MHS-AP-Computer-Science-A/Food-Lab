import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FoodLab{
	public static void main(String[] args) throws IOException {

		// Create an array for 8790 foods
		FoodItem[] foodList = new FoodItem[8790];

		try {
			System.out.println("Inputting list of foods...");
			int index = 0;

			// Open the file with a Scanner
			Scanner file = new Scanner(new File("food_data_final.txt"));
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
