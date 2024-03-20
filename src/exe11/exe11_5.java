package src.exe11;


import java.util.*;

class Student implements Comparable{

    String name;
    int ban;
    int no;
    int kor, eng, math;

    int total;
    int schoolRank;
    int classRank;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor + eng + math;
    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", total: " + getTotal() +
                ", average: " + getAverage() +
                ", schoolRank: " + schoolRank +
                ", classRank: " + classRank;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student s = (Student) o;
            return total < s.total ? 1: (total == s.total ? 0:-1);
        }
        return -1;
    }
}

class ClassTotalComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Student && o2 instanceof Student) {
            Student s1 = (Student)o1;
            Student s2 = (Student)o2;
            if(s1.ban == s2.ban) {
                return s1.total < s2.total ? 1 : -1;
            }else {
                return s1.ban > s2.ban ? 1 : -1;
            }
        }
        return -1;
    }
}

public class exe11_5 {

    public static void calculateClassRank(List list) {
        Collections.sort(list, new ClassTotalComparator());

        int prevBan = -1;
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();

        for (int i = 0; i < length; i++) {
            Student s = (Student) list.get(i);
            if (s.ban != prevBan) {
                prevRank = 0;
                prevTotal = 0;
            }
            // 이전 점수와 현재 점수가 같으면 이전점수와 같은 rank를 주고
            // 그 다음 등수를 고려하여 이전 점수를 1 올려준다.
            if (s.total == prevTotal) {
                s.classRank = prevRank;
                prevRank++;
            } else {
                // 이전 점수와 현재 점수가 같지 않으면 이전점수 +1을 rank로 주고
                // prevRank를 현재점수로 초기화한다.
                s.classRank = prevRank + 1;
                prevRank = s.classRank;
            }
            // 다음 계산이 가능하도록 현재 ban,total을 각각 이전ban, total에 초기화.
            prevBan = s.ban;
            prevTotal = s.total;

        }
    }


    public static void calculateSchoolRank(List list) {
        Collections.sort(list); // 자 여기서 총점이 높은 곳에서 낮은 곳으로 정렬될 것이다.
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();
        for (int i = 0; i < length; i++) {
            // i는 처리한 녀석의 숫자를 뜻한다.
            Student s = (Student) (list.get(i));
            if (s.total == prevTotal) {
                s.schoolRank = prevRank;
            } // 토탈 점수가 다르다면, 이제 등수 계산을 해야지
            else {
                s.schoolRank = i+1;
                prevTotal = s.total;
                prevRank = s.schoolRank;
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student("김자바", 1, 2, 80, 80, 90));
        list.add(new Student("이자바", 2, 1, 70, 90, 70));
        list.add(new Student("안자바", 2, 2, 60, 100, 80));

        calculateSchoolRank(list);
        calculateClassRank(list);

        for (Object o : list) {
            System.out.println(o);
        }
    }



}
