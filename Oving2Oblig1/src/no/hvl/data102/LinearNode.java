package no.hvl.data102;

public class LinearNode <T>{
	private LinearNode<T> neste;
	private T element;
	
	public LinearNode(){
		this.neste = null;
		this.element = null;
	}
	
	public LinearNode(T el) {
		this.neste = null;
		this.element = el;
	}
	
	
	public void setNeste(LinearNode<T> node) {
		neste = node;
	}
	public LinearNode<T> getNeste(){
		return neste;
	}
	
	public void setElement(T el) {
		element = el;
	}
	public T getElement() {
		return element;
	}
}
