public class Main {
    public static void main(String[] args) {
        Author author = new Author("Кей", "Хорстманн");
        Book book = new Book("Java. Библиотека профессионала. Том 1. Основы", 2019, author);
        System.out.println(book + " " + author);

        Author author2 = new Author("Герберт", "Шилд");
        Book book2 = new Book("Java. Руководство для начинающих. 7-е издание", 2018, author2);
        System.out.println(book2 + " " + author2);

        Author author3 = new Author("Герберт", "Шилд");
        Book book3 = new Book("Java. Руководство для начинающих. 7-е издание", 2018, author3);
        System.out.println(book3 + " " + author3);

//        book.setPublicationYear(2022);
//        System.out.println(book + " " + author);

        System.out.println(author2.equals(author));
        System.out.println(book2.equals(book3));
        System.out.println(book2.hashCode());
        System.out.println(book.hashCode());}
}