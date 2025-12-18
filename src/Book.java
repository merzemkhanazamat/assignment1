public class Book {
    private int id;
    private static int idGen = 1;
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book() {
        this.id = idGen++;
        this.available = true;
    }

    public Book(String title, String author, int year) {
        this();
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() {
        this.available = false;
    }


    public void returnBook() {
        this.available = true;
    }

    public String toString() {
        return "Book{id=" + id + ", title='" + title + "', author='" + author + "', year=" + year + ", available=" + available + "}";
    }
}

