package task.author;

import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Mike", " ", 'm');
        Author a2 = new Author("Helen", "helem123@ya.ru", 'f');
        Author a3 = new Author("Bob", "bobs_mail54321@mirea.ru", 'm');
        a1.setEmail("mike@gmail.com");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
