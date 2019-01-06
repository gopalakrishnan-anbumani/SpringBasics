package sample.spring.beans;

public class DisplayBean {
	
	int number;
	
	public DisplayBean(int iNumber) {
		number = iNumber;
	}
	
	public void display(){
		System.out.println("Hi SSpring World"+ number);
	}

}
