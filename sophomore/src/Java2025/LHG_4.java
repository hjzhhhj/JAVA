package Java2025;

import java.util.Scanner;

abstract class Studentt {
    protected String name;
    protected int score;
    protected String grade;
    
    public Studentt(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public String getName() {
        return name;
    }
    
    public int getScore() {
        return score;
    }
    
    public String getGrade() {
        return grade;
    }
    
    public abstract void computeGrade();
}

class UndergraduateStudent extends Studentt {
    public UndergraduateStudent(String name) {
        super(name);
    }
    
    @Override
    public void computeGrade() {
        grade = (score >= 70) ? "통과" : "낙제"; // if 보다 간편해서 애용중입니다. ㅎㅎ
    }
}

class GraduateStudent extends Studentt {
    public GraduateStudent(String name) {
        super(name);
    }
    
    @Override
    public void computeGrade() {
        grade = (score >= 80) ? "통과" : "낙제";
    }
}

public class LHG_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studentt[] roster = new Studentt[20];
        int number = 0;

        while (number < 20) {
            System.out.print("학생의 수준을 입력하세요(학부생=1, 대학원생=2): ");
            int level = sc.nextInt();
            sc.nextLine(); // 버퍼를 비워줍니당
            
            System.out.print("학생의 이름을 입력하세요: ");
            String name = sc.nextLine();
            
            System.out.print("학생의 점수를 입력하세요: ");
            int score = sc.nextInt();
            sc.nextLine(); 
            
            if (level == 1) {
                roster[number] = new UndergraduateStudent(name);
            } else {
                roster[number] = new GraduateStudent(name);
            }
            roster[number].setScore(score);
            roster[number].computeGrade();
            number++;
            
            System.out.print("처리할 학생들이 더 있습니까?(예 혹은 아니오): ");
            String more = sc.nextLine();
            if (more.equalsIgnoreCase("아니오")) {
                break;
            }
        }
        
        System.out.println("\n학생 성적");
        System.out.println("학부\t이름\t점수\t학점");
        for (int i = 0; i < number; i++) {
            String levelStr = (roster[i] instanceof UndergraduateStudent) ? "학부" : "대학원";
            System.out.println(levelStr + "\t" + roster[i].getName() + "\t" + roster[i].getScore() + "\t" + roster[i].getGrade());
        }
    }
}