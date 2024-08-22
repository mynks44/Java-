import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

// Book class representing the basic structure of a book
class Book {
    public int id;
    public String title;
    public String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book ID: " + id + ", Title: " + title + ", Author: " + author;
    }
}

// Stack Example: Undo operation for last action
class ActionStack {
    private java.util.Stack<String> actions;

    public ActionStack() {
        actions = new java.util.Stack<>();
    }

    public void addAction(String action) {
        actions.push(action);
    }

    public String undoAction() {
        return actions.isEmpty() ? "No actions to undo" : actions.pop();
    }
}

// Queue Example: Processing book loans
class LoanQueue {
    private Queue<Book> loanQueue;

    public LoanQueue() {
        loanQueue = new LinkedList<>();
    }

    public void addLoan(Book book) {
        loanQueue.add(book);
        System.out.println("Book loaned: " + book);
    }

    public void processLoan() {
        Book book = loanQueue.poll();
        if (book != null) {
            System.out.println("Processing loan for: " + book);
        } else {
            System.out.println("No loans to process");
        }
    }
}

// Tree Example: Organizing books by ID
class BookTree {
    class Node {
        Book book;
        Node left, right;

        public Node(Book book) {
            this.book = book;
            left = right = null;
        }
    }

    private Node root;

    public BookTree() {
        root = null;
    }

    public void insert(Book book) {
        root = insertRec(root, book);
    }

    private Node insertRec(Node root, Book book) {
        if (root == null) {
            root = new Node(book);
            return root;
        }

        if (book.id < root.book.id)
            root.left = insertRec(root.left, book);
        else if (book.id > root.book.id)
            root.right = insertRec(root.right, book);

        return root;
    }

    public void inorderTraversal() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.book);
            inorderRec(root.right);
        }
    }
}

// Graph Example: Book recommendation system
class BookGraph {
    private Map<Book, List<Book>> adjBooks;

    public BookGraph() {
        adjBooks = new HashMap<>();
    }

    public void addEdge(Book book1, Book book2) {
        adjBooks.putIfAbsent(book1, new ArrayList<>());
        adjBooks.get(book1).add(book2);
    }

    public void printRecommendations(Book book) {
        List<Book> recommendedBooks = adjBooks.getOrDefault(book, new ArrayList<>());
        System.out.println("Books recommended if you liked " + book.title + ":");
        for (Book recBook : recommendedBooks) {
            System.out.println(recBook);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating books
        Book book1 = new Book(101, "Effective Java", "Joshua Bloch");
        Book book2 = new Book(102, "Java: The Complete Reference", "Herbert Schildt");
        Book book3 = new Book(103, "Head First Java", "Kathy Sierra");

        // Stack: Actions stack
        ActionStack actionStack = new ActionStack();
        actionStack.addAction("Added book: " + book1.title);
        actionStack.addAction("Removed book: " + book2.title);
        System.out.println("Last action undone: " + actionStack.undoAction());

        // Queue: Loan queue
        LoanQueue loanQueue = new LoanQueue();
        loanQueue.addLoan(book1);
        loanQueue.addLoan(book2);
        loanQueue.processLoan();
        loanQueue.processLoan();
        loanQueue.processLoan();

        // Tree: Book tree (organizing by book ID)
        BookTree bookTree = new BookTree();
        bookTree.insert(book1);
        bookTree.insert(book2);
        bookTree.insert(book3);
        System.out.println("Books in the library (in order):");
        bookTree.inorderTraversal();

        // Graph: Book recommendation
        BookGraph bookGraph = new BookGraph();
        bookGraph.addEdge(book1, book2);
        bookGraph.addEdge(book1, book3);
        bookGraph.printRecommendations(book1);
    }
}
