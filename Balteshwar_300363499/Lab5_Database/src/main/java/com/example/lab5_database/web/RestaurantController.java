package com.example.lab5_database.web;
// github link: https://github.com/balteshwar17/CSIS-3275
import com.example.lab5_database.entities.Restaurants;
import com.example.lab5_database.respositories.RestaurantRepository;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SessionAttributes({"a","e"})
@Controller
@AllArgsConstructor
public class RestaurantController {

    @Autowired
    private RestaurantRepository restaurantRepository;
    static int num=0;

    @GetMapping(path="/formRestaurants")
    public String formRestaurants(Model model){
        model.addAttribute("restaurant",new Restaurants());
        return "Addrestaurant";
    }


    @GetMapping(path="/editrestaurant")
    public String editrestaurant(Model model,Long id,HttpSession session){
        num=2;
        model.addAttribute("restaurant",new Restaurants());
        return "Addrestaurant";
    }


    @GetMapping(path="/delete")
    public String delete(Long id){
        restaurantRepository.deleteById(id);
        return "redirect:/indexSearch";
    }


    @GetMapping(path = "/index")
    public String Searchrestaurants(Model model){
        return "restaurants";
    }


    @PostMapping("/entervalue")
    public String handleFormSubmission(@RequestParam String recno,
                                       @RequestParam String itemType,
                                       @RequestParam double dos,
                                       @RequestParam LocalDate transactionDate) {

        return "redirect:/successPage";
    }




}
