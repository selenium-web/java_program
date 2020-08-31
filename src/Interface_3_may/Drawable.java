package Interface_3_may;

public interface Drawable {
	
	void draw();
	default void play(){
		System.out.println("default method with implementation");
	}
	static int cube(int x){
		System.out.println("cube");
		return x*x*x;
	}
}

