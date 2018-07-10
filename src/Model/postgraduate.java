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
public class postgraduate {
    private String student_id;
    private String qualification_type;
    private String institute;
    private int year_of_completion;
    private String course_id;
    
    public postgraduate() {
    }
    
    public postgraduate(String student_id,String qualification_type,String institute,int year_of_completion,String course_id) {
        this.student_id = student_id;
        this.qualification_type = qualification_type;
        this.institute = institute;
        this.year_of_completion = year_of_completion;
        this.course_id = course_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getQualification_type() {
        return qualification_type;
    }

    public void setQualification_type(String qualification_type) {
        this.qualification_type = qualification_type;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public int getYear_of_completion() {
        return year_of_completion;
    }

    public void setYear_of_completion(int year_of_completion) {
        this.year_of_completion = year_of_completion;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }
    
}
