package N_Assignment.LibrarySystemProject;

public class Main {
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Python Basics");

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member(1, "Alice");
        Member member2 = new Member(2, "Bob");

        library.addMember(member1);
        library.addMember(member2);

        library.issueBook("Java Programming", 1);
        library.issueBook("Java Programming", 2);
        library.returnBook("Java Programming", 1);
        library.issueBook("Java Programming", 2);
    }
}
