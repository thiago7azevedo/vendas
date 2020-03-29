package br.com.jcavi.javaweb.sisvendas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    @GetMapping
    public ModelAndView dashboard() {
        ModelAndView mv = new ModelAndView("/dashboard/dashboard");
        return mv;
    }

}