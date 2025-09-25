import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private int id;
    private boolean isAvailable;

    Book(String title,String author,int id){
        this.title=title;
        this.author = author;
        this.id=id;
        this.isAvailable=true;
    }

    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public int getId() {return id;}
    public boolean isAvailable() {return isAvailable;}

    public void issueBook(){
        isAvailable=false;
    }
    public void returnBook(){
        isAvailable=true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", id=").append(id);
        sb.append(", isAvailable=").append(isAvailable);
        sb.append('}');
        return sb.toString();
    }
}
class User{
    private String name;
    private int userId;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", userId=").append(userId);
        sb.append('}');
        return sb.toString();
    }
}

class Library{
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public void addUser(User user){
        users.add(user);
    }
    public void showAllBooks(){
        System.out.println("---Books list---");
        if(books.isEmpty()){
            System.out.println("---No books registered!!---");
        }
        else{
            for(Book b:books){
                System.out.println(b);
            }
        }
    }
    public void showAllUsers(){
        System.out.println("---Users list---");
        if(users.isEmpty()){
            System.out.println("---No user registered!!---");
        }
        else{
            for(User u:users){
                System.out.println(u);
            }
        }
    }
    public void issueBook(int bookId,String userName){
        for(Book b:books){
            if(b.getId()==bookId){
                if(b.isAvailable()){
                    System.out.println("---Book successfully issued to: "+userName+"---");
                    b.issueBook();

                }
                else{
                    System.out.println("---Sorry...Book not available!!---");

                }
                return;
            }
        }
        System.out.println("---Book not found!!---");
    }
    public void returnBook(int bookId){
        for(Book b:books){
            if(b.getId()==bookId){
                if(!b.isAvailable()){
                    System.out.println("---Book successfully returned!!---");
                    b.returnBook();
                }
                else{
                    System.out.println("---Book not found!!---");
                }
                return;
            }
        }
        System.out.println("---Book not found!!---");
    }
}

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();
        library.addBook(new Book("java programming","james gosling",1));
        library.addBook(new Book("Data structure","Robert lafore",2));
        library.addUser(new User("Aman",1));
        library.addUser(new User("Diya",2));
        int choice;
        do {
            System.out.println("To add book Press-1");
            System.out.println("To add user Press-2");
            System.out.println("To view all books Press-3");
            System.out.println("To view all users Press-4");
            System.out.println("To issue book Press-5");
            System.out.println("To return book Press-6");
            System.out.println("To Exit Press-0");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:{
                    System.out.print("Enter book name: ");
                    String bookName = input.nextLine();
                    System.out.print("Enter author name: ");
                    String authorName = input.nextLine();
                    System.out.print("Enter book id: ");
                    int bookId = input.nextInt();
                    input.nextLine();
                    library.addBook(new Book(bookName,authorName,bookId));
                    System.out.println("---book successfully added!!---");
                    break;
                }
                case 2:{
                    System.out.print("Enter user name: ");
                    String name = input.nextLine();
                    System.out.print("Enter user id: ");
                    int userId = input.nextInt();
                    input.nextLine();
                    library.addUser(new User(name,userId));
                    System.out.println("---User added successfully!!---");
                    break;
                }
                case 3:library.showAllBooks();break;
                case 4:library.showAllUsers();break;
                case 5:{
                    System.out.print("Enter book id: ");
                    int bookId = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter user name: ");
                    String name = input.nextLine();
                    library.issueBook(bookId,name);
                    break;
                }
                case 6:{
                    System.out.print("Enter book id: ");
                    int bookId = input.nextInt();
                    input.nextLine();
                    library.returnBook(bookId);
                    break;
                }
                case 0: System.out.println("Exiting...");break;
                default: System.out.println("Invalid key!!");break;
            }
        }
        while(choice != 0);
        input.close();
    }
}
