package com.company;

import java.io.*;
import java.util.*;

public class Animals implements Serializable{

    String name;
    String desc;
    String voice;
    String obitanie;
    int age;
    Double weight;

    static Wolf wolf = new Wolf("Белый волк","Имеет белую окраску и любит пингвинов","АгрРРрРРр","обитает в Арктике",5,9.5,
            new String[]{"Краткое описание", "Голос", "Погоня"});
    static Bird parrot = new Bird("Попугай","Интересаня экзотическая птица, некоторые породы умеют разговаривать","чирик-чирик",
            "обитают в джунглях, лесах",5, 0.5, new String[]{"Краткое описание", "Голос", "Летать"});
    static Tiger tiger = new Tiger("Тигр","Тигр является одним из крупнейших наземных хищников, семейство кошачьих, имеет полосатую желто-черную окраску","АРРРРРРР",
            "находится на территории Дальнего Востока России, Ирана, Афганистана, Китая, Индии и стран Юго-Восточной Азии, включая Зондский архипелаг (Индонезийские острова)",7, 60.0, new String[]{"Краткое описание", "Голос", "Охота", "Кошачий голос"});


    public static void main(String[] args) {

        //Функции зоопарка

        System.out.println("Welcome to Зоопарк!!!\nВы видите список животных присутствующих в нашем зоопарке.\n" +
                "Введите номер животного как показано в списке и Вы увидите его краткое описание и методы\n");
        GeneralMenu();

        //Запись и чтение обьектов

        final String fileName ="C:\\Users\\mrhri\\Desktop\\out.bin";
        ArrayList<Animals> anim = new ArrayList<>();
        anim.add(parrot);
        anim.add(tiger);
        anim.add(wolf);
        saveObject(anim,fileName );

        ArrayList read = readObject(fileName);
        for(int i = 0; i < read.size(); i++){
            System.out.println("Прочитан обьект :"+ read.get(i).toString()+"\n");
        }

    }

    public Animals(String n, String d, String v, String o, Integer a, Double w){
        name = n;
        desc = d;
        voice = v;
        obitanie = o;
        age = a;
        weight = w;
    }

    public void Voice(){
        System.out.println(voice);
    }

    /*
     Фиальный метод который нельзя переопределить , то есть при вызове метода Животное может только мяукать.
    **/
    final void catVoice() {
        System.out.println("Мяу-мяу!");
    }

    public void Look(){
        System.out.println("Описание: "+desc+
        "\nИмя: "+name+
        "\nВозраст: "+age+
        "\nВес: "+ weight+" кг");

    }
    public static void GeneralMenu()  {


        // Вывод списка животных
        System.out.println("Список животных: ");
        String[] animals = {wolf.name, parrot.name, tiger.name};
        for(int x = 0; x < animals.length; x++){
            System.out.println(1+x+". "+animals[x]);
        }
        System.out.println("\nВведите номер животного или Exit для выхода: ");

        Scanner in = new Scanner(System.in);
        String b = in.nextLine();

        // Переключатель между списком животных
        switch (b) {
            case "1":
                System.out.println(wolf.name + ". Вы видите список действий которые можно выполнить с этим животным, " +
                        "введите номер из списка что бы выполнить или Return для возврата к списку животных");

                //Вывод списка методов
                System.out.println("Список действий: ");
                String[] m = wolf.methods;
                int a = 1;
                for(int i = 0; i < m.length; i++){
                    System.out.println((i+1)+". "+m[i]);
                    a++;
                }
                System.out.println(a+". Return");
                String d = in.nextLine();
                switch (d) {
                    case "1" :
                        wolf.Look();
                        break;
                    case "2" :
                        wolf.Voice();
                        break;
                    case "3" :
                        wolf.Run();
                        break;
                    case "4" :
                        GeneralMenu();
                        break;
                    case "Return" :
                        GeneralMenu();
                        break;
                    default:
                        GeneralMenu();
                }
                break;
            case "2":
                System.out.println(parrot.name + ". Вы видите список действий которые можно выполнить с этим животным, " +
                        "введите номер из списка что бы выполнить действие или Return для возврата к списку животных");

                //Вывод списка методов
                System.out.println("Список действий: ");
                String[] met = parrot.methods;
                int count = 1;
                for(int i = 0; i < met.length; i++){
                    System.out.println((i+1)+". "+met[i]);
                    count++;
                }
                System.out.println(count + ". Return");
                String w = in.nextLine();
                switch (w) {
                    case "1" :
                        parrot.Look();
                        break;
                    case "2" :
                        parrot.Voice();
                        break;
                    case "3" :
                        parrot.Fly();
                        break;
                    case "4" :
                        GeneralMenu();
                        break;
                    case "Return" :
                        GeneralMenu();
                        break;
                    default:
                        GeneralMenu();
                }
                break;
            case "3" :
                System.out.println(tiger.name + ". Вы видите список действий которые можно выполнить с этим животным, " +
                        "введите номер из списка что бы выполнить действие или Return для возврата к списку животных");

                //Вывод списка методов
                System.out.println("Список действий: ");
                String[] meth = tiger.methods;
                int c = 1;
                for(int i = 0; i < meth.length; i++){
                    System.out.println((i+1)+". "+meth[i]);
                    c++;
                }
                System.out.println(c + ". Return");
                String t = in.nextLine();
                switch (t) {
                    case "1" :
                        tiger.Look();
                        break;
                    case "2" :
                        tiger.Voice();
                        break;
                    case "3" :
                        tiger.Hunting();
                        break;
                    case "4":
                        tiger.catVoice();
                        break;
                    case "5" :
                        GeneralMenu();
                        break;
                    case "Return" :
                        GeneralMenu();
                        break;
                    default:
                        GeneralMenu();
                }
                break;
            case "Exit":
                System.out.println("Мы ради были видеть Вас в нашем зоопарке!");
                break;
            default:
                System.out.println("Введите номер животного правильно");
                GeneralMenu();
        }

    }
    private static void saveObject(ArrayList<Animals> anim, String fileName){
        try(FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutput oos = new ObjectOutputStream(fout)){

            oos.writeObject(anim);
            oos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static ArrayList readObject(String fileName){
        try(FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fin)){
            Object obj = ois.readObject();
            StringBuilder str = new StringBuilder();
            if( obj instanceof ArrayList){
                for(int i = 0; i < ((ArrayList) obj).size(); i++){
                    str.append(((ArrayList) obj).get(i).toString());
                }
                return (ArrayList) obj;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public String toString() {
        return this.name+
                "\nОписание: " + this.desc +
                "\nВозраст: " + this.age+
                "\nВес: "+ this.weight+
                "\nОбитание: "+ this.obitanie;
    }
}
