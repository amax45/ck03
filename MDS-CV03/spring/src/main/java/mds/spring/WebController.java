package mds.spring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("static_page")
    public String staticPage(){
        return "staticpage";
    }

    @GetMapping("dynamic_page")
    public String dynamicPage(Model model){
        model.addAttribute("name","Alex");
        return "dynamicpage";
    }

    @GetMapping("Myself")
    public String mySelf(){
        return "myself";
    }

    @GetMapping("Bob")
    public String bob(Model model){
        model.addAttribute("name","Bob");
        return "template";
    }

    @GetMapping("Alice")
    public String alice(Model model){
        model.addAttribute("name","Alice");
        return "template";
    }

}
