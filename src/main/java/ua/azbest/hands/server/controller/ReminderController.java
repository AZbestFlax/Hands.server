package ua.azbest.hands.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ternopil")
public class ReminderController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String getHello(ModelMap modelMap) {
        return "Hey Ternopil";
    }

}
