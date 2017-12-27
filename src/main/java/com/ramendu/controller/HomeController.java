
package com.ramendu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author rams0516
 *         Date: 12/27/2017
 *         Time: 3:59 PM
 */
@Controller
public class HomeController {

    @GetMapping("/hello")
    public String getHome(Model model) {
        model.addAttribute("name", "zdrousky");
        return "home";
    }
}