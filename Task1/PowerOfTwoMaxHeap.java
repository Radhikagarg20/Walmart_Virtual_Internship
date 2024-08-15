import java.util.ArrayList;

public class PowerOfTwoMaxHeap<T extends Comparable<T>> {
    private final int childrenPerNode; // Number of children each node has
    private final ArrayList<T> data;   // ArrayList to store the heap elements

    /**
     * Constructor to initialize the heap with the number of children per node.
     *
     * @param exponent The exponent for the number of children per node (2^exponent)
     */
    public PowerOfTwoMaxHeap(int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative.");
        }
        this.childrenPerNode = (int) Math.pow(2, exponent);
        this.data = new ArrayList<>();
    }

    /**
     * Inserts a new item into the heap and maintains the heap property.
     *
     * @param item The item to be inserted
     */
    public void insert(T item) {
        data.add(item); // Add the item at the end of the heap
        int itemIndex = data.size() - 1;

        // Bubble up the item to restore heap property
        while (itemIndex > 0) {
            int parentIndex = (itemIndex - 1) / childrenPerNode;
            if (data.get(itemIndex).compareTo(data.get(parentIndex)) > 0) {
                swap(itemIndex, parentIndex);
                itemIndex = parentIndex;
            } else {
                break;
            }
        }
    }

    /**
     * Removes and returns the maximum item (root of the heap).
     *
     * @return The maximum item, or null if the heap is empty
     */
    public T popMax() {
        if (data.isEmpty()) {
            return null; // Return null if the heap is empty
        }

        T maxItem = data.get(0);
        if (data.size() > 1) {
            T lastItem = data.remove(data.size() - 1); // Remove the last item
            data.set(0, lastItem); // Move the last item to the root
            heapifyDown(0); // Restore heap property
        } else {
            data.remove(0); // Remove the only item in the heap
        }

        return maxItem;
    }

    /**
     * Restores the heap property by bubbling down the item at the given index.
     *
     * @param index The index of the item to be bubbled down
     */
    private void heapifyDown(int index) {
        int size = data.size();
        int largest = index;

        // Check all children of the current node
        for (int i = 1; i <= childrenPerNode; i++) {
            int childIndex = childrenPerNode * index + i;
            if (childIndex < size && data.get(childIndex).compareTo(data.get(largest)) > 0) {
                largest = childIndex;
            }
        }

        // If the largest child is greater than the current node, swap and continue
        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    /**
     * Swaps the elements at the given indices.
     *
     * @param i The first index
     * @param j The second index
     */
    private void swap(int i, int j) {
        T temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }

    /**
     * Prints the complete heap.
     */
    public void printHeap() {
        System.out.print("Complete Heap: ");
        for (T item : data) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PowerOfTwoMaxHeap<Integer> heap = new PowerOfTwoMaxHeap<>(2); // Create a max heap with 2^2 = 4 children per node
        heap.insert(10);
        heap.insert(15);
        heap.insert(20);
        heap.insert(7);
        heap.insert(5);

        heap.printHeap(); // Should show the heap structure

        System.out.println("Max value removed: " + heap.popMax());
        heap.printHeap(); // Should show the heap after removing the max value
    }
}



/* 
Output:

Complete Heap: 20 10 15 7 5 
Max value removed: 20
Complete Heap: 15 10 5 7 

=== Code Execution Successful ===
*/