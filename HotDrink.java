public class HotDrink extends Product {
    
    public HotDrink(String name, int volume, int temperature){
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }
    public int getVolume(){
        return volume;
    }
    public int getTemperature(){
        return temperature;
    }
    @Override
    public String toString() {
        return String.format("Товар: %s, Объем: %d, Температура: %d", name, volume, temperature);
    }
    
}