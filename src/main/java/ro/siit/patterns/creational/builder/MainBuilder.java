package ro.siit.patterns.creational.builder;

public class MainBuilder {
    Poem poem = (new PoemBuilder()).setAuthor("Eminescu")
            .setTitle("Luceafarul")
            .setContent("Traind in cercul...")
            .createPoem();

}
