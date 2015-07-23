package aure.lester.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResumeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "html/index.html";
    }
}
