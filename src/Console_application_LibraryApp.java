import java.util.*;

public class Console_application_LibraryApp {
    private List<Book> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    public void run() {
        while (true) {
            System.out.println("Welcome to Library App!");
            System.out.println("1. Print all books");
            System.out.println("2. Add new book");
            System.out.println("3. Search books by title");
            System.out.println("4. Borrow a book");
            System.out.println("5. Return a book");
            System.out.println("6. Delete a book by id");
            System.out.println("7. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                printAllBooks();
            } else if (choice == 2) {
                addNewBook();
            } else if (choice == 3) {
                searchBooks();
            } else if (choice == 4) {
                borrowBook();
            } else if (choice == 5) {
                returnBook();
            } else if (choice == 6) {
                deleteBook();
            } else if (choice == 7) {
                System.out.println("Exiting");
                break;
            } else {
                System.out.println("Try again");
            }
        }
    }


    private void printAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }


    private void addNewBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        Book newBook = new Book(title, author, year);
        books.add(newBook);
        System.out.println("Book added: " + newBook);
    }


    private void searchBooks() {
        System.out.print("Enter part of the title: ");
        String searchTitle = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (Book book : books) {
            if (book.toString().toLowerCase().contains(searchTitle)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with that title");
        }
    }


    private void borrowBook() {
        System.out.print("Enter book id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Book book = findBook(id);
        if (book != null) {
            if (book.isAvailable()) {
                book.borrow();
                System.out.println("Book borrowed: " + book);
            } else {
                System.out.println("This book is already borrowed");
            }
        } else {
            System.out.println("Не нашли");
        }
    }


    private void returnBook() {
        System.out.print("Enter book id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Book book = findBook(id);
        if (book != null) {
            if (!book.isAvailable()) {
                book.returnBook();
                System.out.println("Book returned: " + book);
            } else {
                System.out.println("This book wasn't borrowed");
            }
        } else {
            System.out.println("Book not found.");
        }
    }


    private void deleteBook() {
        System.out.print("Enter book id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Book book = findBook(id);
        if (book != null) {
            books.remove(book);
            System.out.println("Book deleted: " + book);
        } else {
            System.out.println("Book not found.");
        }
    }


    private Book findBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Console_application_LibraryApp app = new Console_application_LibraryApp();
        app.run();
    }
}