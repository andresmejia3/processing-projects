package adt;

public class CircularLinkedList<T> {
  private Node<T> head;
  private Node<T> tail;
  private int size;
  private int next;


  public void add(T object) {
    Node<T> node = new Node<>(object);
    if (size == 0) {
      head = node;
      tail = node;
      head.setNext(tail);
      tail.setNext(head);
    } else {
      Node<T> lastNode = tail;
      tail = node;
      lastNode.setNext(tail);
      tail.setNext(head);
    }
    size++;
  }

  public T indexAt(int i) {
    if (size == 0 || i < 0 || i >= size)
      return null;
    Node<T> current = head;
    while (i != 0 && current != null) {
      current = current.getNext();
      i--;
    }
    return current.getData();
  }

  public int getSize() {
    return size;
  }

  public T next() {
    if (next < size)
      return indexAt(next++);
    next = 0;
    return indexAt(next++);
  }

  public void clear() {
    head = null;
    tail = null;
    size = 0;
    next = 0;
  }

  @Override
  public String toString() {
    String string = "<";
    string += head;
    Node<T> current = head;
    if (current != null) {
      while (current.getNext() != tail) {
        current = current.getNext();
        string = string.concat(", " + current);
      }
    }
    if (size > 1)
      return string + ", " + current.getNext() + ">";
    return string + ">";
  }
}
