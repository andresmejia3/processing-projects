package adt;

import java.util.Objects;

public class Node<T> {
  private T data;
  private Node<T> next;

  Node(T item) {
    this.data = item;
  }

  public T getData() {
    return data;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return data.toString();
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof Node && ((Node) obj).getData() == data;
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

}
