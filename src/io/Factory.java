package io;

import model.*;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import javax.print.Doc;
import java.util.List;

/**
 * a factory to read in xml files
 * @author Tetrahedran
 * @version 0.1
 */
public class Factory {
    public static final String ARMOR_FILE = "files/armor.xml";
    public static final String FIGHTER_FILE = "files/fighters.xml";
    public static final String MERCHANT_FILE = "files/merchants.xml";
    public static final String MISSION_FILE = "files/missions.xml";
    public static final String STUFF_FILE = "filed/stuff.xml";
    public static final String TALKER_FILE = "files/talkers.xml";
    public static final String WEAPON_FILE = "files/weapons.xml";

    private Factory(){
    }

    public static void create(){
        createArmor();
        createFighters();
        createMerchants();
        createMissions();
        createStuff();
        createTalkers();
        createWeapons();
    }

    private static void createWeapons() {
        try{
            Document theDoc = new SAXBuilder().build(WEAPON_FILE);
            Element root = theDoc.getRootElement();
            List<Element> allWeapons = root.getChildren("weapon");
            for(Element weapon : allWeapons){
                String type = weapon.getChildText("type");
                String name = weapon.getChildText("name");
                double price = Double.parseDouble(weapon.getChildText("price"));
                double weight = Double.parseDouble(weapon.getChildText("weight"));
                String damage = weapon.getChildText("damage");
                String range = weapon.getChildText("range");
                new Weapon(name, weight, price, damage);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void createTalkers() {
        try{
            Document theDoc = new SAXBuilder().build(TALKER_FILE);
            Element root = theDoc.getRootElement();
            List<Element> allTalkers = root.getChildren("talker");
            for(Element talker : allTalkers){
                String name = talker.getChildText("name");
                int age = Integer.parseInt(talker.getChildText("age"));
                String text = talker.getChildText("text");
                new Talker(name, age);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void createStuff() {
        try{
            Document theDoc = new SAXBuilder().build(STUFF_FILE);
            Element root = theDoc.getRootElement();
            List<Element> allStuff = root.getChildren("object");
            for(Element stuff : allStuff){
                String name = stuff.getChildText("name");
                Double price = Double.parseDouble(stuff.getChildText("price"));
                Double weight = Double.parseDouble(stuff.getChildText("weight"));
                new InventoryObject(name, weight, price);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void createMissions() {
        try{
            Document theDoc = new SAXBuilder().build(MISSION_FILE);
            Element root = theDoc.getRootElement();
            List<Element> allMissions = root.getChildren("mission");
            for(Element mission : allMissions){
                String missionType = mission.getChildText("mission_type");
                String header = mission.getChildText("head");
                String description = mission.getChildText("description");
                String reward = mission.getChildText("reward");
                //new Mission();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void createMerchants() {
        try{
            Document theDoc = new SAXBuilder().build(MERCHANT_FILE);
            Element root = theDoc.getRootElement();
            List<Element> allMerchants = root.getChildren("merchant");
            for(Element merchant : allMerchants){
                String name = merchant.getChildText("name");
                int age = Integer.parseInt(merchant.getChildText("age"));
                new Merchant(name, age);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void createFighters() {
        try{
            Document theDoc = new SAXBuilder().build(FIGHTER_FILE);
            Element root = theDoc.getRootElement();
            List<Element> allFighters = root.getChildren("fighter");
            for(Element fighter : allFighters){
                String type = fighter.getChildText("type");
                String name = fighter.getChildText("name");
                int age = Integer.parseInt(fighter.getChildText("age"));
                if(type.equals(Archer.class.getSimpleName())){
                    new Archer(name, age);
                }
                else if(type.equals(Magician.class.getSimpleName())){
                    new Magician(name, age);
                }
                else if(type.equals(Priest.class.getSimpleName())){
                    new Priest(name, age);
                }
                else if(type.equals(Thief.class.getSimpleName())){
                    new Thief(name, age);
                }
                else if(type.equals(Warrior.class.getSimpleName())){
                    new Warrior(name, age);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void createArmor() {
        try{
            Document theDoc = new SAXBuilder().build(ARMOR_FILE);
            Element root = theDoc.getRootElement();
            List<Element> allArmor = root.getChildren("armor");
            for(Element armor : allArmor){
                String name = armor.getChildText("name");
                double price = Double.parseDouble(armor.getChildText("price"));
                double weight = Double.parseDouble(armor.getChildText("weight"));
                double protection = Double.parseDouble(armor.getChildText("protection"));
                double slow = Double.parseDouble(armor.getChildText("slow"));
                new Armor(name, weight, price, protection, slow);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
