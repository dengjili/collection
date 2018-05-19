package collection.dengjili.generator.adapter;

public class IntegerGenerator extends AbstractGenerator<Integer> {

	//0-100以内的随机数，前闭后开
	
	@Override
	public Integer next() {
		return random.nextInt(100);
	}

}
