package com.example.calorie.web;

import com.example.calorie.Calorie;
import com.example.calorie.CalorieCalck;
import com.example.calorie.DietTypes.Type;
import com.example.calorie.DietTypes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("CalorieCalck")
public class DesignCaloriController {
    @ModelAttribute
    public void addDietTypesToModel(Model model){
        List<DietTypes> diet = Arrays.asList(
                new DietTypes(1,"Steamed meat", 275 , Type.FATS, "Steamed lean meats are used for baby and diet food."),
                new DietTypes(2,"Baked beets in foil in the oven", 49 , Type.VEGAN, "An unusual way to present beets will surprise your loved ones!"),
                new DietTypes(3,"Homemade chicken sausage with cheese", 169 , Type.CARBS, "Useful, dietary, from ordinary products!"),
                new DietTypes(4,"Raw carrot salad with walnuts", 68 , Type.CARBS, "An extremely healthy recipe for a light vegetable salad!"),
                new DietTypes(5,"Cookies made from buckwheat and rye flour", 301 , Type.PROTEIN, "Useful, fragrant, dietary, very tasty!")
        );
        Type[] types = Type.values();
        for (Type type : types){
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(diet,type));
        }
    }
    @ModelAttribute(name = "calorieCalk")
    public CalorieCalck calck(){
        return new CalorieCalck();
    }
    @ModelAttribute(name = "Calorie")
    public Calorie cal(){
        return new Calorie();
    }
    @GetMapping
    public String showDesignForce(){
        return "design";
    }
    private List<DietTypes> filterByType(List<DietTypes> diets, Type type){
        return diets.stream().filter(x -> x.getType().equals(type)).collect(Collectors.toList());
    }
}
