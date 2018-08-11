package ConnectFourGamePackage;


public class PairClass implements Comparable<PairClass>{

	int column,value;

	public int getColumn() {
		return column;
	}

	public int getValue() {
		return value;
	}

	public PairClass(int column, int value) {
		
		this.column = column;
		this.value = value;
	}

	@Override
	public int compareTo(PairClass arg0) {
		// TODO Auto-generated method stub
		
		//int compareQuantity = ((Fruit) compareFruit).getQuantity(); 
		
		//ascending order
		return this.value - arg0.getValue();
		
	}
	
	
}
