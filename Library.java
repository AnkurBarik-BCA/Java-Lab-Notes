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
        borrowedbooks = new String[0];
    }

    Member(String n, String i, String[] b) {
        name = n;
        id = i;
        borrowedbooks = b;
    }

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

        Member() {
            name = "";
            id = "";
            borrowedbooks = new String[0];
        }

        Member(String n, String i, String[] b) {
            name = n;
            id = i;
            borrowedbooks = b;
        }

        void borrowedBooks() {
            if (bookcount < 3 && Book.avl) {
                borrowedbooks[bookcount] = Book;
                bookcount++;
            } else {
                System.out.println("Sorry, you can't borrow more than 3 books or the book is not available");
            }
        }

    }

    public class Library {
        public static void main(String[] args) {
            Member m = new Member();
            Member m1 = new Member("Bikram", "BWU/BCA/23/036",
                    new String[] { "The Count of Monte Cristo", "Feluda Samagra",
                            "Prof. Shanku Samagra", "Three Musketeers", "The Man With Iron Mask" });
            // System.out.print(m1.borrowedbooks[1]);
            m1.borrowedBooks();
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Member m = new Member();
        Member m1 = new Member("Bikram", "BWU/BCA/23/036", new String[] { "The Count of Monte Cristo", "Feluda Samagra",
                "Prof. Shanku Samagra", "Three Musketeers", "The Man With Iron Mask" });
        // System.out.print(m1.borrowedbooks[1]);
        for (String book : m1.borrowedbooks) {
            System.out.println(book);
        }
    }
}