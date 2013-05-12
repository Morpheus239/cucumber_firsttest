package main.de.michael;

public class Calc {

	private Integer result = 0;
	
	
	public Integer add(Integer a, Integer b) {
		return result = a+b;
	}

	public Integer sub(Integer a, Integer b){
		return result = a-b;
	}
	
	public Integer mul(Integer a, Integer b){
		return result = a*b;
	}
	
	public Integer getResult() {
		return result;
	}
	
	

}