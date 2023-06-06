package com.example.md4_binding_mail.controller;

import com.example.md4_binding_mail.model.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MailController {
    private List<Mail> mailList = new ArrayList<>();
    @GetMapping("/mails")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index", "mail", new Mail());
        return modelAndView;
    }
    @PostMapping("/save")
    public String saveConfiguration(@ModelAttribute Mail mail) {
        mail.setId((int)(Math.random() * 1000));
        mailList.add(mail);
        return "redirect:/info";
    }
    @GetMapping("/info")
    public ModelAndView showConfigurationInfo() {
        ModelAndView modelAndView = new ModelAndView("info");
        modelAndView.addObject("mailList", mailList);
        return modelAndView;
    }
}
