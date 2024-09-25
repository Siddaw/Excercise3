import java.util.ArrayList;
import java.util.List;

class FavoriteBook {
    private final String title;
    private final String author;

    public FavoriteBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "FavoriteBook{Title='" + title + "', Author='" + author + "'}";
    }
}


class ReadingList {
    private final List<FavoriteBook> favoriteBooks;


    public ReadingList() {
        this.favoriteBooks = new ArrayList<>();
    }


    public void addBook(FavoriteBook book) {
        favoriteBooks.add(book);
    }

    public void listBooks() {
        System.out.println("Books in my Reading List:");
        for (FavoriteBook book : favoriteBooks) {
            System.out.println(book);
        }
    }
}

public class MyReadingListDemo {
    public static void main(String[] args) {
        FavoriteBook book1 = new FavoriteBook("The Hobbit", "J.R.R. Tolkien");
        FavoriteBook book2 = new FavoriteBook("Pride and Prejudice", "Jane Austen");
        FavoriteBook book3 = new FavoriteBook("Moby Dick", "Herman Melville");

        ReadingList myReadingList = new ReadingList();

        myReadingList.addBook(book1);
        myReadingList.addBook(book2);
        myReadingList.addBook(book3);

        myReadingList.listBooks();

        System.out.println("\nAccessing my favorite books directly:");
        System.out.println(book1);
        System.out.println(book2);
    }
}
