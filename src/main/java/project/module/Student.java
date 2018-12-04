package project.module;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student", schema = "univer_db", catalog = "")
public class Student implements Serializable {

    @Id
    @Column(name = "id_student", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idStudent;

    @Column(name = "name_student")
    private String nameStudent;

    @Column(name = "age_student")
    private int ageStudent;

    @Column(name = "id_group")
    private long idGroup;

    @Column(name = "id_teacher")
    private long idTeacher;

    @ManyToOne
    @JsonBackReference
    private Group group;

    @ManyToOne
    @JsonBackReference
    private Teacher teacherS;

    public Student() {
    }

    public long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(long idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }

    public long getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(long idGroup) {
        this.idGroup = idGroup;
    }

    public long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Teacher getTeacherS() {
        return teacherS;
    }

    public void setTeacherS(Teacher teacherS) {
        this.teacherS = teacherS;
    }
}
