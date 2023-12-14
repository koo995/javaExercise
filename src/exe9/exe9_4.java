package src.exe9;

public class exe9_4 {

    static void printGraph(int[] dataArr, char ch) {
        for (int i = 0; i < dataArr.length; i++) {
            int n = dataArr[i];
            String str = "";
            for (int j = 0; j < n; j++) {
                str += ch;
            }
            System.out.println(str + n);
        }

    }

    public static void main(String[] args) {
        printGraph(new int[]{3,7,1,4}, '*');
    }
}
