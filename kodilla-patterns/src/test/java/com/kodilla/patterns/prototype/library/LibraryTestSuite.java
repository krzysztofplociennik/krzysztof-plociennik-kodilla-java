package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testToString() {
        //Given
        Library library = new Library("Library #1");
        Book book1 = new Book("1984", "George Orwell", LocalDate.of(1960, 1, 2));
        Book book2 = new Book("Folwark zwierzęcy", "George Orwell", LocalDate.of(1955, 6, 20));
        Book book3 = new Book("Brak tchu", "George Orwell", LocalDate.of(1956, 3, 15));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library #2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library #3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println("Libraries before removing: \n" + library + "\n" + clonedLibrary+ "\n" + deepClonedLibrary + "\n");

        //When
        library.getBooks().remove(book2);

        //Then
        System.out.println("Libraries after removing: \n" + library + "\n" + clonedLibrary+ "\n" + deepClonedLibrary);
    }
}
