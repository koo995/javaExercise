package src.exe11.exe11_14;

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
            return Integer.compare(s.total, total);
        }
        return -1;
    }
}