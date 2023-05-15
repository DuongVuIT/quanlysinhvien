package QuanLySinhVien.quanlysinhvien.services;

import QuanLySinhVien.quanlysinhvien.entity.Lop;
import QuanLySinhVien.quanlysinhvien.repository.IClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassServices {
@Autowired
    private IClassRepository classRepository;
public List<Lop> getAllLop(){
    return classRepository.findAll();
}
    public Lop getLopByMssv(int mssv){
        Optional<Lop> optionalLop = classRepository.findById(mssv);
        if(optionalLop.isPresent()){
            return optionalLop.get();
        }else {
            throw new RuntimeException("Lop not found");
        }

    }
    public Lop saveCategory(Lop lop){
        return classRepository.save(lop);
    }
    public void deleteCategory(int mssv){
        classRepository.deleteById(mssv);
    }
}
