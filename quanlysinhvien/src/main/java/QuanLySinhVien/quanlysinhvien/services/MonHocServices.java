package QuanLySinhVien.quanlysinhvien.services;

import QuanLySinhVien.quanlysinhvien.entity.MonHoc;
import QuanLySinhVien.quanlysinhvien.repository.IMonHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonHocServices {
    @Autowired
    private IMonHocRepository monHocRepository;
    public List<MonHoc> getAllMonHoc(){
        return monHocRepository.findAll();
    }
    public MonHoc getMonHocById(int mssv){
        Optional<MonHoc> optionalCategory = monHocRepository.findById(mssv);
        if(optionalCategory.isPresent()){
            return optionalCategory.get();
        }else {
            throw new RuntimeException("Mon Hoc not found");
        }

    }
    public MonHoc saveMonHoc(MonHoc monHoc){
        return monHocRepository.save(monHoc);
    }
    public void deleteMonHoc(int mssv){
        monHocRepository.deleteById(mssv);
    }
}
