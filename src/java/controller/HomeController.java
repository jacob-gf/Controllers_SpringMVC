/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jacobhss
 */

@Controller
public class HomeController 
{
    
    @RequestMapping("home.html")
    public ModelAndView home (){
        
        ModelAndView map = new ModelAndView();
        map.setViewName("home");
        return map;
    }
    
    @RequestMapping("nosotros.html")
    public ModelAndView nosotros (){
        
        ModelAndView map = new ModelAndView();
        map.setViewName("nosotros");
        return map;
    }
}
