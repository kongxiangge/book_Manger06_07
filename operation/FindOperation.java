package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入查找图书的名字");
        String name = scanner.nextLine();
        // 遍历查找该书，
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)) {
                System.out.println(book.toString());
                System.out.println("查找成功");
                return;
            }
        }
        System.out.println("查找失败");
        return;
    }
}
