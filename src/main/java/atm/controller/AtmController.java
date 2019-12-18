package atm.controller;

import atm.service.AtmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AtmController {
    @Autowired
    AtmService service;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("all", service.getAtms());
        return "index";
    }

    @RequestMapping("/{id}")
    public String index(@PathVariable("id") int id, Model model){
        model.addAttribute("inf", service.getInfo(id));
        return "atm";
    }
}
