
package com.ramendu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rams0516
 *         Date: 12/27/2017
 *         Time: 3:59 PM
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHome() {
        return "home";
    }
}