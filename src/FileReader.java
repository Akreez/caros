import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<Car> readFile(){
        try {
            return tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba!");
            System.err.println(e.getMessage());
            return null;
        }
    }

    private static ArrayList<Car> tryReadFile() throws FileNotFoundException{
        ArrayList<Car> carList = new ArrayList<>();
        File file = new File("cars2.csv");
        try(Scanner sc = new Scanner(file)){
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] lineArray = line.split(",");
                Car car = new Car();
                car.setId(Integer.parseInt(lineArray[0].trim()));
                car.setPlate(lineArray[1].replace("\"", "".trim()));
                car.setBrand(lineArray[2].replace("\"", "".trim()));
                car.setYear(Integer.parseInt(lineArray[3]));
                car.setPrice(Double.parseDouble(lineArray[4]));
                carList.add(car);
            }
        }
        return carList;
    }
}
