//package IOBinary;
//
//import BAITAP.MaterialManager;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
//public class MainPhone implements Serializable {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        PhoneManager phoneManager = new PhoneManager();
//        do {
//            System.out.println("MENU");
//            System.out.println("1. Thêm ");
//            System.out.println("2. Sửa  theo id");
//            System.out.println("3. Xóa  theo id");
//            System.out.println("4. Hiển thị tất cả vật liệu");
//            System.out.println("5. Tìm kiếm sản phẩm theo ID hoặc tên ");
//            System.out.println("11. Lưu thông tin sản phẩm");
//            System.out.println("22. Lấy dữ liệu từ file ");
//            System.out.println("0. Thoát");
//            System.out.println("Nhập lựa chọn: ");
//            int choice = -1;
//            try {
//                choice = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.err.print("");
//            }
//            switch (choice) {
//                case 1:
//                    System.out.println("nhập id");
//                    String id = scanner.nextLine();
//                    System.out.println("nhập ten");
//                    String name = scanner.nextLine();
//                    System.out.println("nhập color");
//                    String color = scanner.nextLine();
//                    System.out.println("nhập giá ");
//                    int cost = scanner.nextInt();
//                    scanner.nextLine();
//                     Phone p=new Phone(id, name, color, cost);
//                       phoneManager.add(p);
//                       phoneManager.writeFile("src/IOBinary/data");
//                       break;
//
//                case 2:
//                    phoneManager.update(scanner);
//                    phoneManager.writeFile("src/IOBinary/data");
//                    break;
//                case 3:
//                    phoneManager.delete(scanner);
//                    phoneManager.writeFile("src/IOBinary/data");
//                    break;
//                case 4:
//                    phoneManager.display();
//                    phoneManager.writeFile("src/IOBinary/data");
//                    break;
//                case 5:
//                    phoneManager.timKiemTheoID(scanner);
//                break;
//
//                case 11:
//                    phoneManager.writeFile("src/IOBinary/data");
//                    break;
//                case 22:
//                    phoneManager.readFile(scanner);
//                    break;
//                case 0:
//                    System.exit(0);
//                default:
//                    System.err.println("Nhập sai!! Vui lòng nhập lại" );
//            }
//        } while (true);
//    }
//
//
//    }
//
