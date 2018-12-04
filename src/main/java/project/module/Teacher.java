package project.module;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "teacher", schema = "univer_db", catalog = "")
public class Teacher implements Serializable {

    @Id
    @Column(name = "id_teacher", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTeacher;

    @Column(name = "name_teacher")
    private String nameTeacher;

    @OneToMany(mappedBy = "teacherS")
    @JsonManagedReference
    private Set<Student> studentSet = new HashSet<>();

    @OneToMany(mappedBy = "teacherG")
    @JsonManagedReference
    private Set<Group> groupSet = new HashSet<>();

    public Teacher() {
    }

    public long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Set<Group> getGroupSet() {
        return groupSet;
    }

    public void setGroupSet(Set<Group> groupSet) {
        this.groupSet = groupSet;
    }
}
