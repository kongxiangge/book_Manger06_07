package user;
import book.*;
import operation.IOperation;
import operation.*;
public abstract class User {
    public String name;
    public IOperation[] operations;
    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
    public void doOperation(BookList bookList, int choice ) {
        this.operations[choice].work(bookList);
    }
}
