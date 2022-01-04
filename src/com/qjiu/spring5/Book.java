package com.qjiu.spring5;

/**
 *
 */
public class Book {
    private String bName;

    private String bAuthor;

    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", bAuthor='" + bAuthor + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args){
        Book book = new Book();
        book.setbAuthor("达摩老祖");
        book.setbName("易筋经");
        System.out.println(book.toString());
    }
}
