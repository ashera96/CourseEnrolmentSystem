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
public class undergraduate {
    private String student_id;
    private String subject_1;
    private String subject_2;
    private String subject_3;
    private String subject_result_1;
    private String subject_result_2;
    private String subject_result_3;
    private double z_score;
    private int index_number;
    private int rank;
    private String course_id;
    
    public undergraduate() {
    }
    
    public undergraduate(String ID, String subject_1, String subject_2, String subject_3, String result1, String result2, String result3, double z_score, int index_number, int rank, String course_id) {
        this.student_id = ID;
        this.subject_1 = subject_1;
        this.subject_2 = subject_2;
        this.subject_3 = subject_3;
        this.subject_result_1 = result1;
        this.subject_result_2 = result2;
        this.subject_result_3 = result3;
        this.z_score = z_score;
        this.index_number = index_number;
        this.rank = rank;
        this.course_id = course_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getSubject_1() {
        return subject_1;
    }

    public void setSubject_1(String subject_1) {
        this.subject_1 = subject_1;
    }

    public String getSubject_2() {
        return subject_2;
    }

    public void setSubject_2(String subject_2) {
        this.subject_2 = subject_2;
    }

    public String getSubject_3() {
        return subject_3;
    }

    public void setSubject_3(String subject_3) {
        this.subject_3 = subject_3;
    }

    public String getSubject_result_1() {
        return subject_result_1;
    }

    public void setSubject_result_1(String subject_result_1) {
        this.subject_result_1 = subject_result_1;
    }

    public String getSubject_result_2() {
        return subject_result_2;
    }

    public void setSubject_result_2(String subject_result_2) {
        this.subject_result_2 = subject_result_2;
    }

    public String getSubject_result_3() {
        return subject_result_3;
    }

    public void setSubject_result_3(String subject_result_3) {
        this.subject_result_3 = subject_result_3;
    }

    public double getZ_score() {
        return z_score;
    }

    public void setZ_score(double z_score) {
        this.z_score = z_score;
    }

    public int getIndex_number() {
        return index_number;
    }

    public void setIndex_number(int index_number) {
        this.index_number = index_number;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }
    
}
