package com.spring.mvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class StudentController {
    @RequestMapping("/showForm")
    public String showForm(Model model){
        Student student = new Student();
        model.addAttribute(student);
        return "StudentDetailsPage";
    }
    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student student , BindingResult theBindingResult){

        String[] os = student.getOperatingSystems();
        for (String each:os) {
            System.out.println(each);
            System.out.println("");
        }
        if (theBindingResult.hasErrors()) return "StudentDetailsPage";
        else return "StudentConfirmationPage";
    }
    @RequestMapping("/enrollCourses")
    public String showRegistration(Model model){
        Student student = new Student();
        model.addAttribute(student);
        return "CourseRegistrationPage";
    }
    @RequestMapping("/processCourses")
    public String enrollingintoCourses(@ModelAttribute("student") Student student){
        String[] ec = student.getEnrolledCourses();
        for (String each:ec) {
            System.out.println(each);
            System.out.println("");
        }
        return "courseRegistrationConfirmation";
    }
}
