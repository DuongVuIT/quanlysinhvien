package QuanLySinhVien.quanlysinhvien.services;

import QuanLySinhVien.quanlysinhvien.entity.User;
import QuanLySinhVien.quanlysinhvien.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServices {
@Autowired
private UserRepository userRepository;
    public List<User> listAll(){
        return userRepository.findAll();
    }
    public void save(User user){
        userRepository.save(user);
    }
}
