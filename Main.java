import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[]students=new Student[100];
        int count=0;
        int choice;
        do{
            System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo học lực");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:System.out.print("Nhập số lượng sinh viên: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên " + (i + 1));
                        System.out.print("ID: ");
                        String id = sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Score: ");
                        double score = sc.nextDouble();
                        sc.nextLine();
                        students[count++] = new Student(id, name, score);
                    }
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        students[i].display();
                    }
                    break;
                case 3:
                    System.out.print("Nhập học lực cần tìm (Gioi/Kha/Trung Binh): ");
                    String rank = sc.nextLine();

                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getRank().equalsIgnoreCase(rank)) {
                            students[i].display();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy sinh viên phù hợp!");
                    }
                    break;
                case 4:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Chọn sai chức năng!");
            }
        } while (choice != 4);
    }
}