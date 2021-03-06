package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除图书的名字");
        String name = scanner.nextLine();
        // 遍历查找该书，判断是否存在
        int i = 0;
        for (i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)) {
                break;
            }
        }
        if (i == bookList.getUsedSize()) {
            System.out.println("没有该书");
            return;
        } else {
            // 删除该位置的书后，后面的书向前移动
            for (int pos = i; pos < bookList.getUsedSize(); pos++) {
                // bookList[pos] = bookList[pos+1]; -- error
                Book book = bookList.getBooks(pos+1);
                bookList.setBooks(pos, book);
            }
        }
        bookList.setUsedSize(bookList.getUsedSize() - 1);
    }
}
