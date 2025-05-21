package N_Assignment.LibrarySystemProject;
import java.util.*;

public class LibrarySystem implements LibraryActions {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    @Override
    public void issueBook(String bookTitle, int memberId) {
        Book book = findBookByTitle(bookTitle);
        Member member = findMemberById(memberId);

        if (book != null && member != null) {
            if (book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book '" + bookTitle + "' issued to " + member.getName());
            } else {
                System.out.println("Sorry, the book is already issued.");
            }
        } else {
            System.out.println("Book or member not found.");
        }
    }

    @Override
    public void returnBook(String bookTitle, int memberId) {
        Book book = findBookByTitle(bookTitle);
        Member member = findMemberById(memberId);

        if (book != null && member != null) {
            book.setAvailable(true);
            System.out.println("Book '" + bookTitle + "' returned by " + member.getName());
        } else {
            System.out.println("Book or member not found.");
        }
    }

    private Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) return b;
        }
        return null;
    }

    private Member findMemberById(int id) {
        for (Member m : members) {
            if (m.getId() == id) return m;
        }
        return null;
    }
}

