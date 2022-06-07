import book.BookList;
import user.User;
import user.Admin;
import user.NormalUser;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        // 图书管理系统：
        // 所涉及的对象有:书、用户
            // 书的属性：name、author、price、type、borrowed
            // 用户的属性：name
        // 创建的包：book--存储书的相关信息；operation--存储操作的相关信息；user--存储用户的相关信息
        // 1.准备好相关书籍
        BookList bookList = new BookList();
        // 2.登录--实现登录方法
        User user = login();
        // 实现循环操作
        while (true) {
            // 3.打印菜单，返回用户选择的操作
            int choice = user.menu(); // 根据返回的对象调用NormalUser或Admin中的menu
            // 4.执行相关用户的相关操作
            user.doOperation(bookList, choice); // 在user类中实现完成操作
        }

    }
    public static User login() {
        // 输入用户名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = scanner.nextLine();
        // 输入身份
        System.out.println("请选择你的身份：1--管理员；2--普通用户");
        int choice = scanner.nextInt();
        // 向上转型：直接将用户的身份返回,并且将用户的姓名返回
        if (choice == 1) {
            return new Admin(name);
        } else {
            return new NormalUser(name);
        }
    }
}
