import model.Computer;
import model.impl.Laptop;
import model.impl.PersonalComputer;
import property.impl.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Computer> computerList;

    public Shop(List<Computer> computerList) {
        if (computerList.size() < 1) {
            throw new IllegalArgumentException("Empty data");
        }
        this.computerList = computerList;
    }

    private void buy() {
        while (true) {
            System.out.println("Enter id of computer you want to buy: ");
            try {
                int id = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                computerList.remove(id - 1);
                break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException e) {
                System.out.println("Entered symbol isn't a number, try again");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("No computer with such id, try again");
            }
        }
    }

    private boolean continuation() {
        while (true) {
            System.out.println("Continue buying computers? (y/n)");
            try {
                String answer = new BufferedReader(new InputStreamReader(System.in)).readLine();
                switch (answer) {
                    case "y":
                        return true;
                    case "n":
                        return false;
                    default:
                        System.out.println("Cannot recognize entered symbol, try again");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void startSelling() {
        do {
            for (int i = 0; i < computerList.size(); i++) {
                System.out.println(i + 1 + ") " + computerList.get(i).getInfo());
            }
            buy();
        } while (computerList.size() >= 1 && continuation());
        System.out.println("Thank you for buying our computers!");
    }

    public static void main(String[] args) {
        Processor i5Processor = new Processor("Intel i5", BigDecimal.valueOf(250.50),
                BigDecimal.valueOf(4.4), 8);
        Processor i7Processor = new Processor("Intel i7", BigDecimal.valueOf(352.99),
                BigDecimal.valueOf(5), 12);
        VideoCard geForceRTX3060 = new VideoCard("GeForce RTX 3060", BigDecimal.valueOf(550.99),
                1807, 12);
        VideoCard geForceGTX1060 = new VideoCard("GeForce GTX 1060", BigDecimal.valueOf(200),
                1607, 3);
        Screen fullHDScreen60FPS = new Screen("Full HD Screen", BigDecimal.valueOf(100)
                , BigDecimal.valueOf(15.6), 60);
        Screen fullHDScreen144FPS = new Screen("Full HD Screen", BigDecimal.valueOf(180)
                , BigDecimal.valueOf(16.2), 144);
        Battery cheapBattery = new Battery("48 W*h Battery", BigDecimal.valueOf(120), 48);
        Battery expensiveBattery = new Battery("75 W*h Battery", BigDecimal.valueOf(200), 75);
        PowerUnit cheapPowerUnit = new PowerUnit("500W Power Unit", BigDecimal.valueOf(80), 500);
        PowerUnit expensivePowerUnit = new PowerUnit("650W Power Unit", BigDecimal.valueOf(120), 650);

        List<Computer> computers = new ArrayList<>() {
            {
                add(new PersonalComputer("Office PC", i5Processor, geForceGTX1060, cheapPowerUnit));
                add(new Laptop("Office laptop", i5Processor, geForceGTX1060, cheapBattery, fullHDScreen60FPS));
                add(new PersonalComputer("Gaming PC", i7Processor, geForceRTX3060, expensivePowerUnit));
                add(new Laptop("Gaming laptop", i7Processor, geForceRTX3060, expensiveBattery, fullHDScreen144FPS));
            }
        };

        Shop shop = new Shop(computers);
        shop.startSelling();
    }

}
