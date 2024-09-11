class Book {
    String title, author;
    long isbn;
    boolean avl;

    Book(String t, String aut, long i, boolean a) {
        title = t;
        author = aut;
        isbn = i;
        avl = a;
    }
}

class Member {
    String name, id;
    Book[] borrowedbooks;
    int bookcount;

    Member() {
        name = "";
        id = "";
        borrowedbooks = new Book[3];
        bookcount = 0;
    }

    Member(String n, String i, String[] b) {
        name = n;
        id = i;
        borrowedbooks = new Book[3];
        for (int j = 0; j < b.length && j < 3; j++) {
            borrowedbooks[j] = new Book(b[j], "", 0, false);
            bookcount++;
        }
    }

    void borrowedBooks(Book book) {
        if (bookcount < 3 && book.avl) {
            borrowedbooks[bookcount] = book;
            bookcount++;
        } else {
            System.out.println("Sorry, you can't borrow more than 3 books or the book is not available");
        }
    }

    void returnedBook(Book book) {
        for (int i = 0; i < borrowedbooks.length; i++) {
            if (borrowedbooks[i] == book) {
                borrowedbooks[i] = null;
                book.avl = true;
                bookcount--;
                System.out.println("\n\n" + name + " returned " + book.title + "\n\n");
                break;
            }
        }
    }

    void showBorrowedBooks() {
        System.out.println(name + " has borrowed:");
        for (Book book : borrowedbooks) {
            if (book != null) {
                System.out.println("- " + book.title);
            }
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Member m = new Member();
        Member m1 = new Member("Bikram", "BWU/BCA/23/036", new String[] { "The Count of Monte Cristo", "Feluda Samagra",
                "Prof. Shanku Samagra", "Three Musketeers", "The Man With Iron Mask" });
        Member m2 = new Member("John", "BWU/BCA/23/037",
                new String[] { "The Lord of the Rings", "Harry Potter", "The Hobbit" });
        Member m3 = new Member("Alice", "BWU/BCA/23/038",
                new String[] { "Pride and Prejudice", "Jane Eyre", "Little Women" });

        Book returnedBook = m1.borrowedbooks[0];
        m1.returnedBook(returnedBook);

        m1.showBorrowedBooks();
        System.out.println();
        m2.showBorrowedBooks();
        System.out.println();
        m3.showBorrowedBooks();
    }
}