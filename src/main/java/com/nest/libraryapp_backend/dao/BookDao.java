package com.nest.libraryapp_backend.dao;

import com.nest.libraryapp_backend.model.Book;
import jakarta.persistence.Entity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookDao extends CrudRepository<Book,Integer> {

    @Query(value = "SELECT `id`,`author_name`,`book_title`,`description`,`distributor`,`image`,`language`,`price`,`publisher`,`released_year` FROM `book` WHERE `book_title` LIKE %:bookTitle%",nativeQuery = true)
    List<Book> searchBook(String bookTitle);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `book` WHERE `book_title` = :bookTitle",nativeQuery = true)
    void deleteBook(String bookTitle);
}
