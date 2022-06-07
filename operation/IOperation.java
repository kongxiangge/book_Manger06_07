package operation;

import book.BookList;

public interface IOperation {
    // 由于每个操作都是对bookList进行，只是操作的内容不同
    // 所以将其作为接口，在每个操作里面重写操作方法实现相关操作
    public void work(BookList bookList);
}
