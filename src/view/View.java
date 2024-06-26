package view;

import regexcontroller.RegexController;

import java.util.Scanner;

public class View {
    private RegexController regexController;

    public View(){
    }
    public void printIntroduction(){
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ " +
                "BỆNH ÁN");
    }
    public void printMenu(){
        System.out.println("1. Thêm mới");
        System.out.println("2. Xóa" );
        System.out.println("3. " +
                "Xem danh sách các bệnh án");
        System.out.println("4. Thoát");
        System.out.println("Mời bạn chọn chức năng: ");
    }
    public int getChoice(){
        try{
            Scanner scanner = getScanner();
            return scanner.nextInt();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
                        throw new IllegalStateException("Nhap sai");
        }
    }

    public Scanner getScanner(){
        return new Scanner(System.in);
    }

    public void navigateToRegexControllers(int userChoice) {
        regexController.navigateToPatientManager(userChoice);

    }
}
