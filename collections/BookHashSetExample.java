import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class BookHashSetExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of books to be added:");
        int n = sc.nextInt();
        sc.nextLine(); 

        BookInfo bookManager = new BookInfo();

        System.out.println("Enter the books (Book ID: Book Title: Author: Price):");
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            bookManager.addBookDetails(s);
        }

        System.out.print("Enter book title to find the number of copies: ");
        String bookTitle = sc.nextLine();
        int totalCopies = bookManager.findTheNumberOfCopiesBasedOnTheBookTitle(bookTitle);

        if (totalCopies == -1) {
            System.out.println("No books found with title: " + bookTitle);
        } else {
            System.out.println("Total number of copies for book title " + bookTitle + ": " + totalCopies);
        }

        System.out.print("Enter book title to list all book details: ");
        String bookTitleForDetails = sc.nextLine();
        List<String> booksByTitle = bookManager.findBookDetailsBasedOnBookTitle(bookTitleForDetails);

        if (booksByTitle.isEmpty()) {
            System.out.println("No books found with title: " + bookTitleForDetails);
        } else {
            System.out.println("Book details for title " + bookTitleForDetails + ":");
            for (String book : booksByTitle) {
                System.out.println(book);
            }
        }

        System.out.print("Enter author name to list all books by that author: ");
        String authorName = sc.nextLine();
        List<String> booksByAuthor = bookManager.findBooksByAuthor(authorName);

        if (booksByAuthor.isEmpty()) {
            System.out.println("No books found by author: " + authorName);
        } else {
            System.out.println("Books by author " + authorName + ":");
            for (String book : booksByAuthor) {
                System.out.println(book);
            }
        }
    }
}

class BookInfo {
    private Set<String> bookSet = new HashSet<>(); // Changed to HashSet

    public Set<String> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<String> bookSet) {
        this.bookSet = bookSet;
    }

    public void addBookDetails(String bookDetail) {
        bookSet.add(bookDetail);
    }

    public int findTheNumberOfCopiesBasedOnTheBookTitle(String bookTitle) {
        int count = 0;
        for (String bookDetail : bookSet) {
            String[] parts = bookDetail.split(":");
            if (parts.length == 4 && parts[1].equalsIgnoreCase(bookTitle)) {
                count++;
            }
        }
        return count > 0 ? count : -1;
    }

    public List<String> findBookDetailsBasedOnBookTitle(String bookTitle) {
        List<String> books = new ArrayList<>();
        for (String bookDetail : bookSet) {
            String[] parts = bookDetail.split(":");
            if (parts.length == 4 && parts[1].equalsIgnoreCase(bookTitle)) {
                books.add(bookDetail);
            }
        }
        return books;
    }

    public List<String> findBooksByAuthor(String author) {
        List<String> booksByAuthor = new ArrayList<>();
        for (String bookDetail : bookSet) {
            String[] parts = bookDetail.split(":");
            if (parts.length == 4 && parts[2].equalsIgnoreCase(author)) {
                booksByAuthor.add(bookDetail);
            }
        }
        return booksByAuthor;
    }
}