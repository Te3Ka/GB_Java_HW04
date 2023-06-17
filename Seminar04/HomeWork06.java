import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HomeWork06 {
    public static void author() {
        System.out.println("//**********************************\\\\");
        System.out.println("//*********  Created by:  **********\\\\");
        System.out.println("//* Ilya \"Te3Ka_PaynE\" Novichikhin *\\\\");
        System.out.println("//***** 79811131773@yandex.ru ******\\\\");
        System.out.println("//**********************************\\\\");

    }

    public static void main(String[] args) {
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> secondName = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> sex = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        //Testing
        /*
        surname.add("Novichikhin");
        surname.add("Agafonova");
        surname.add("Novichikhina");
        surname.add("Khristinich");
        surname.add("Shabanov");
        surname.add("Sukhov");

        name.add("Ilya");
        name.add("Ekaterina");
        name.add("Inessa");
        name.add("Nina");
        name.add("Ilya");
        name.add("Aleksander");

        secondName.add("Vycheslavovich");
        secondName.add("Vladimirovna");
        secondName.add("Vyacheslavovna");
        secondName.add("Olegovna");
        secondName.add("Vladimirovich");
        secondName.add("Ivanovich");

        age.add(33);
        age.add(29);
        age.add(27);
        age.add(26);
        age.add(31);
        age.add(23);

        sex.add("M");
        sex.add("W");
        sex.add("W");
        sex.add("W");
        sex.add("M");
        sex.add("M");

        id.add(id.size());
        id.add(id.size());
        id.add(id.size());
        id.add(id.size());
        id.add(id.size());
        id.add(id.size());
*/

        while (true) {
            System.out.println("***********************");
            System.out.println("Choose:");
            System.out.println("1. Create new person.");
            System.out.println("2. Output all persons (not sorted)");
            System.out.println("3. Output all persons (sorted age)");
            System.out.println("4. Output all persons (sorted age and sex)");
            System.out.println("5. Exit the program");
            System.out.print(">>: ");
            String strInput = scan.nextLine();
            switch (strInput) {
                case "1": {
                    System.out.print("Enter surname: ");
                    surname.add(scan.nextLine());
                    System.out.print("Enter name: ");
                    name.add(scan.nextLine());
                    System.out.print("Enter second-name: ");
                    secondName.add(scan.nextLine());
                    System.out.print("Enter age: ");
                    age.add(Integer.parseInt(scan.nextLine()));
                    System.out.print("Enter sex: ");
                    sex.add(scan.nextLine());
                    id.add(id.size());
                    break;
                }
                case "2": {
                    for (int i : id) {
                        System.out.println("******************************");
                        System.out.println("Surname: " + surname.get(i));
                        System.out.println("Name: " + name.get(i));
                        System.out.println("Second-name: " + secondName.get(i));
                        System.out.println("Age: " + age.get(i));
                        System.out.println("Sex: " + sex.get(i));
                    }
                    break;
                }
                case "3": {
                    ArrayList<Integer> idSort = new ArrayList<>(id);
                    idSort.sort(new Comparator<Integer>() {
                        @Override
                        public int compare(Integer o1, Integer o2) {
                            return age.get(o1) - age.get(o2);
                        }
                    });
                    
                    for (int i : idSort) {
                        System.out.println("******************************");
                        System.out.println("Surname: " + surname.get(i));
                        System.out.println("Name: " + name.get(i));
                        System.out.println("Second-name: " + secondName.get(i));
                        System.out.println("Age: " + age.get(i));
                        System.out.println("Sex: " + sex.get(i));
                    }
                    break;
                }
                case "4": {
                    ArrayList<Integer> idSortAgeSex = new ArrayList<>(id);
                    idSortAgeSex.sort(new Comparator<Integer>() {
                        @Override
                        public int compare(Integer o1, Integer o2) {
                            return age.get(o1) - age.get(o2);
                        }
                    });

                    ArrayList<Integer> idMan = new ArrayList<>();
                    ArrayList<Integer> idWoman = new ArrayList<>();
                    for (int i : idSortAgeSex) {
                        if (sex.get(i).equals("M"))
                            idMan.add(i);
                        else
                            idWoman.add(i);
                    }
                    idSortAgeSex = new ArrayList<>();
                    idSortAgeSex.addAll(idWoman);
                    idSortAgeSex.addAll(idMan);

                    for (int i : idSortAgeSex) {
                        System.out.println("******************************");
                        System.out.println("Surname: " + surname.get(i));
                        System.out.println("Name: " + name.get(i));
                        System.out.println("Second-name: " + secondName.get(i));
                        System.out.println("Age: " + age.get(i));
                        System.out.println("Sex: " + sex.get(i));
                    }
                    break;
                }
                case "5": {
                    System.out.println("Exit program.");
                    author();
                    return;
                }
            }
        }
    }
}