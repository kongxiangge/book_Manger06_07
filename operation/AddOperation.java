package operation;
import book.*;

import java.util.Scanner;

public class AddOperation implements IOperation {
    // 重写操作方法：实现增加图书
    @Override
    public void work(BookList bookList) {
        System.out.println("增加图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者：");
        String author = scanner.nextLine();
        System.out.println("请输入图书的价格：");
        int price = scanner.nextInt();
        System.out.println("请输入图书的类型：");
        String type = scanner.next(); //nextInt和nextLine不能混在一起用，nextLine会读取回车
        Book book = new Book(name, author, price, type );
        int pos = bookList.getUsedSize();
        bookList.setBooks(pos, book);
        bookList.setUsedSize(pos+1);
        System.out.println("增加成功");
    }
}

