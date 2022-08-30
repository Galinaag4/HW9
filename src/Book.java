import java.util.Objects;

public class Book {
    private String nameBook;
    private int age;

    private String author;

    public Book(String nameBook, String author, int age) {
        this.author = author;
        this.nameBook = nameBook;
        this.age = age;
    }


    public String getNameBook() {
        return this.nameBook;
    }
    public int getAge() {
        return this.age;
    }
    public String getAuthor() {
        return this.author;
    }
    public int setAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, age, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", age=" + age +
                ", author='" + author + '\'' +
                '}';
    }
}