// Example for PPT page No.49
import java.util.Scanner;

public class Demo20 {
	public static void main(String[] args) {
		// Declare and create input object
		Scanner input=new Scanner(System.in);
		
		// Declare and read the points
		double[][] coordinate=new double[8][2];
		
		for(int i=0;i<coordinate.length;i++) {
			for(int j=0;j<coordinate[i].length;j++) {
				coordinate[i][j]=input.nextDouble();
			}
		}
		
		// Declare a matrix and calculate the distances between all points
		double[][] distance=calculateDistance(coordinate);
		
		// Find the shortest distance and return the pair
		int[] shortestPair=shortestDistance(distance);
		
		// Display the result
		System.out.printf("The shortest pair is points: ");
		for(int i=0;i<shortestPair.length;i++) {
			System.out.printf("(%3.1f,%3.1f) ",coordinate[shortestPair[i]][0],coordinate[shortestPair[i]][1]);
		}
		
		System.out.printf(", and the distance is %f\n",distance[shortestPair[0]][shortestPair[1]]);
	}
	
	// Method for calculate the distances between all points
	public static double[][] calculateDistance(double[][] coors) {
		// Create the distance matrix
		double[][] c=new double[coors.length][coors.length];
		
		// Calculate all the distance
		for(int i=0;i<coors.length;i++) {
			for(int j=0;j<coors.length;j++) {
				c[i][j]=dis(coors[i],coors[j]);
			}
		}
		
		return c;
	}
	
	// Method for fine the shortest distance
	public static int[] shortestDistance(double[][] d) {
		// Declare and initialise the pair
		int[] p={0,1};
		double min=d[0][1];
		
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				if(j!=i && min>=d[i][j]) {
					min=d[i][j];
					p[0]=i;
					p[1]=j;
				}
			}
		}
		
		return p;
	}
	
	// Calculate distance for two points
	public static double dis(double[] p1, double[] p2) {
		return Math.sqrt(Math.pow(p1[0]-p2[0],2)+Math.pow(p1[1]-p2[1],2));	
	}
}