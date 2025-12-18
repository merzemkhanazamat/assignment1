public class Class_book {

    private int id;
    private static int idGen;
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Class_book(){
        this.id = idGen++;
        this.available = true;
    }


    public Class_book(String title, String author, int year){
        this();
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        if(title==null){
            throw new IllegalArgumentException("Can't be null");
        }
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        if(author == null){
            throw new IllegalArgumentException("Can't be null");
        }
    }
    public int getYear(){
        return year;
    }

    public void setYear(int year){
        if(year<= 1500 || year>= 2025 ){
            throw new IllegalArgumentException("Year must be between 1500 and 2025");
        }
        this.year = year;
    }
    public void markAsBorrowed(){
        available = false;
    }

    public void markAsReturned(){
        available = true;
    }

    public String toString(){
        return "Class_book{" +
                "id=" + id +
                ", title=" + title +
                ", author=" + author +
                ", year=" + year +
                ", available +" + available +
                '}';
    }
}
