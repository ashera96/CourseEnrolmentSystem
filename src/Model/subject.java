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
public class subject {
    private String subject_code;
    private String subject_name;
    private double fee;
    private int credits;
    private String course_id;
    private int semester_id;
    private String lecturer_id;
    private String day_of_week;
    private String time_slot;
    private String lecture_hall;
    private boolean is_compulsory;
    
    subject() {
    }
    
    public subject(String subject_code, String subject_name, double fee, int credits, String course_id, int semester_id, String lecturer_id, String day_of_week, String time_slot, String lecture_hall, boolean is_compulsory) {
        this.subject_code = subject_code;
        this.subject_name = subject_name;
        this.fee = fee;
        this.credits = credits;
        this.course_id = course_id;
        this.semester_id = semester_id;
        this.lecturer_id = lecturer_id;
        this.day_of_week = day_of_week;
        this.time_slot = time_slot;
        this.lecture_hall = lecture_hall;
        this.is_compulsory = is_compulsory;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public int getSemester_id() {
        return semester_id;
    }

    public void setSemester_id(int semester_id) {
        this.semester_id = semester_id;
    }

    public String getLecturer_id() {
        return lecturer_id;
    }

    public void setLecturer_id(String lecturer_id) {
        this.lecturer_id = lecturer_id;
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

    public String getLecture_hall() {
        return lecture_hall;
    }

    public void setLecture_hall(String lecture_hall) {
        this.lecture_hall = lecture_hall;
    }

    public boolean isIs_compulsory() {
        return is_compulsory;
    }

    public void setIs_compulsory(boolean is_compulsory) {
        this.is_compulsory = is_compulsory;
    }
    
}
