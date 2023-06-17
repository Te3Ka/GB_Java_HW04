import java.util.*;

public class Seminar04 {
    public static void main(String[] args) {
        ArrayList<String[]> humansList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name = "Noichikhina Ekaterina Vladimirovna 29 w";
        humansList.add(name.split(" "));
        name = "Noichikhin Ilya Vyacheslavovich 33 m";
        humansList.add(name.split(" "));
        name = "Novichikhin Valdemar Ilyich 5 unicorn";
        humansList.add(name.split(" "));
        name = "Noichikhina Teftelka Ilyinichna 4 cat";
        humansList.add(name.split(" "));
        name = "Noichikhin Sokrat Ilyich 3 alpaka";
        humansList.add(name.split(" "));
        name = "Noichikhin Mikha Ilyich 2 rabbit";
        humansList.add(name.split(" "));

        while (true) {
            System.out.println("***********************");
            System.out.println("Choose:");
            System.out.println("1. Create new person.");
            System.out.println("2. Output all persons (not sorted)");
            System.out.println("3. Output all persons (sorted age)");
            System.out.println("4. Output all persons (sorted age and sex)");
            System.out.println("5. Exit programm");
            System.out.print(">>: ");
            String strInput = scanner.nextLine();
            switch (strInput) {
                case "1": {
                    System.out.println("Format: Name Surname Second-name Age Sex");
                    name = scanner.nextLine();
                    humansList.add(name.split(" "));
                    break;
                }
                case "2": {
                    for (String[] person : humansList) {
                        System.out.println("******************************");
                        System.out.println("Name: " + person[0]);
                        System.out.println("Surname: " + person[1]);
                        System.out.println("Second-name: " + person[2]);
                        System.out.println("Age: " + person[3]);
                        System.out.println("Sex: " + person[4]);
                    }
                    break;
                }
                case "3": {
                    ArrayList<String[]> humansListSorted = new ArrayList<>(humansList);
                    humansListSorted.sort(new Comparator<String[]>() {
                        @Override
                        public int compare(String[] o1, String[] o2) {
                            return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
                        }
                    });
                    for (String[] person : humansListSorted) {
                        System.out.println("******************************");
                        System.out.println("Name: " + person[0]);
                        System.out.println("Surname: " + person[1]);
                        System.out.println("Second-name: " + person[2]);
                        System.out.println("Age: " + person[3]);
                        System.out.println("Sex: " + person[4]);
                    }
                    break;
                }
                case "4": {
                    break;
                }
                case "5": {
                    return;
                }
            }
        }
    }
}
