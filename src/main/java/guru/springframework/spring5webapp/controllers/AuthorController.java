package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
@Controller//Necesario incluir para decir que es un controlador
public class AuthorController {
    private final AuthorRepository authorRepository;

    
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @RequestMapping("/authors")//Pone la ruta authors
    public String getAuthors(Model model){
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/list";//Busca list en thymeleaf dentro del a carpeta authors
    }
}
