package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookASet) {
        Map<BookSignature, BookB> bookBSet = new HashMap<>();
        for (BookA instance : bookASet) {
            bookBSet.put(new BookSignature(instance.getSignature()), new BookB(instance.getAuthor(), instance.getTitle(), instance.getPublicationYear()));
        }
        return medianPublicationYear(bookBSet);
    }
}