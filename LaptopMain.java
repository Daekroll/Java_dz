import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LaptopMain {
    public static int work = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Laptop> catalog = new LinkedList<>(); 
        Laptop laptop1 = new Laptop("Intel", 8, 512, "Windows", "Черный", 24, "Palit", "Asus", 49999);
        Laptop laptop2 = new Laptop("Intel", 16, 1024, "Windows", "Серый", 27, "NVidia", "Lenovo", 79999);
        Laptop laptop3 = new Laptop("AMD", 8, 512, "Windows", "Черный", 24, "AMD", "Asus", 49999);
        Laptop laptop4 = new Laptop("AMD", 4, 250, "Linux", "Черный", 17, "NVidia", "HP", 39999);
        Laptop laptop5 = new Laptop("Intel", 32, 2048, "Windows", "Красный", 32, "NVidia", "MSI", 119999);
        Laptop laptop6 = new Laptop("AMD", 8, 512, "Linux", "Белый", 24, "NVidia", "Asus", 39999);
        Laptop laptop7 = new Laptop("Intel", 8, 512, "Windows", "Черный", 24, "NVidia", "Acer", 49999);
        Laptop laptop8 = new Laptop("M1", 32, 4096, "macOS", "Серебристый", 27, "Apple graphics", "Apple", 399999);
        Laptop laptop9 = new Laptop("Intel", 8, 512, "Windows", "Черный", 24, "NVidia", "Asus", 49999);
        Laptop laptop10 = new Laptop("M1", 8, 512, "macOS", "Черный", 24, "Apple graphics", "Apple", 179999);
        Laptop laptop11 = new Laptop("Intel", 8, 512, "Windows", "Черный", 24, "NVidia", "Acer", 49999);
        catalog.add(laptop1);
        catalog.add(laptop2);
        catalog.add(laptop3);
        catalog.add(laptop4);
        catalog.add(laptop5);
        catalog.add(laptop6);
        catalog.add(laptop7);
        catalog.add(laptop8);
        catalog.add(laptop9);
        catalog.add(laptop10);
        catalog.add(laptop11);
        
        welcome();
        while(work != 3){
        podbor(catalog);
        }
    }
    public static void welcome() {
        String wellcome = "Добро пожаловать в наш онлайн-магазин!\n"
                        + "Мы поможем вам подобрать ноутбук под ваши требования\n"
                        + "Следуйте указаниям системы и ПОЖАЛУЙСТА вводите только то что треубется\n"
                        + "(без воображения, спасибо!)\n";
        System.out.println(wellcome);
    }
    public static void podbor(List<Laptop> catalog) {
        List<Laptop> sorter = catalog;
        String variable = "Выберите действие:\n"
                        + "1 - Посмотреть все ноутбуки\n"
                        + "2 - Выбрать фильтры\n"
                        + "3 - Закончить работу с программой\n";
        System.out.println(variable);
        String change1 = scanner.nextLine();
        work = Integer.parseInt(change1);
        switch (change1) {
            case "1":
                System.out.println(catalog);
                break;
            case "2":
                filter(sorter);
                break;
            default:
                System.out.println("Пока-пока!");
                break;
        }
    }
    public static void filter(List<Laptop> sorter) {
        String str = "Выберите параметр для фильтрации:\n"
                    + "1 - Производитель\n"
                    + "2 - Процессор\n"
                    + "3 - Видеокарта\n"
                    + "4 - ОЗУ\n"
                    + "5 - Объем жесткого диска\n"
                    + "6 - Диагональ экрана\n"
                    + "7 - Цвет\n"
                    + "8 - Цена\n"
                    + "9 - Операционная система\n"
                    + "10 - Закончить работу с программой\n";
        System.out.println(str);
        String change1 = scanner.nextLine();
        switch (change1) {
            case "1":
                sorter = changeManufacturer(sorter);
                break;
            case "2":
            sorter = changeProcessor(sorter);
                break;
            case "3":
            sorter = changeVideoCard(sorter);
                break;
            case "4":
            sorter = changeRam(sorter);
                break;
            case "5":
            sorter = changeHDD(sorter);
                break;
            case "6":
            sorter = changeScreenDiagonal(sorter);
                break;
            case "7":
            sorter = changeColor(sorter);
                break;
            case "8":
            sorter = changeCost(sorter);
                break;
            case "9":
            sorter = changeOperationSystem(sorter);
                break;
        
            default:

                break;
        }
        String optional = "Показать результат или продолжить фильтрацию?\n"
                        + "1 - Вывести результат\n"
                        + "2 - Продолжить фильтрацию\n";
        System.out.println(optional);
        String change2 = scanner.nextLine();
        if (Integer.parseInt(change2) == 1){
            System.out.println(sorter);
        } else if (Integer.parseInt(change2) == 2) {
            filter(sorter);
        }
    }
    public static List<Laptop> changeManufacturer(List<Laptop> sorter) {
        String sort = "Выберите производителя который вам подохдит:\n"
        + "1 - Asus\n"
        + "2 - Lenovo\n"
        + "3 - Acer\n"
        + "4 - MSI\n"
        + "5 - Apple\n"
        + "6 - HP\n"
        + "7 - Не имеет значения\n";
        System.out.println(sort);
        String change = scanner.nextLine();
        List<Laptop> sorter1 = new LinkedList<>();
        
        switch (change) {
            case "1":
                sorter1 = sorterManufacturer("Asus", sorter);
                break;
            case "2":
                sorter1 = sorterManufacturer("Lenovo", sorter);
                break;
            case "3":
                sorter1 = sorterManufacturer("Acer", sorter);
                break;
            case "4":
                sorter1 = sorterManufacturer("MSI", sorter);
                break;
            case "5":
                sorter1 = sorterManufacturer("Apple", sorter);
                break;
            case "6":
                sorter1 = sorterManufacturer("HP", sorter);
                break;
            default:
                sorter1 = sorter;
                break;
        }
        return sorter1;
    }
    public static List<Laptop> sorterManufacturer(String manufacturer, List<Laptop> sorter) {
        List<Laptop> sorter2 = new LinkedList<Laptop>();
        for (int i = 0; i < sorter.size(); i++) {
            if (sorter.get(i).getManufacturer().equals(manufacturer)){
                sorter2.add(sorter.get(i));
            }
        }
        return sorter2;
    }
    public static List<Laptop> changeProcessor(List<Laptop> sorter) {
        String sort = "Какой процессор вам подходит?\n"
        +"1 - Intel\n"
        +"2 - AMD\n"
        +"3 - M1\n"
        +"4 - Не имеет значения\n";
        System.out.println(sort);
        String change = scanner.nextLine();
        List<Laptop> sorter1 = new LinkedList<>();
        
        switch (change) {
            case "1":
                sorter1 = sorterProcessor("Intel", sorter);
                break;
            case "2":
                sorter1 = sorterProcessor("AMD", sorter);
                break;
            case "3":
                sorter1 = sorterProcessor("M1", sorter);
                break;
            default:
                sorter1 = sorter;
                break;
        }
        return sorter1;
    }
    public static List<Laptop> sorterProcessor(String processor, List<Laptop> sorter) {
        List<Laptop> sorter2 = new LinkedList<Laptop>();
        for (int i = 0; i < sorter.size(); i++) {
            if (sorter.get(i).getProcessor().equals(processor)){
                sorter2.add(sorter.get(i));
            }
        }
        return sorter2;
    }
    public static List<Laptop> changeRam(List<Laptop> sorter) {
        String sort = "Какой объем ОЗУ вам подходит?\n"
        +"1 - 4 гб\n"
        +"2 - 8 гб\n"
        +"3 - 16 гб\n"
        +"4 - 32 гб\n"
        +"5 - Не имеет значения\n";
        System.out.println(sort);
        String change = scanner.nextLine();
        List<Laptop> sorter1 = new LinkedList<>();
        
        switch (change) {
            case "1":
                sorter1 = sorterRAM(4, sorter);
                break;
            case "2":
                sorter1 = sorterRAM(8, sorter);
                break;
            case "3":
                sorter1 = sorterRAM(16, sorter);
                break;
            case "4":
                sorter1 = sorterRAM(32, sorter);
                break;
            default:
                sorter1 = sorter;
                break;
        }
        return sorter1;
    }
    public static List<Laptop> sorterRAM(int ram, List<Laptop> sorter) {
        List<Laptop> sorter2 = new LinkedList<Laptop>();
        for (int i = 0; i < sorter.size(); i++) {
            if (sorter.get(i).getRam() == ram){
                sorter2.add(sorter.get(i));
            }
        }
        return sorter2;
    }
    public static List<Laptop> changeHDD(List<Laptop> sorter) {
        String sort = "Какой объем жесткого диска вам подходит?\n"
        +"1 - 250 гб\n"
        +"2 - 512 гб\n"
        +"3 - 1024 гб\n"
        +"4 - 2048 гб\n"
        +"5 - 4096 гб\n"
        +"6 - Не имеет значения\n";
        System.out.println(sort);
        String change = scanner.nextLine();
        List<Laptop> sorter1 = new LinkedList<>();
        
        switch (change) {
            case "1":
                sorter1 = sorterHDD(250, sorter);
                break;
            case "2":
                sorter1 = sorterHDD(512, sorter);
                break;
            case "3":
                sorter1 = sorterHDD(1024, sorter);
                break;
            case "4":
                sorter1 = sorterHDD(2048, sorter);
                break;
            case "5":
                sorter1 = sorterHDD(4096, sorter);
                break;
            default:
                sorter1 = sorter;
                break;
        }
        return sorter1;
    }
    public static List<Laptop> sorterHDD(int hDD, List<Laptop> sorter) {
        List<Laptop> sorter2 = new LinkedList<Laptop>();
        for (int i = 0; i < sorter.size(); i++) {
            if (sorter.get(i).getHDD() == hDD){
                sorter2.add(sorter.get(i));
            }
        }
        return sorter2;
    }
    public static List<Laptop> changeScreenDiagonal(List<Laptop> sorter) {
        String sort = "Какая диагональ экрана вам подходит?\n"
        +"1 - 17\n"
        +"2 - 24\n"
        +"3 - 27\n"
        +"4 - 32\n"
        +"5 - Не имеет значения\n";
        System.out.println(sort);
        String change = scanner.nextLine();
        List<Laptop> sorter1 = new LinkedList<>();
        
        switch (change) {
            case "1":
                sorter1 = sorterScreenDiagonal(17, sorter);
                break;
            case "2":
                sorter1 = sorterScreenDiagonal(24, sorter);
                break;
            case "3":
                sorter1 = sorterScreenDiagonal(27, sorter);
                break;
            case "4":
                sorter1 = sorterScreenDiagonal(32, sorter);
                break;
            default:
                sorter1 = sorter;
                break;
        }
        return sorter1;
    }
    public static List<Laptop> sorterScreenDiagonal(int screenDiagonal, List<Laptop> sorter) {
        List<Laptop> sorter2 = new LinkedList<Laptop>();
        for (int i = 0; i < sorter.size(); i++) {
            if (sorter.get(i).getScreenDiagonal() == screenDiagonal){
                sorter2.add(sorter.get(i));
            }
        }
        return sorter2;
    }
    public static List<Laptop> changeCost(List<Laptop> sorter) {
        String sort = "Какой у вас бюджет?\n"
        +"Введите сумму которую готовы потратить: ";
        System.out.print(sort);
        String change = scanner.nextLine();
        List<Laptop> sorter1 = new LinkedList<>();
        int cost = Integer.parseInt(change);
        sorter1 = sorterCost(cost, sorter);

        return sorter1;
    }
    public static List<Laptop> sorterCost(int cost, List<Laptop> sorter) {
        List<Laptop> sorter2 = new LinkedList<Laptop>();
        for (int i = 0; i < sorter.size(); i++) {
            if (sorter.get(i).getCost() <= cost){
                sorter2.add(sorter.get(i));
            }
        }
        return sorter2;
    }
    public static List<Laptop> changeColor(List<Laptop> sorter) {
        String sort = "Какой цвет вам подходит?\n"
        +"1 - Красный\n"
        +"2 - Черный\n"
        +"3 - Синий\n"
        +"4 - Серебристый\n"
        +"5 - Белый\n"
        +"6 - Не имеет значения\n";
        System.out.println(sort);
        String change = scanner.nextLine();
        List<Laptop> sorter1 = new LinkedList<>();
        
        switch (change) {
            case "1":
                sorter1 = sorterColor("Красный", sorter);
                break;
            case "2":
                sorter1 = sorterColor("Черный", sorter);
                break;
            case "3":
                sorter1 = sorterColor("Синий", sorter);
                break;
            case "4":
                sorter1 = sorterColor("Серебристый", sorter);
                break;
            case "5":
                sorter1 = sorterColor("Белый", sorter);
                break;
            default:
                sorter1 = sorter;
                break;
        }
        return sorter1;
    }
    public static List<Laptop> sorterColor(String color, List<Laptop> sorter) {
        List<Laptop> sorter2 = new LinkedList<Laptop>();
        for (int i = 0; i < sorter.size(); i++) {
            if (sorter.get(i).getColor().equals(color)){
                sorter2.add(sorter.get(i));
            }
        }
        return sorter2;
    }
    public static List<Laptop> changeVideoCard(List<Laptop> sorter) {
        String sort = "Какой объем жесткого диска вам подходит?\n"
        +"1 - NVidia\n"
        +"2 - AMD\n"
        +"3 - Apple graphics\n"
        +"4 - Не имеет значения\n";
        System.out.println(sort);
        String change = scanner.nextLine();
        List<Laptop> sorter1 = new LinkedList<>();
        
        switch (change) {
            case "1":
                sorter1 = sorterVideoCard("NVidia", sorter);
                break;
            case "2":
                sorter1 = sorterVideoCard("AMD", sorter);
                break;
            case "3":
                sorter1 = sorterVideoCard("Apple graphics", sorter);
                break;
            default:
                sorter1 = sorter;
                break;
        }
        return sorter1;
    }
    public static List<Laptop> sorterVideoCard(String videoCard, List<Laptop> sorter) {
        List<Laptop> sorter2 = new LinkedList<Laptop>();
        for (int i = 0; i < sorter.size(); i++) {
            if (sorter.get(i).getVideoCard().equals(videoCard)){
                sorter2.add(sorter.get(i));
            }
        }
        return sorter2;
    }
    public static List<Laptop> changeOperationSystem(List<Laptop> sorter) {
        String sort = "Какой объем жесткого диска вам подходит?\n"
        +"1 - Windows\n"
        +"2 - Linux\n"
        +"3 - macOS\n"
        +"4 - Не имеет значения\n";
        System.out.println(sort);
        String change = scanner.nextLine();
        List<Laptop> sorter1 = new LinkedList<>();
        
        switch (change) {
            case "1":
                sorter1 = sorterOperationSystem("Windows", sorter);
                break;
            case "2":
                sorter1 = sorterOperationSystem("Linux", sorter);
                break;
            case "3":
                sorter1 = sorterOperationSystem("macOS", sorter);
                break;
            default:
                sorter1 = sorter;
                break;
        }
        return sorter1;
    }
    public static List<Laptop> sorterOperationSystem(String operationSystem, List<Laptop> sorter) {
        List<Laptop> sorter2 = new LinkedList<Laptop>();
        for (int i = 0; i < sorter.size(); i++) {
            if (sorter.get(i).getOperationSystem().equals(operationSystem)){
                sorter2.add(sorter.get(i));
            }
        }
        return sorter2;
    }

}
