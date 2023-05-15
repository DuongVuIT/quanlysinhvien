package QuanLySinhVien.quanlysinhvien.repository;

import QuanLySinhVien.quanlysinhvien.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<SinhVien,Integer> {
}
