package src.exe9;

public class exe9_3 {
    public static void main(String[] args) {
        String fullPath = "c://jdk1.8//work//PathSerparateTest.java";
        String path = "";
        String fileName = "";

        int i = fullPath.lastIndexOf("//");
        path = fullPath.substring(0, i);
        fileName = fullPath.substring(i+2);

        System.out.println("fullPath = " + fullPath);
        System.out.println("path = " + path);
        System.out.println("fileName = " + fileName);
    }
}
