package IOBinary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneManager implements Serializable {
    public static ArrayList<Phone> phones;

    public PhoneManager() {
        phones = new ArrayList<>();
    }

    public void add(Phone phone) {
        phones.add(phone);
    }

    public static int checkExit(String id) {
        for (Phone p : phones
        ) {
            if (p.getId().equals(id)) {
                return phones.indexOf(p);
            }
        }
        return -1;
    }

    public void update(Scanner scanner) {
        try {
            System.out.println("Nhập id sản phẩm muốn sửa: ");
            String idUpdate = scanner.nextLine();
            int index;
            if ((index = checkExit(idUpdate)) != -1) {
                System.out.println("Nhập ID mới: ");
                String id = scanner.nextLine();
                if (!id.equals("")) {
                    phones.get(index).setId(id);
                }
                System.out.println("Nhập tên mới: ");
                String name = scanner.nextLine();
                if (!name.equals("")) {
                    phones.get(index).setName(name);
                }
                System.out.println("Nhập color mới: ");
                String color = scanner.nextLine();
                if (!color.equals("")) {
                    phones.get(index).setColor(color);
                }
                System.out.println("Nhập đơn giá mới: ");
                String cost = scanner.nextLine();
                if (!cost.equals("")) {
                    phones.get(index).setCost(Integer.parseInt(cost));
                }
                writeFile("src/IOBinary/data");

            } else {
                System.err.println("không có sản phẩm nào");
            }

        } catch (Exception e) {
            System.out.println("Nhập sai!!! Vui lòng nhập lại");
        }
    }

    public static void writeFile(String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(phones);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void readFile(Scanner scanner) {
        System.out.println("nhập  path file cần lấy dữ liệu  "); String s=scanner.nextLine();
        ArrayList<Phone> phoneArrayList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(s);
            ObjectInputStream ois = new ObjectInputStream(fis);
            phoneArrayList = (ArrayList<Phone>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        phones= phoneArrayList;
    }


    public void delete(Scanner scanner) {
        try {
            System.out.println("Nhập id sản phẩm bạn muốn xóa: ");
            String idUpdate = scanner.nextLine();
            int index;
            if ((index = checkExit(idUpdate)) != -1) {
                phones.remove(index);
//                writeFile();
            } else {
                System.out.println("Sản phẩm bạn muốn xóa không tồn tại!");
            }
        } catch (NumberFormatException e) {
            System.err.println("Thông tin bạn nhập chưa phù hợp! Mời nhập lại!");
        }
    }

    public void display() {
        if (phones.isEmpty()) {
            System.out.println("Hiện không có sản phẩm nào!");
        } else {
            for (Phone m : phones) {
                System.out.println(m);
            }
        }
    }
    public void timKiemTheoID(Scanner scanner){
        System.out.println("nhập mã id hoặc tên sản phẩm cần tìm "); String check=scanner.nextLine();
        for (Phone p:phones) {
            if (p.getId().equals(check) || p.getName().equals(check)){
                System.out.println(p);
            }
        }
    }


}

