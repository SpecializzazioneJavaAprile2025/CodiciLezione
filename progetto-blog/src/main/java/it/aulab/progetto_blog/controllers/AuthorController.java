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

import it.aulab.progetto_blog.models.Author;
import it.aulab.progetto_blog.models.Post;
import it.aulab.progetto_blog.repositories.AuthorRepository;

// @Controller
@RestController
@RequestMapping("/authors")
public class AuthorController {
    
    @Autowired
    AuthorRepository authorRepository;
    
    // @RequestMapping(method=RequestMethod.GET)
    // public @ResponseBody List<Author> getAllAuthors(){
    @GetMapping
    public List<Author> getAllAuthors(){
        return authorRepository.findAll();    
    }

    // @RequestMapping(value="/{id}", method=RequestMethod.GET) ///authors/{id} // authors/3
    // public @ResponseBody Author getAuthor(@PathVariable("id") Long id){
    @GetMapping("{id}")
    public Author getAuthor(@PathVariable("id") Long id){
        //findById restituisce un otpional, abbiamo quindi bisogno di fare la get per la trasformazione effettiva
        return authorRepository.findById(id).get();
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author){
        return authorRepository.save(author);
    }

    @PutMapping("{id}")
    public Author updateAuthor(@PathVariable("id") Long id, @RequestBody Author author){
        author.setId(id);//Necessario per impostare l'id dell'autore che voglio modificare nel nuovo oggetto cosi che abbiano lo stesso id e quindi il framework effettuerà una modifica
        return authorRepository.save(author);
    }

    @DeleteMapping("{id}")
    public void deleteAuthor(@PathVariable("id") Long id){
        if(authorRepository.existsById(id)){
            Author author = authorRepository.findById(id).get();
            List<Post> authorPosts = author.getPosts();
            for (Post post : authorPosts) {
                post.setAuthor(null);
            }
            authorRepository.deleteById(id);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Author not found");
        }

    }

}
