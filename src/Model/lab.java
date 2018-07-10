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
public class lab {
    private String day_of_week;
    private String time_slot;
    private String lab_code;
    private String subject_code;
    private String instructor_id;
    private String student_list;
     
    public lab(){
    }
    
    public lab(String day_of_week, String time_slot, String lab_code, String subject_code, String instructor_id, String student_list) {
        this.day_of_week = day_of_week;
        this.time_slot = time_slot;
        this.lab_code = lab_code;
        this.subject_code = subject_code;
        this.instructor_id = instructor_id;
        this.student_list = student_list;
    }

    public String getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(String day_of_week) {
        this.day_of_week = day_of_week;
    }

    public String getTime_slot() {
        return time_slot;
    }

    public void setTime_slot(String time_slot) {
        this.time_slot = time_slot;
    }

    public String getLab_code() {
        return lab_code;
    }

    public void setLab_code(String lab_code) {
        this.lab_code = lab_code;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public String getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(String instructor_id) {
        this.instructor_id = instructor_id;
    }

    public String getStudent_list() {
        return student_list;
    }

    public void setStudent_list(String student_list) {
        this.student_list = student_list;
    }
    
    
}
