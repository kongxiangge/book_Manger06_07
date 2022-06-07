package book;

public class BookList {
    // 书的列表：用来存放所有书的信息
    private Book[] books = new Book[100];
    // usedSize:记录当前书的数量
    private int usedSize = 0;
    // 构造方法：
    public BookList() {
        books[0] = new Book("西游记", "吴承恩", 100, "小说");
        books[1] = new Book("水浒传", "施耐庵", 100, "小说");
        books[2] = new Book("三国演义", "罗贯中", 100, "小说");

        this.usedSize = 3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
    // 对pos位置的book进行操作
    public void setBooks(int pos, Book book) {
        this.books[pos] = book;
    }

    public Book getBooks(int i) {
        return books[i];
    }
    // 关于操作的指令可以写在这个类中，因为其操作对象都是BookList。但是使用接口实现会更加可观
}
