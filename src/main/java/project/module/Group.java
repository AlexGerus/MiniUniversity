package project.module;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "group", schema = "univer_db", catalog = "")
public class Group implements Serializable {

    @Id
    @Column(name = "id_group", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idGroup;

    @Column(name = "name_group")
    private String nameGroup;

    @Column(name = "id_teacher", updatable = false, insertable = false)
    private long idTeacher;

    @OneToMany(mappedBy = "group")
    @JsonManagedReference
    private Set<Student> studentSet = new HashSet<>();

    @ManyToOne
    @JsonBackReference
    private Teacher teacherG;

    public Group() {
    }

    public long getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(long idGroup) {
        this.idGroup = idGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Teacher getTeacherG() {
        return teacherG;
    }

    public void setTeacher(Teacher teacherG) {
        this.teacherG = teacherG;
    }
}
