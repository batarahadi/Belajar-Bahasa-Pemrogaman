class Node:
    def __init__(self, x):
        self.data = x
        self.next = None


# Delete the head node and return the new head
def deleteHead(head):

    # Check if the list is empty
    if head is None:
        return None

    # Store the current head in a
    # temporary variable
    temp = head

    # Move the head pointer to the next node
    head = head.next

    # Free the memory of the old head node
    # (Python garbage collector will handle it)
    temp = None

    return head


# Function to print the linked list
def printList(curr):
    while curr is not None:
        print(curr.data, end="")
        if curr.next is not None:
            print(" -> ", end="")
        curr = curr.next


if __name__ == "__main__":

    # Create a hard-coded linked list:
    # 8 -> 2 -> 3 -> 1 -> 7
    head = Node(8)
    head.next = Node(2)
    head.next.next = Node(3)
    head.next.next.next = Node(1)
    head.next.next.next.next = Node(7)

    head = deleteHead(head)  
    printList(head)