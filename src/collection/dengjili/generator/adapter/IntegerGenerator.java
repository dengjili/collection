package collection.dengjili.generator.adapter;

public class IntegerGenerator extends AbstractGenerator<Integer> {

	//0-100���ڵ��������ǰ�պ�
	
	@Override
	public Integer next() {
		return random.nextInt(100);
	}

}
