package ІнтерфейсЗадачаМасив;

public class Model {

	private Object[] arrays;
	private int index;

	public Model(int size) {
		arrays = new Object[size];
	}

	public void adding(Object element) {
		if (index < arrays.length) {
			arrays[index++] = element;
		}
	}

	public Object[] getArrays() {
		return arrays;
	}

}
