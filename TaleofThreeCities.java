// Code for TopCoder question ATaleOfThreeCities
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ATaleOfThreeCities {


	public double connect(int[] ax, int[] ay, int[] bx, int[] by, int[] cx,
			int[] cy) {

		// Minimum between each of the three cities
		double minAtoB = 0.0;
		double minBtoC = 0.0;
		double minAtoC = 0.0;

		// Store all the values then compare them
		ArrayList<Double> distAtoB = new ArrayList<Double>();
		ArrayList<Double> distBtoC = new ArrayList<Double>();
		ArrayList<Double> distAtoC = new ArrayList<Double>();

		double result = 0.0;

		// Calculate the minimum distance between City A and B
		// No need to store which station they occured at. Only min distance
		// necessary.

		for (int i = 0; i < ax.length; i++) {

			for (int j = 0; j < bx.length; j++) {

				// Compare each of these values

				distAtoB.add(Math.sqrt((double)(ax[i] - bx[j])*(ax[i] - bx[j]) + (double)(ay[i] - by[j])*(ay[i] - by[j])));

			}
		}

		// Calculate the minimum distance between City B and C

		for (int i = 0; i < cx.length; i++) {

			for (int j = 0; j < bx.length; j++) {

				// Compare each of these values

				distBtoC.add(Math.sqrt((double) (cx[i]-bx[j])*(cx[i]-bx[j]) + (double)(cy[i]-by[j])*(cy[i]-by[j])));
				System.out.println(distBtoC);
			}
		}

		// Calculate the minimum distance between City A and C

		for (int i = 0; i < ax.length; i++) {

			for (int j = 0; j < cx.length; j++) {

				// Compare each of these values

				distAtoC.add(Math.sqrt((double) (ax[i]-cx[j])* (ax[i]-cx[j]) + (double)(ay[i]- cy[j])*(ay[i]-cy[j])));
				System.out.println(distAtoC);

			}
		}

		// Find the minimum distance 
		// Smallest number from AtoB, BtoC, AtoC
		minAtoB = Collections.min(distAtoB);
		minBtoC = Collections.min(distBtoC);
		minAtoC = Collections.min(distAtoC);
		
		// Find the smallest two numbers 
		// It has to connect TWO cities
		
		double[] resultarray = {minAtoB, minBtoC, minAtoC};
		Arrays.sort(resultarray);
		result = resultarray[0]+resultarray[1];
		
		return result; 
	}
}