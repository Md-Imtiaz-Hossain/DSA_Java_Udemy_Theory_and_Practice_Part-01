package COURSE_01_DSA_BY_ScottBarrett.Section_04_LinkedLists;

public class O18_LL__Big_O {
    public static void main(String[] args) {
        System.out.println("Linked List Big O ");

        /**
         Certainly! Here's a summary of the key points discussed in the section on linked list Big O:

         1. **Adding to the End:**
         - Complexity: O(1)
         - Explanation:

         Adding an item to the end of a linked list involves updating the tail pointer, making it a constant-time
         operation (O(1)). The number of nodes (N) in the list does not affect the number of steps.

         2. **Removing from the End:**
         - Complexity: O(N)
         - Explanation: Removing the last item requires traversing the list from the head to find the previous node
         to update the tail pointer. This involves iterating through the entire list, resulting in linear time
         complexity (O(N)).

         3. **Adding to the Beginning:**
         - Complexity: O(1)
         - Explanation: Adding an item to the beginning of a linked list involves updating the head pointer and the
         new node's pointer, making it a constant-time operation (O(1)).

         4. **Removing from the Beginning:**
         - Complexity: O(1)
         - Explanation: Removing the first item requires updating the head pointer, making it a constant-time operation (O(1)).

         5. **Inserting at a Given Index:**
         - Complexity: O(N)
         - Explanation: Inserting a node at a specific index involves iterating through the list to reach the desired
         position, resulting in linear time complexity (O(N)).

         6. **Removing at a Given Index:**
         - Complexity: O(N)
         - Explanation: Removing a node from a specific index also requires iterating through the list to reach the
         target position, resulting in linear time complexity (O(N)).

         7. **Searching by Value or Index:**
         - Complexity: O(N)
         - Explanation: Searching for a node by either its value or index requires iterating through the list until
         the target is found, resulting in linear time complexity (O(N)).

         8. **Comparison with Array Lists:**
         - Some operations are more efficient in linked lists (e.g., prepending, removing from the beginning), while
         others are more efficient in array lists (e.g., removing the last item, looking up by index).
         - Prepending and removing the first item in a linked list are O(1), while similar operations in an array list
         are O(N) due to the need for reindexing.

         9. **Downloadable Chart:**
         - The lesson includes a chart comparing the Big O complexities of linked lists and array lists for various operations.

         In summary, linked lists offer O(1) complexity for certain operations but may require O(N) for others,
         making them suitable for specific use cases where dynamic insertions and removals are crucial.

         */
    }
}
