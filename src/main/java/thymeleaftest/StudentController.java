package thymeleaftest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;
    @GetMapping("/")
    public String viewAttendance(Model model) {
        List<Student> presentStudents = studentRepo.findByIsPresent(true);
        List<Student> absentStudents = studentRepo.findByIsPresent(false);
        model.addAttribute("presentStudents", presentStudents);
        model.addAttribute("absentStudents", absentStudents);
        return "index";
    }
}
