package it.aulab.progetto_blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import it.aulab.progetto_blog.models.Author;

public interface AuthorRepository extends ListCrudRepository<Author,Long>{

    //Derived query
    List<Author> findByName(String firstname);
    List<Author> findBySurname(String lastname);
    List<Author> findByNameAndSurname(String firstname, String lastname); //select all from authors where fristname = firstname and lastname = lastname
    List<Author> findByEmail(String email);

    //Query native, scritte in sql naturale
    @Query(value = "SELECT * FROM authors a WHERE a.firstname = 'Giuseppe'", nativeQuery = true)
    List<Author> authorsWithEffectiveName();

    //Query non native, scriite in sql mischiato all'oop
    @Query("SELECT a FROM Author a WHERE a.name = 'Giuseppe'")
    List<Author> authorsWithEffectiveNameNonNative();

}
