package ro.sapientia.test1.unittest;

import java.util.ArrayList;

public class Collect {
	
	private ArrayList<Integer> list;
	private int sum = 0;

	public Collect() {
		setList(new ArrayList<Integer>());
	}
	
	public void add(final int val) {
		setSum(getSum(null) + val);
		getList().add(Integer.valueOf(val));
	}
	
	public void print() {
		for(Integer i : getList()) {
			System.out.println(i);
		}
	}

	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

	public int getSum(Integer x1) {
		if(x1==null)
			return 0;
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

}
