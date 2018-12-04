package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import project.module.Group;
import project.module.Teacher;
import project.service.GroupService;
import project.service.StudentService;
import project.service.TeacherService;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private GroupService groupService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/listGroup")
    public List<Group> listGroup(){
        return groupService.findAll();
    }

    @GetMapping("/listGroupId/{id}")
    public List<Group> listGroupId(@PathVariable("id") long id){
        return groupService.getGroupByTeacherId(id);
    }

    @GetMapping("/listGroupName/{name}")
    public List<Group> listGroupName(@PathVariable("name") String name){
        return groupService.getGroupByGroupName(name);
    }

    @GetMapping("/listStudentByName/{name}")
    public List<Teacher> listStudentByName(@PathVariable("name") String name){
        return teacherService.listTeacherByName(name);
    }
}
