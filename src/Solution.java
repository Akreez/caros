import java.util.ArrayList;

public class Solution {
    static ArrayList<Car> carList = FileReader.readFile();

    public static void startSolution(){
        sumSallary();
        task02("BMW");
        task03();
        task04();
        task05();
        task06();
    }

    private static void sumSallary(){
        // System.out.println(carList.get(0).getPlate());
        double sum = 0;
        for (Car car : carList) {
            sum += car.getPrice();
        }
        System.out.printf("A kocsik árának összege: %.1f LT.\n", sum);
    }

    private static void task02(String brand){
        int counter = 0;
        for (Car car : carList) {
            if (car.getBrand().equals(brand)) {
                counter++;
            }
        }
        System.out.printf("%s számlaló: %d\n",brand, counter);
    }

    private static void task03(){
       int n = carList.size();
       String ker = "Citroen";
       int i = 0;
       while (i<n && !carList.get(i).getBrand().equals(ker)) {
        i++;
       }
       if (i<n) {
        System.out.println("Van "+ ker);
       } else {
        System.out.println("Nincs "+ker);
       }
    }

    private static void task04(){
        String ker = "Audi";
        int i = 0;
        while (!carList.get(i).getBrand().equals(ker)) {
         i++;
        }
         System.out.println("Hányadik helyen: "+ (i+1));
     }

     private static void task05(){
        int n = carList.size();
        String ker = "BMW";
        int i = 0;
        while (i<n && (!carList.get(i).getBrand().equals(ker))) {
         i++;
        }
        if (i<n) {
         System.out.println("Van "+ ker + ". Indexe: " + i);
        } else {
         System.out.println("Nincs "+ker);
        }
     }

     private static void task06(){
        ArrayList<Car> fordList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getBrand().equals("Ford")) {
                fordList.add(car);
            } 
        }
        kiirLista(fordList);
     }
     private static void kiirLista(ArrayList<Car> list){
        for (Car car : list) {
            System.out.println(car.getPlate()+ " "+ car.getBrand());
        }
     }
}
