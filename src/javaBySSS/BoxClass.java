package javaBySSS;

class BoxClassProp_Behav_Fun {
	// private instance member variable of this box class
	private int length;
	private int breadth;
	private int height;

	// public instance member function of this class
	public void setBoxDimensions(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
	}

	// public instance member function of this class
	public void showBoxDimensions() {
		System.out.println(length);
		System.out.println(breadth);
		System.out.println(height);
	}

}

public class BoxClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BoxClassProp_Behav_Fun refOfBoxClassProp_Behav_Fun = new BoxClassProp_Behav_Fun();
		refOfBoxClassProp_Behav_Fun.setBoxDimensions(2, 3, 4);
		refOfBoxClassProp_Behav_Fun.showBoxDimensions();

		refOfBoxClassProp_Behav_Fun = new BoxClassProp_Behav_Fun(); // this object deletes the previous object
		refOfBoxClassProp_Behav_Fun.showBoxDimensions();// Output will be 000 because previous object is no longer
														// exists

	}

}
