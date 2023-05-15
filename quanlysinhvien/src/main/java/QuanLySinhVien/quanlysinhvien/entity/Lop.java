package QuanLySinhVien.quanlysinhvien.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity(name = "Lop")
@Table(name = "Lop")
public class Lop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int malop;

    @Column(name = "tenlop",length = 7)
    private String tenlop;
    @OneToMany(mappedBy = "lop",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<SinhVien> students;

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public int getMalop() {
        return malop;
    }

    public void setMalop(int malop) {
        this.malop = malop;
    }
}
