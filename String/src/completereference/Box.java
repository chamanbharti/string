package completereference;

public class Box{
	double width;
	double height;
	double depth;
	public Box(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public String toString(){
		return "Dimensions are "+width+" by "+depth+" by "+height+".";
	}
	
	
}