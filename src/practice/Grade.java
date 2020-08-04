package practice;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Konrad
 */
public class Grade {
    private int points;

    public Grade(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public int getGrade() {
        if (points < 50){
            return 0;
        } else if(points < 60) {
            return 1;
        } else if(points < 70) {
            return 2;
        } else if(points < 80) {
            return 3;
        } else if(points < 90) {
            return 4;
        } else {
            return 5;
        }
    }

}
