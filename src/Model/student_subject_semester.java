/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ashera
 */
public class student_subject_semester {
    private String student_id;
    private String subject_code;
    private int semester_id;
    
    public student_subject_semester(){
    }
    
    public student_subject_semester(String student_id,String subject_code,int semester_id) {
        this.student_id = student_id;
        this.subject_code = subject_code;
        this.semester_id = semester_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public int getSemester_id() {
        return semester_id;
    }

    public void setSemester_id(int semester_id) {
        this.semester_id = semester_id;
    }
    
}
