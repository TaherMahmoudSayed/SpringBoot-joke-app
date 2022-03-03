package guru.springframework.joke.jokeapp.controllers;

import guru.springframework.joke.jokeapp.services.IJokeService;
import guru.springframework.joke.jokeapp.services.JokeServicesImpl;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private IJokeService jokeService;

    public JokeController(IJokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public  String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());

        return "chucknorris";
    }
}
