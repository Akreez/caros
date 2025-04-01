import java.util.ArrayList;

public class Solution {
    static ArrayList<Car> carList = FileReader.readFile();

    public static void startSolution(){
        sumPrice(); //összegzés tétele
        task02("BMW"); //megszámlálás tétele
        task03("Citroen");
        task04("Audi");
        task05("BMW");
        task06("Ford");
        task07(); //szétválogatás tétel
    }

    private static void sumPrice(){
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

    private static void task03(String brand){
       int n = carList.size();
       int i = 0;
       while (i<n && !carList.get(i).getBrand().equals(brand)) {
        i++;
       }
       if (i<n) {
        System.out.println("Van "+ brand);
       } else {
        System.out.println("Nincs "+brand);
       }
    }

    private static void task04(String brand){
        ;
        int i = 0;
        while (!carList.get(i).getBrand().equals(brand)) {
         i++;
        }
         System.out.println("Hányadik helyen: "+ (i+1));
     }

     private static void task05(String brand){
        int n = carList.size();
        int i = 0;
        while (i<n && (!carList.get(i).getBrand().equals(brand))) {
         i++;
        }
        if (i<n) {
         System.out.println("Van "+ brand + ". Indexe: " + i);
        } else {
         System.out.println("Nincs "+ brand);
        }
     }

     private static void task06(String brand){
        ArrayList<Car> brandList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getBrand().equals(brand)) {
                brandList.add(car);
            } 
        }
        kiirLista(brandList);
     }
     private static void kiirLista(ArrayList<Car> list){
        for (Car car : list) {
            System.out.printf("%s, %s, %.2f\n",car.getPlate(),car.getBrand(),car.getPrice());
        }
     }

     private static void task07(){
        System.out.println("--------------\nSzétválogatás:");
        System.out.println();
        ArrayList<Car> expList = new ArrayList<>();
        ArrayList<Car> cheapList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getPrice()> 1100) {
                expList.add(car);
            }else{
                cheapList.add(car);
            }
        }
        System.out.println("Drága autók:");
        kiirLista(expList);
        System.out.println("Olcsó autók:");
        kiirLista(cheapList);
     }
}
