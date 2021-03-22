package main;

import pruebaExamen.Fecha;

public class Test {

  public static void main(String[] args) {
    
    String date = "20191215";
  
    System.out.println("Date : " + date + "\nDay : " + Fecha.day(date)+
        "\nMonth : " + Fecha.month(date) + "\nYear : " + Fecha.year(date) + "\n");
    
    System.out.println(Fecha.formatDate(date));
    
    System.out.println("In February 2020 there is going to be " + Fecha.daysMonth("20200216") + " days");
    System.out.println("In February 2019 there is going to be " + Fecha.daysMonth("20190216") + " days");
    
    System.out.println(Fecha.formatDate("20200331") + " plus 1 day is " + Fecha.fechaMas1Dia("20200331"));
    System.out.println(Fecha.formatDate("20190301") + " plus 1 day is " + Fecha.fechaMenos1Dia("20190301"));
    
  }

}
