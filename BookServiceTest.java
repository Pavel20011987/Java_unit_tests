package com.denisstrykov.unit_tests.Unit4.Sem4.book;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    /*
    Задание 2.
    У вас есть класс BookService, который использует интерфейс BookRepository для получения
    информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя
    Mockito для создания мок-объекта BookRepository.

     */

    @Test
    public void findBookByIDTest() {
        BookRepository bookRepositoryMock = mock(BookRepository.class);

        Book newBook = new Book("3", "Book3", "Author3");
//        Book newBook1 = new Book("4", "Book3", "Author3"); Для проверки НЕПРАВИЛЬНОСТИ

        when(bookRepositoryMock.findById("10")).thenReturn(newBook);

        BookService bookService = new BookService(bookRepositoryMock);

        assertThat(bookService.findBookById("10")).isEqualTo(newBook);
    }

    @Test
    public void findAllBookTest() {
        BookRepository bookRepositoryMock = mock(BookRepository.class);

        List<Book> testListBook = new ArrayList<>(Arrays.
                asList(new Book("3", "Book3", "Author3")
                        , new Book("7", "Book7", "Author7")));

        when(bookRepositoryMock.findAll()).thenReturn(testListBook);

        BookService bookService = new BookService(bookRepositoryMock);

        assertThat(bookService.findAllBooks()).isEqualTo(testListBook);
    }

}