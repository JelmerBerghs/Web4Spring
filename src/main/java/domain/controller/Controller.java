package domain.controller;

import domain.model.Person;
import domain.model.PersonService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Controller
public class Controller implements WebMvcConfigurer {

    @Autowired
    private PersonService personService;


    @GetMapping("/home")
    public String home(){
        return "index";
    }


    @PostMapping("/login")
    public Object login(Model model, HttpServletRequest request){
        List<String> errors = new ArrayList<>();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Person user = personService.getAuthenticatedUser(email, password);
        if(user == null){
            errors.add("Email or password is not correct!");
            request.setAttribute("errors", errors);
            return "index";
        }else{
            request.getSession().setAttribute("user", user);
            return new RedirectView("/home");
        }
    }

    @PostMapping("/logout")
    public Object logout(Model model, HttpServletRequest request){

        request.getSession().setAttribute("user", null);
        return new RedirectView("/home");

    }






}
