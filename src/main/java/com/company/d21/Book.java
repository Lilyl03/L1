package com.company.d21;

import java.util.*;

public class Book {

    private final String name;
    private final double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
//        Set<Book> books = Set.of(
//                new Book("effective", 54.99)
//        );
//        Book book = new Book(args[0], Double.parseDouble(args[1]));
//        System.out.println(books.contains(book));

        //strategy
        Set<Book> books = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        books.add(new Book("effective", 54.99));
        books.add(new Book("effective", 54.99));
        books.add(new Book("effective", 54.99));
        books.add(new Book("effective", 54.99));
        books.add(new Book("apush@", 40));
        System.out.println(books.size());

//        Book book = new Book(args[0], Double.parseDouble(args[1]));
//        for (Book book1 : books) {
//            System.out.println(book);
//        }
//        System.out.println(books.contains(book));
//        System.out.println(books.size());
//        String s1 = "ab";
//        String s2 = "ab";
//        String s3 = "Ab";
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1.compareTo(s3));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (Double.compare(book.getPrice(), getPrice()) != 0) return false;
        return getName() != null ? getName().equals(book.getName()) : book.getName() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price;
    }

//    @Override
//    public int compareTo(Book o) {
//        int result = this.name.compareTo(o.name);
//        if(result == 0){
////           return (int) (this.price - o.price);
//            return Double.valueOf(this.price).compareTo(o.price);
//        }else {
//        return result;
//        }
//    }
}
