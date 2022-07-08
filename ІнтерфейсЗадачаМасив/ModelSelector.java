package ІнтерфейсЗадачаМасив;

public class ModelSelector implements Selector {

	private Model model;
	private int index;

	public ModelSelector(Model model) {
		this.model = model;
	}

	@Override
	public Object current() {
		Object[] arrays = model.getArrays();
		return arrays[index];
	}

	@Override
	public void next() {
		if (index < model.getArrays().length) {
			index++;
		}
	}

	@Override
	public boolean isEnd() {
		return index == model.getArrays().length;
	}

}
