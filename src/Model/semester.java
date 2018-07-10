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
public class semester {
    private int year;
    private int semester_number;
    
    public semester(){
    }
    
    public semester(int year,int semester_number) {
        this.year = year;
        this.semester_number = semester_number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester_number() {
        return semester_number;
    }

    public void setSemester_number(int semester_number) {
        this.semester_number = semester_number;
    }
    
}
