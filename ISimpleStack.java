package lab10;

public interface ISimpleStack {
	void push(char ch);

	char pop();

	boolean isEmpty();

	boolean isFull();

	void reset();

	char peek();

	int size();
}