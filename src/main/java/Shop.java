import model.Computer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computerList;

    public Shop(List<Computer> computerList) {
        this.computerList = computerList;
    }

    private void buy() {
        while (true) {
            System.out.println("Enter id of computer you want to buy: ");
            try {
                Integer id = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                computerList.remove(id);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException e) {
                System.out.println("Entered symbol isn't a number, try again");
            } catch (IndexOutOfBoundsException e){
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
        while (true) {
            for (int i = 0; i < computerList.size(); i++) {
                System.out.println(i + 1 + ") " + computerList.get(i).getInfo());
            }
            buy();
            if (computerList.size() < 1 || !continuation()) {
                break;
            }
        }
        System.out.println("Thank you for buying our computers!");
    }

    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>(){
            {
                //todo initialize
            }
        };
        Shop shop = new Shop(computers);
        shop.startSelling();
    }

}
