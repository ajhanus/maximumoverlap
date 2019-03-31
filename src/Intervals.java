/**
 * Team members:
 * @author AJ Hanus
 * @author Jordan Cowen
 * @author Brett Peterson
 * 
 * A wrapper class for RBTree
 */
public class Intervals {
	//private int ID = 0; If deletion is done, this could be used to keep track of edpoints
	//                    for the same interval.

	RBTree tree;
	
	/**
	 * Constructor with no parameters.
	 */
	public Intervals() {
		tree = new RBTree();
	}
	
	/**
	 * 
	 * Adds the interval with left endpoint a and right endpoint b 
	 * to the collection of intervals. Each newly inserted interval 
	 * must be assigned an ID. The IDs should be consecutive; that is, 
	 * the ID of the interval inserted on the ith call of this method should be i.
	 * For example if intervalInsert is called successively to insert intervals 
	 * [5,7],[4,9],[1,8], then the IDs of these intervals should be 1,2,3, respectively.These IDs are permanent
	 *  for the respective intervals. Keep track of the IDs, as multiple intervals that have the same endpoints
	 *   on both sides can be added. intervalInsertshould run in O(logn)time
	 * @param a
	 * @param b
	 */
	void intervalInsert(int a, int b) {
		// System.out.println("Inserting: " + a + " " + b);
		int p_a, p_b;

		if(a <= b) {
			p_a = 1;
			p_b = -1;
		} else {
			p_a = 1;
			p_b = -1;
		}
		tree.insert(new Node(new Endpoint(a), p_a));
		tree.insert(new Node(new Endpoint(b), p_b));
	}
	
	/**
	 * To delete an interval from delete.
	 * 
	 * 
	 * Deletes the interval whose ID (gener-ated byintervalInsert) isintervalID. Returnstrueif 
	 * deletion was successful. Thismethod should run inO(logn)time.Note.TheintervalDeletemethod 
	 * isoptional; that is, you are not requiredto implement it. However, your codemustprovide 
	 * anintervalDeletemethodeven if you choose not to implement interval deletion. If you do not
	 *  implementdeletion, theintervalDeletemethod should consist of just one line that returnsfalse.
	 * @param intervalID
	 * @return
	 */
	boolean intervalDelete(int intervalID) {
		//TODO: Complete it as needed (This is optional so you can leave it as it is)
		return false;
	}
	
	/**
	 * Finds the endpoint that has maximum overlap and returns its value. Thismethod should run in constant time.
	 * @return
	 */
	int findPOM() {
		return tree.getRoot().getEmax().getValue();
	}
	
	/**
	 * Returns the red-black tree used, which is an object of typeRBTree.
	 * @return
	 */
	RBTree getRBTree() {
		return tree;
	}
	
	
	//Add more functions as  you see fit.
	
	
	/**
	 * This is a suggested way on how to add intervals and call POM()
	 * 
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String [] args) {
		int points[][] = {{0, 4}, {1, 6}, {3, 9}, {7, 11}};
		Intervals intv = new Intervals();
		
		for(int i = 0; i < points.length; i++) {
			// System.out.println("Inserting: "+ Arrays.toString(points[i]));
			intv.intervalInsert(points[i][0], points[i][1]);
		}
		intv.getRBTree().topViewVal();
		System.out.println("POM is: " + intv.findPOM()); //Should return 3.
		
	}
}
