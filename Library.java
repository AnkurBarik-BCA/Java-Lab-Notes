class Book {
    String title, author;
    long isbn;
    boolean avl;

    Book() {
        title = "";
        author = "";
        isbn = 0L;
        avl = false;
    }

    Book(String t, String aut, long i, boolean a) {
        title = t;
        author = aut;
        isbn = i;
        avl = a;
    }
}

class Member {
    String name, id;
    String[] borrowedbooks;

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
}

public class Library {
    public static void main(String[] args) {
        Member m = new Member();
        Member m1 = new Member("Bikram", "BWU/BCA/23/036", new String[]{"The Count of Monte Cristo", "Feluda Samagra", "Prof. Shanku Samagra", "Three Musketeers", "The Man With Iron Mask"});
        // System.out.print(m1.borrowedbooks[1]);
        for (String book : m1.borrowedbooks) {
            System.out.println(book);
        }
    }
}
