package ro.siit.generics;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gift gift = new Gift();
        gift.setContent(new Book("Scufita Rosie"));

        System.out.println(((Book)gift.getContent()).getTitle());

        Gift gift2 = new Gift();
        gift2.setContent(new Confetti());
        // System.out.println(((Book)gift2.getContent()).getTitle());
        ((Confetti)gift2.getContent()).pop();

        Present<Book> bookPresent = new Present<>(new Book("Scufita Rosie"));
        System.out.println(bookPresent.getContent().getTitle());

        Present<Confetti> confettiPresent = new Present<>(new Confetti());
        confettiPresent.getContent().pop();

        Present presentPresent = new Present(new Book("Scufita Rosie"));
        ((Book)presentPresent.getContent()).getTitle();

        List<Present<?>> bookPresents = new ArrayList<>();
        bookPresents.add(presentPresent);
    }
}
