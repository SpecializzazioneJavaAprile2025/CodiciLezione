package it.aulab.progetto_blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.aulab.progetto_blog.models.Author;
import it.aulab.progetto_blog.services.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping
    public String index(Model viewModel){
        //restituisce il nome della vista
        //addAttribute è un metodo che accetta due parametri, il primo è la chiave il secondo è il valore
        viewModel.addAttribute("title", "Tutti gli autori");
        viewModel.addAttribute("authors", authorService.readAll());
        return "authors";
    }

    @GetMapping("create")
    public String createAuthorView(Model viewModel) {
        viewModel.addAttribute("title", "Crea autore");
        viewModel.addAttribute("author", new Author());
        return "createAuthor";
    }


    @PostMapping
    public String create(@ModelAttribute("author") Author author){
        authorService.create(author);
        //Metodi agganciati a rotte di tipo POST,PUT,PATCH,DELETE nella return hanno un redirect verso una rotta di TIPO GET
        return "redirect:/authors";
    }

}
