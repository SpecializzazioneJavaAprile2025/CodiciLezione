package it.aulab.progetto_blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import it.aulab.progetto_blog.dtos.AuthorDto;
import it.aulab.progetto_blog.models.Author;
import it.aulab.progetto_blog.models.Post;
import it.aulab.progetto_blog.repositories.AuthorRepository;
import it.aulab.progetto_blog.services.AuthorService;

// @Controller
@RestController
@RequestMapping("/api/authors")
public class AuthorRestController {
    
    // @Autowired
    // AuthorRepository authorRepository;

    @Autowired
    AuthorService authorService;
    
    // @RequestMapping(method=RequestMethod.GET)
    // public @ResponseBody List<Author> getAllAuthors(){
    @GetMapping
    public List<AuthorDto> getAllAuthors(){
        // return authorRepository.findAll(); 
        return authorService.readAll();  
    }

    // @RequestMapping(value="/{id}", method=RequestMethod.GET) ///authors/{id} // authors/3
    // public @ResponseBody Author getAuthor(@PathVariable("id") Long id){
    @GetMapping("{id}")
    public AuthorDto getAuthor(@PathVariable("id") Long id){
        //findById restituisce un otpional, abbiamo quindi bisogno di fare la get per la trasformazione effettiva
        // return authorRepository.findById(id).get();
        return authorService.read(id);
    }

    @PostMapping
    public AuthorDto createAuthor(@RequestBody Author author){
        // return authorRepository.save(author);
        return authorService.create(author);
    }

    @PutMapping("{id}")
    public AuthorDto updateAuthor(@PathVariable("id") Long id, @RequestBody Author author){
        // author.setId(id);//Necessario per impostare l'id dell'autore che voglio modificare nel nuovo oggetto cosi che abbiano lo stesso id e quindi il framework effettuerà una modifica
        // return authorRepository.save(author);
        return authorService.update(id, author);
    }

    @DeleteMapping("{id}")
    public void deleteAuthor(@PathVariable("id") Long id){
        // if(authorRepository.existsById(id)){
        //     Author author = authorRepository.findById(id).get();
        //     List<Post> authorPosts = author.getPosts();
        //     for (Post post : authorPosts) {
        //         post.setAuthor(null);
        //     }
        //     authorRepository.deleteById(id);
        // }else{
        //     throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Author not found");
        // }
        authorService.delete(id);

    }

}
