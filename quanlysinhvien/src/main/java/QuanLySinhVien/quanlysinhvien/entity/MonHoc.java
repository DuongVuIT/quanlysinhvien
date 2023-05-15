package QuanLySinhVien.quanlysinhvien.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity(name = "MonHoc")
@Table(name = "MonHoc")
public class MonHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mamon;
    @Column(name = "tenmon")
    private String tenmon;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "SinhVien_MonHoc",
            joinColumns = {@JoinColumn(name = "mamon")},
            inverseJoinColumns = {@JoinColumn(name = "mssv")})
    private Set<SinhVien> sinhVien = new HashSet<>();

    public int getMamon() {
        return mamon;
    }

    public void setMamon(int mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }
}
