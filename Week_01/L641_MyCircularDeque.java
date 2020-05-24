package Array;

public class L641_MyCircularDeque {
    public static void main(String[] args) {
        int k = 3;
        int value = 99;
        L641_MyCircularDeque obj = new L641_MyCircularDeque(k);
        boolean param_1 = obj.insertFront(1);
        boolean param_10 = obj.insertFront(2);
        boolean param_30 = obj.insertLast(4);
        boolean param_3 = obj.deleteFront();
        boolean param_4 = obj.deleteLast();
        int param_5 = obj.getFront();
        int param_6 = obj.getRear();
        boolean param_7 = obj.isEmpty();
        boolean param_8 = obj.isFull();
    }

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    private int[] elements;
    private int size;

    public L641_MyCircularDeque(int k) {
        elements = new int[k];
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        if (isFull()) return false;
        for (int i = size - 1; i >= 0; i--) {
            elements[i + 1] = elements[i];
        }
        elements[0] = value;
        size++;
        return true;
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
        if (isFull()) return false;
        elements[size] = value;
        size++;
        return true;
    }


    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        if (isEmpty()) return false;
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return true;
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        if (isEmpty()) return false;
        elements[size - 1] = 0;
        size--;
        return true;
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {
        return size == 0 ? -1 : elements[0];
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {
        return size == 0 ? -1 : elements[size - 1];

    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        return size == elements.length;
    }

}
