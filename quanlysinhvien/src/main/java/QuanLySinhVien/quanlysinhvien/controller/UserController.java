package QuanLySinhVien.quanlysinhvien.controller;

import QuanLySinhVien.quanlysinhvien.entity.User;
import QuanLySinhVien.quanlysinhvien.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
        @Autowired
        private UserServices userService;
        @Autowired
        private PasswordEncoder passwordEncoder;
    @GetMapping
    public String viewAllUser(Model model){
        List<User> listUser = userService.listAll();
        model.addAttribute("users",listUser);
        return "user/list";
    }
    @GetMapping("/register")
    public String showNewUserPage(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "user/register";
    }
    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user)
            throws IOException {
        user.setPassword(passwordEncoder.encode((user.getPassword())));
        userService.save(user);
        return "redirect:/users";
    }


}
