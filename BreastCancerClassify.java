/**
 * Project One: Breast Cancer Classification
 * Identify any classmates that you collaborated with.
 * 	1)DavId Para-CHive(David Paraschive)
 * 	2)
 * 	3) 
 * 
 * BreastCancerClassify contains the core implementation of the 
 * kNearestNeighbors algorithm to classify cell clumps as malignant
 * or benign. 
 * 
 * Work on the functions in the following order:
 *  0) author
 * 	1) calculateDistance - once you finish this, you should see a
 * 	   graph of distances appear!
 * 	2) getAllDistances
 * 	3) findKClosestEntries
 * 	4) classify
 *  5) kNearestNeighbors (use your helpers correctly!)
 *  6) getAccuracy
 */
public class BreastCancerClassify {
	
	static int K = 5;
	static int BENIGN = 2;
	static int MALIGNANT = 4;

	/**
	 * Return a String in the format: "Last_Name, First_Name"
	 * This will be used for the autograder. If you'd like to earn a grade in the gradebook, please do this correctly.
	 * Your name should match the name in PowerSchool.
	 */
	public static String author()
	{
		return ("McDaniel, Tiger");
	}
	
	/**
	 * calculateDistance computes the distance between the two data
	 * parameters. The distance is found by taking the difference in each 
	 * "coordinate", squaring it, adding all of those, and then taking the 
	 * square root of the result. 
	 * 
	 * Remember to exclude the patient ID and the tumor classification
	 * 
	 * For example: 
	 * [12345, 6, 4, 4, MALIGNANT]
	 * [22344, 2, 8, 3, BENIGN]
	 * 
	 * distance = sqrt((6-2)^2 + (4-8)^2 + (4-3)^2)
	 */
	public static double calculateDistance(int[] first, int[] second)
	{
		double dist = 0; 
		for(int i = 0; i < first.length; i ++) {
			dist += Math.pow((double)first[i] - (double)second[i], 2);
		}
		dist = Math.sqrt(dist);
		return dist;
	}
	
	/**
	 * getAllDistances creates an array of doubles with the distances
	 * to each training instance. The double[] returned should have the 
	 * same number of instances as trainData. 
	 */
	public static double[] getAllDistances(int[][] trainData, int[] testInstance)
	{
		double[] allDistances = new double [trainData.length];
		for(int i = 0; i < trainData.length; i++){
			allDistances[i] = calculateDistance(testInstance, trainData[i]);
		}
		return allDistances;
	}
	
	/**
	 * findKClosestEntries finds and returns the indexes of the 
	 * K closest distances in allDistances. Return an array of size K, 
	 * that is filled with the indexes of the closest distances (not
	 * the distances themselves). 
	 * 
	 * Be careful! This function can be tricky.
	 */
	public static int[] findKClosestEntries(double[] allDistances)
	{
		int[] kClosestIndexes = null;
		return kClosestIndexes;
	}
	
	/**
	 * classify makes a decision as to whether an instance of testing 
	 * data is BENIGN or MALIGNANT. The function makes this decision based
	 * on the K closest train data instances (whose indexes are stored in 
	 * kClosestIndexes). If more than half of the closest instances are 
	 * malignant, classify the growth as malignant. Otherwise classify
	 * as benign.
	 * 
	 * Return one of the global integer constants defined in this function. 
	 */
	public static int classify(int[][] trainData, int[] kClosestIndexes)
	{
		return -1;
	}
	
	/**
	 * kNearestNeighbors classifies all the data instances in testData as 
	 * BENIGN or MALIGNANT using the helper functions you wrote and the kNN 
	 * algorithm.
	 * 
	 * For each instance of your test data, use your helper methods to find the
	 * K closest points, and classify your result based on that!
	 * @param trainData: all training instances
	 * @param testData: all testing instances
	 * @return: int array of classifications (BENIGN or MALIGNANT)
	 */
	public static int[] kNearestNeighbors(int[][] trainData, int[][] testData){
		int[] myResults = null;
		return myResults;
	}

	/**
	 * printAccuracy returns a String representing the classification accuracy.
	 *
	 * The output String should be rounded to two decimal places followed by the % symbol.
	 * For example, if 4 out of 5 outcomes were correctly predicted, the returned String should be: "80.00%"
	 * For example, if 3 out of 9 outcomes were correctly predicted, the returned String should be: "33.33%"
	 * For example, if 6 out of 9 outcomes were correctly predicted, the returned String should be: "66.67%"
	 * Look up Java's String Formatter to learn how to round a double to two-decimal places.
	 *
	 * This method should work for any data set, given that the classification outcome is always listed
	 * in the last column of the data set.
	 * @param: myResults: The predicted classifcations produced by your KNN model
	 * @param: testData: The original data that contains the true classifications for the test data.
	 */
	public static String getAccuracy(int[] myResults, int[][] testData) {
		return null;
	}
	
	
	//DO NOT MODIFY THE MAIN METHOD
	public static void main(String[] args) {

		int[][] trainData = InputHandler.populateData("./datasets/train_data.csv");
		int[][] testData = InputHandler.populateData("./datasets/test_data.csv");
		
		//Display the distances between instances of the train data. 
		//Points in the upper left corner (both benign) or in the bottom
		//right (both malignant) should be darker. 
		Grapher.createGraph(trainData);

		int[] myResults = kNearestNeighbors(trainData, testData);

		System.out.println("Model Accuracy: " + getAccuracy(myResults, testData));
	}

}