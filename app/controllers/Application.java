package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void noTemplate() {
        renderText("ok");
    }
    
    public static void minimalTemplate() {
        render();
    }
    
    public static class Data {
        public String s;
        public int v;
    }
    
    private static List<Data> generateList(int count) {
        List<Data> myList = new ArrayList<Data>();
        for ( int i=0; i < count; i++) {
            Data w = new Data();
            w.s = "a string: " + i;
            w.v = i;
            myList.add( w);
        }
        return myList;
    }
    
    public static void normalTemplate() {
        
        Data d = new Data();
        d.s = "s";
        d.v = 1;
        
        List<Data> myList = generateList(10);
        
        render(d, myList);
    }
    
    public static void normalTemplateBigData() {
        
        Data d = new Data();
        d.s = "s";
        d.v = 1;
        
        List<Data> myList = generateList(100);
        
        renderTemplate("application/normalTemplate.html", d, myList);
    }
    
    public static void normalTemplateBigDataInTag() {
        
        Data d = new Data();
        d.s = "s";
        d.v = 1;
        
        List<Data> myList = generateList(100);
        
        render(d, myList);
    }
    
    public static void normalTemplateBigDataWithJavaExtensions() {
        
        Data d = new Data();
        d.s = "s";
        d.v = 1;
        
        List<Data> myList = generateList(100);
        
        render(d, myList);
    }

    public static void normalTemplateBiggerData() {
        
        Data d = new Data();
        d.s = "s";
        d.v = 1;
        
        List<Data> myList = generateList(1000);
        
        renderTemplate("application/normalTemplate.html", d, myList);
    }


}