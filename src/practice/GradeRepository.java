package practice;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Konrad
 */
public class GradeRepository {
    private ArrayList<Grade> grades;
    private static int min = 0;
    private static int max = 100;

    public GradeRepository(){
        grades = new ArrayList<>();
    }

    public void addGrade(Grade grade) {
        if (grade.getPoints() >= min && grade.getPoints() <= max){
            grades.add(grade);
        }

    }

    public double pointsAverage() {
        if (grades.size() == 0){
            return -1;
        }

        int sum = 0;
        for(Grade g : grades){
            sum += g.getPoints();
        }
        return (double) sum / grades.size();
    }

    public double passingPointsAverage() {
        int sum = 0;
        int counter = 0;
        for(Grade g : grades){
            if (g.getPoints() >= 50){
                sum += g.getPoints();
                counter++;
            }
        }

        if(counter == 0) {
            return -1;
        }

        return (double) sum / counter;
    }

    public int howManyPassed() {
        int howMany = 0;
        for(Grade g : grades){
            if (g.getPoints() >= 50){
                howMany++;
            }
        }
        return howMany;
    }

    public double passPercentage() {
        return (double)100 * howManyPassed() / grades.size();
    }

    public String getGradeDistribution() {
        int[] gradesDistribution = new int[6];
        for(Grade g : grades) {
            gradesDistribution[g.getGrade()]++;
        }

        String out = "";
        for(int i = 5; i >= 0 ;i--) {
            out += i + ": ";
            for(int j = 0; j<gradesDistribution[i];j++){
                out += "*";
            }
            out += "\n";
        }
        return out;
    }
}
