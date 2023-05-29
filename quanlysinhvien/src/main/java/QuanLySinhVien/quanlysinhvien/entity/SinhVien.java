package QuanLySinhVien.quanlysinhvien.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity(name = "SinhVien")
@Table(name = "SinhVien")
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mssv;
    @Column(name = "hoten")
    private String hoten;
    @Column(name = "ngaysinh")
    private Date ngaysinh;
    @Column(name = "email")
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "malop" ,referencedColumnName = "malop",foreignKey = @ForeignKey(name="FK_SINHVIEN_LOP"))
    private Lop lop;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "SinhVien_MonHoc",
    joinColumns = {@JoinColumn(name = "mssv")},
    inverseJoinColumns = {@JoinColumn(name = "mamon")})
    private Set<MonHoc> MonHoc = new HashSet<>();


}
