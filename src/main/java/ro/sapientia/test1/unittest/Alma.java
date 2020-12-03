package ro.sapientia.test1.unittest;

public class Alma {
	
	private Collect collect;
	
	public Alma() {
		collect = new Collect();
	}

	public Alma(Collect collect) {
		this.collect = collect;
	}
	
	public void collect3Apples() {
		collect.add(3+collect.getSum(32));
	}

	public void collect2Apples() {
		collect.add(2);
	}
	
}
