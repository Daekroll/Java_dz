import java.util.Objects;

public class Laptop {
//     -Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.

    private String processor;
    private int ram;
    private int hDD;
    private String operationSystem;
    private String color;
    private int screenDiagonal;
    private String videoCard;
    private String manufacturer;
    private int cost;

    public Laptop(String processor, int ram, int hDD, String operationSystem, String color, int screenDiagonal, String videoCard, String manufacturer, int cost){
        this.processor = processor;
        this.ram = ram;
        this.hDD = hDD;
        this.operationSystem = operationSystem;
        this.color = color;
        this.screenDiagonal = screenDiagonal;
        this.videoCard = videoCard;
        this.manufacturer = manufacturer;
        this.cost = cost;

    }   

    public String getProcessor(){
        return processor;
    }
    public int getRam(){
        return ram;
    }
    public int getHDD(){
        return hDD;
    }
    public String getOperationSystem(){
        return operationSystem;
    }
    public String getColor(){
        return color;
    }
    public int getScreenDiagonal(){
        return screenDiagonal;
    }
    public String getVideoCard(){
        return videoCard;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public int getCost(){
        return cost;
    }

    public void setProcessor(String processor){
        this.processor = processor;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public void setHDD(int hDD){
        this.hDD = hDD;
    }
    public void setOperationSystem(String operationSystem){
        this.operationSystem = operationSystem;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setScreenDiagonal(int screenDiagonal){
        this.screenDiagonal = screenDiagonal;
    }
    public void setVideoCard(String videoCard){
        this.videoCard = videoCard;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setCost(int cost){
        this.cost = cost;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Производитель: %s Операционная система: %s Процессор: %s Оперативная память: %dгб Объем жесткого диска: %dгб Видеокарта: %s Диагональ экрана: %d Цвет: %s Цена: %d руб.\n", manufacturer, operationSystem, processor, ram, hDD, videoCard, screenDiagonal, color, cost);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Laptop laptop = (Laptop) obj;

        return processor.equals(laptop.processor) && ram == laptop.ram && hDD == laptop.hDD && operationSystem.equals(laptop.operationSystem) && color.equals(laptop.color) && screenDiagonal == laptop.screenDiagonal && videoCard.equals(laptop.videoCard) && manufacturer.equals(laptop.manufacturer) && cost == laptop.cost;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(processor, ram, hDD, operationSystem, color, screenDiagonal, videoCard, manufacturer, cost);
    }

}
