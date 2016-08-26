package xyz.fadh.praktikumelektronika;

import java.util.ArrayList;

/**
 * Created by fadhl on 8/27/2016.
 */
public class Module {
    public int number;
    public String name;

    public Module(int no, String title){
        this.number = no;
        this.name = title;
    }

    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }

    public static ArrayList<Module> createModuleList(){
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(new Module(1,"Dasar Pengukuran"));
        modules.add(new Module(2,"Simulasi Rangkaian Elektronika"));
        modules.add(new Module(3,"Rangkaian Dioda"));
        modules.add(new Module(4,"Transistor"));
        modules.add(new Module(5,"Filter Pasif"));
        modules.add(new Module(6,"Penguat Daya"));
        modules.add(new Module(7,"Operational Amplifier"));
        modules.add(new Module(8,"Elektronika Digital"));
        modules.add(new Module(9,"Pengenalan CadSoft Eagle"));

        return modules;
    }
}
