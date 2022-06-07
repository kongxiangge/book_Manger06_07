package user;

import operation.*;

import java.util.Scanner;

public class Admin extends User{
    public Admin(String name) {
        super(name);
        // 初始化管理员的操作数组
        this.operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }
    @Override
    public int menu() {
        // 提供操作菜单
        System.out.println("================");
        System.out.println("hello, " + this.name);
        System.out.println("欢迎来到图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
