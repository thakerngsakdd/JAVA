interface ICity {
    public void display();

    public void setData(String cityNamem, long population);

    public long getPopulation();
}

class NewCity implements ICity {
    String name; // ชื่อเมือง
    long numPop;

    public void display() {
        System.out.println(name + " City have population " + numPop + " people ");
    }

    public void setData(String cityNamem, long population) {
        name = cityNamem;
        numPop = population;
    }

    public long getPopulation() {
        return numPop;
    }
}

public class City {
    public static void main(String[] args) {
        NewCity city1 = new NewCity();
        city1.setData("Bangkok", 300000);
        city1.display();

        NewCity city2 = new NewCity();
        city2.setData("Buriram", 250000);
        city2.display();

        NewCity city3 = new NewCity();
        city3.setData("Sisaket", 150000);
        city3.display();

    }

}
