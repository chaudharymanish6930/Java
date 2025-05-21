package N_Assignment.LibrarySystemProject;

public interface LibraryActions {
    void issueBook(String bookTitle, int memberId);
    void returnBook(String bookTitle, int memberId);
}
