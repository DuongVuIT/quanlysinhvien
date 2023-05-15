package QuanLySinhVien.quanlysinhvien.controller;

import QuanLySinhVien.quanlysinhvien.entity.SinhVien;
import QuanLySinhVien.quanlysinhvien.repository.IStudentRepository;
import QuanLySinhVien.quanlysinhvien.services.ClassServices;
import QuanLySinhVien.quanlysinhvien.services.MonHocServices;
import QuanLySinhVien.quanlysinhvien.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Signature;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
@Autowired
    private StudentServices studentServices;
@Autowired
    private MonHocServices monHocServices;
@Autowired
    private ClassServices classServices;
@GetMapping
    public String showAllStudent(Model model){
    List<SinhVien> students = studentServices.getAllSinhVien();
    model.addAttribute("students",students);
    return "student/list";
}
    @GetMapping("/add")
    public String addBookForm(Model model){
        model.addAttribute("student",new SinhVien());
        model.addAttribute("lops",classServices.getAllLop());
        return "student/add";
    }
    @PostMapping("/add")
    public  String addBook(@ModelAttribute("student") SinhVien student){
        studentServices.addSinhVien(student);
        return "redirect:/students";
    }
}
