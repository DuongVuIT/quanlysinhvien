package QuanLySinhVien.quanlysinhvien.services;

import QuanLySinhVien.quanlysinhvien.entity.SinhVien;
import QuanLySinhVien.quanlysinhvien.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServices {
    @Autowired
    private IStudentRepository iStudentRepository;
    public List<SinhVien> getAllSinhVien(){
        return iStudentRepository.findAll();
    }
    public SinhVien getSinhVienByMssv(int mssv){
        Optional<SinhVien> optional = iStudentRepository.findById(mssv);
        return optional.orElse(null);
    }
    public void addSinhVien(SinhVien sinhVien){
        iStudentRepository.save(sinhVien);
    }
    public void updateSinhVien(SinhVien sinhVien){
        iStudentRepository.save(sinhVien);
    }
    public void deleteSinhVien(SinhVien sinhVien){
        iStudentRepository.save(sinhVien);
    }
}
