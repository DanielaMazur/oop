package com.oop.lab1.monitor;

public class Main {

    public static void main(String[] args) {
        Monitor firstMonitor = new Monitor("red", "1440\t×\t960", 1200, 600);

        firstMonitor.printMonitorProperties();


        firstMonitor.setColor("green");
        firstMonitor.setHeight(700);
        firstMonitor.setWidth(1600);
        firstMonitor.setResolution("1920\tx\t1080");


        System.out.println("\nUpdated properties: ");
        firstMonitor.printMonitorProperties();

        Monitor secondMonitor = new Monitor("yellow", "720\t×\t480", 900, 600);

        compareMonitors("color", firstMonitor, secondMonitor);
    }

    public static void compareMonitors(String parameter, Monitor firstMonitor, Monitor secondMonitor){
        switch (parameter){
            case "color":
                if(firstMonitor.color.equals(secondMonitor.color)){
                    System.out.println("Monitors are of the same color");
                }else{
                    System.out.println("Monitors are of different colors");
                }
                break;

            case "width":
                if(firstMonitor.width == secondMonitor.width){
                    System.out.println("Monitors are of the same width");
                }else {
                    if(firstMonitor.width > secondMonitor.width){
                        System.out.println("First monitor is wider");
                    }else{
                        System.out.println("Second monitor is wider");
                    }
                }
                break;

            case "height":
                if(firstMonitor.height == secondMonitor.height){
                    System.out.println("Monitors are of the same height");
                }else {
                    if(firstMonitor.height > secondMonitor.height){
                        System.out.println("First monitor is higher");
                    }else{
                        System.out.println("Second monitor is higher");
                    }
                }
                break;

            case "resolution":
                if(firstMonitor.resolution.equals(secondMonitor.resolution)){
                    System.out.println("Monitors have the same resolution");
                }else{
                    System.out.println("Monitors have different resolution");
                }
                break;

            default:
                System.out.println("Monitor class doesn't have such property");
                break;
        }
    }
}

