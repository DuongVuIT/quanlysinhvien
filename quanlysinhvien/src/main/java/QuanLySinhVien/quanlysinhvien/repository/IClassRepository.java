package QuanLySinhVien.quanlysinhvien.repository;

import QuanLySinhVien.quanlysinhvien.entity.Lop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClassRepository extends JpaRepository<Lop,Integer> {
}
