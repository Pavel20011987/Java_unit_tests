package com.denisstrykov.unit_tests.Unit4.Sem4.book;

import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
}
