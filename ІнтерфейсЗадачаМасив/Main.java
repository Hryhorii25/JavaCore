package ІнтерфейсЗадачаМасив;

public class Main {

	public static void main(String[] args) {
		Model model = new Model(10);
		for (int i = 0; i < 10; i++) {
			model.adding("text : " + String.valueOf(i * i));
		}

		ModelSelector modelSelector = new ModelSelector(model);

		while (!modelSelector.isEnd()) {
			View.display(modelSelector.current());
			modelSelector.next();
		}

	}

}
