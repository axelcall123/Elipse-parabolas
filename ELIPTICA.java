
package eliptica;

import static java.lang.Math.PI;
import java.util.Scanner;

import javax.swing.WindowConstants;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class ELIPTICA {

    public static void main(String[] args) {
     //ELECCION DEL INCISO
     String inciso;
     Scanner ingreso= new Scanner(System.in);
     System.out.println("Ingrese el incioso en a,b,c o d");
     //INGRESO DEL INCISO
     inciso=ingreso.nextLine();
     //EJECUCION DEL PROGRAMA POR INCISOS
     ///////////////////////////////////////////////////////////INCISIO A
     if(inciso.equals("a")||inciso.equals("A")){
        //EXCENTRICIDADES SOLICITADAS
        double [] exentricidad={0.3,0.5,0.6,0.7};
        //NUMERADORES
        double numP=exentricidad[0]*2;
        double numS=exentricidad[1]*2;
        double numT=exentricidad[2]*2;
        double numC=exentricidad[3]*2;
        //BUCLE PARA EL PLOTEO DE PUNTOS
        //GRAFICA EX=0.3
         XYSeries arribaP = new XYSeries(exentricidad[0]);XYSeries abajoP = new XYSeries(".");
          for(int b=0;b<=360;b++){
             double cos= Math.cos(b*PI/180);
             double r=numP/(1+exentricidad[0]*cos);
             double x=r*cos;
             double y=r*java.lang.Math.sin(b*PI/180);
             if(b<=180){
             arribaP.add(x,y);
             }else{
             abajoP.add(x,y);
             }
                                 }
         //GRAFICA EX=0.5 
         XYSeries arribaS = new XYSeries(exentricidad[1]);XYSeries abajoS = new XYSeries("-");
         for(int b=0;b<=360;b++){
             double cos= Math.cos(b*PI/180);
             double r=numS/(1+exentricidad[1]*cos);
             double x=r*cos;
             double y=r*java.lang.Math.sin(b*PI/180);
             if(b<=180){
             arribaS.add(x,y);
             }else{
             abajoS.add(x,y);
             }
                                 }
         //GRAFICA EX=0.6 
         XYSeries arribaT = new XYSeries(exentricidad[2]);XYSeries abajoT = new XYSeries("*");
         for(int b=0;b<=360;b++){
             double cos= Math.cos(b*PI/180);
             double r=numT/(1+exentricidad[2]*cos);
             double x=r*cos;
             double y=r*java.lang.Math.sin(b*PI/180);
             if(b<=180){
             arribaT.add(x,y);
             }else{
             abajoT.add(x,y);
             }
                                 }
         //GRAFICA EX=0.7
         XYSeries arribaC = new XYSeries(exentricidad[3]);XYSeries abajoC = new XYSeries("|");
         for(int b=0;b<=360;b++){
             double cos= Math.cos(b*PI/180);
             double r=numC/(1+exentricidad[3]*cos);
             double x=r*cos;
             double y=r*java.lang.Math.sin(b*PI/180);
             if(b<=180){
             arribaC.add(x,y);
             }else{
             abajoC.add(x,y);
             }
                                 }
         
                          
        //INGRESO PARA PLOTEAR LOS PUNTOS
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(arribaP);dataset.addSeries(abajoP);
        dataset.addSeries(arribaS);dataset.addSeries(abajoS);
        dataset.addSeries(arribaT);dataset.addSeries(abajoT);
        dataset.addSeries(arribaC);dataset.addSeries(abajoC);
        //
        JFreeChart xylineChart = ChartFactory.createScatterPlot( "Grafica","","",dataset);
        XYPlot plot = xylineChart.getXYPlot();
        //EDITAR EL COLOR DE LAS GRAFICAS
         XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.BLACK);renderer.setSeriesStroke(0, new BasicStroke(7.9f));
        renderer.setSeriesPaint(1, Color.BLACK);renderer.setSeriesStroke(1, new BasicStroke(7.9f));
        //
        renderer.setSeriesPaint(2, Color.ORANGE);renderer.setSeriesStroke(2, new BasicStroke(7.9f));
        renderer.setSeriesPaint(3, Color.ORANGE);renderer.setSeriesStroke(3, new BasicStroke(7.9f));
        //
        renderer.setSeriesPaint(4, Color.RED);renderer.setSeriesStroke(4, new BasicStroke(7.9f));
        renderer.setSeriesPaint(5, Color.RED);renderer.setSeriesStroke(5, new BasicStroke(7.9f));
        //
        renderer.setSeriesPaint(6, Color.BLUE);renderer.setSeriesStroke(6, new BasicStroke(7.9f));
        renderer.setSeriesPaint(7, Color.BLUE);renderer.setSeriesStroke(7, new BasicStroke(7.9f));
        //
        plot.setRenderer(renderer);         
        ChartPanel panel = new ChartPanel(xylineChart);
        //CREA LA VENTANA PARA PLOTEAR LAS ELIPSES
        JFrame ventana = new JFrame("Grafica");
        ventana.setVisible(true);
        ventana.setSize(1080, 1080);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel);  
        ventana.setLocationRelativeTo(null);  
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                          }
    //
    ///////////////////////////////////////////////////////////INCISIO B
     else if(inciso.equals("b")||inciso.equals("B")){
     //DIRECTRIZES SOLICITADAS
     int [] directriz={2,4,7};
     //NUMERADORES
     double numP=directriz[0]*0.5;
     double numS=directriz[1]*0.5;
     double numT=directriz[2]*0.5;
    //GRAFICA DIRECTRIZ 2
    XYSeries arribaP = new XYSeries(directriz[0]);XYSeries abajoP = new XYSeries(".");
    for(int b=0;b<=360;b++){
        double cos= Math.cos(b*PI/180);
        double r=numP/(1+0.5*cos);
        double x=r*cos;
        double y=r*java.lang.Math.sin(b*PI/180);
        if(b<=180){
        arribaP.add(x,y);
        }else{
        abajoP.add(x,y);
             }
                            }
    //GRAFICA DIRECTRIZ 4 
    XYSeries arribaS = new XYSeries(directriz[1]);XYSeries abajoS = new XYSeries("-");
    for(int b=0;b<=360;b++){
        double cos= Math.cos(b*PI/180);
        double r=numS/(1+0.5*cos);
        double x=r*cos;
        double y=r*java.lang.Math.sin(b*PI/180);
        if(b<=180){
        arribaS.add(x,y);
        }else{
        abajoS.add(x,y);
        }
                                 }
    //GRAFICA DIRECTRIZ 7 
    XYSeries arribaT = new XYSeries(directriz[2]);XYSeries abajoT = new XYSeries("*");
    for(int b=0;b<=360;b++){
        double cos= Math.cos(b*PI/180);
        double r=numT/(1+0.5*cos);
        double x=r*cos;
        double y=r*java.lang.Math.sin(b*PI/180);
        if(b<=180){
        arribaT.add(x,y);
        }else{
        abajoT.add(x,y);
        }
                                 }
   
    //INGRESO PARA PLOTEAR LOS PUNTOS
    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(arribaP);dataset.addSeries(abajoP);
    dataset.addSeries(arribaS);dataset.addSeries(abajoS);
    dataset.addSeries(arribaT);dataset.addSeries(abajoT);
    //
    JFreeChart xylineChart = ChartFactory.createScatterPlot( "Grafica","","",dataset);
    XYPlot plot = xylineChart.getXYPlot();
    //EDITAR EL COLOR DE LAS GRAFICAS
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer(); 
    renderer.setSeriesPaint(0, Color.BLACK);renderer.setSeriesStroke(0, new BasicStroke(7.9f));
    renderer.setSeriesPaint(1, Color.BLACK);renderer.setSeriesStroke(1, new BasicStroke(7.9f));
    //
    renderer.setSeriesPaint(2, Color.ORANGE);renderer.setSeriesStroke(2, new BasicStroke(7.9f));
    renderer.setSeriesPaint(3, Color.ORANGE);renderer.setSeriesStroke(3, new BasicStroke(7.9f));
    //
    renderer.setSeriesPaint(4, Color.RED);renderer.setSeriesStroke(4, new BasicStroke(7.9f));
    renderer.setSeriesPaint(5, Color.RED);renderer.setSeriesStroke(5, new BasicStroke(7.9f));
    //
    plot.setRenderer(renderer);         
    ChartPanel panel = new ChartPanel(xylineChart);
    //CREA LA VENTANA PARA PLOTEAR LAS ELIPSES
    JFrame ventana = new JFrame("Grafica");
    ventana.setVisible(true);
    ventana.setSize(1080, 1080);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.add(panel);  
    ventana.setLocationRelativeTo(null);  
    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     }
     ///////////////////////////////////////////////////////////INCISIO C
     else if(inciso.equals("c")||inciso.equals("C")){
     int [] directriz={1,3,6};
     //NUMERADORES
     double numP=directriz[0];
     double numS=directriz[1];
     double numT=directriz[2];
    //GRAFICA DIRECTRIZ 1
    XYSeries arribaP = new XYSeries(directriz[0]);XYSeries abajoP = new XYSeries(".");
    for(int b=-173;b<=173;b++){
        double cos= Math.cos(b*PI/180);
        double r=numP/(1+cos);
        double x=r*cos;
        double y=r*java.lang.Math.sin(b*PI/180);
        if(b>=0){
        arribaP.add(x,y);
        }else if(b<=0){
        abajoP.add(x,y);
             }
                            }
    //GRAFICA DIRECTRIZ 3 
    XYSeries arribaS = new XYSeries(directriz[1]);XYSeries abajoS = new XYSeries("-");
    for(int b=-168;b<=168;b++){
        double cos= Math.cos(b*PI/180);
        double r=numS/(1+1*cos);
        double x=r*cos;
        double y=r*java.lang.Math.sin(b*PI/180);
        if(b>=0){
        arribaS.add(x,y);
        }else if(b<=0){
        abajoS.add(x,y);
        }
                                 }
    //GRAFICA DIRECTRIZ 6 
    XYSeries arribaT = new XYSeries(directriz[2]);XYSeries abajoT = new XYSeries("*");
    for(int b=-163;b<=163;b++){
        double cos= Math.cos(b*PI/180);
        double r=numT/(1+1*cos);
        double x=r*cos;
        double y=r*java.lang.Math.sin(b*PI/180);
        if(b>=0){
        arribaT.add(x,y);
        }else if(b<=0){
        abajoT.add(x,y);
        }
                                 }
   
    //INGRESO PARA PLOTEAR LOS PUNTOS
    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(arribaP);dataset.addSeries(abajoP);
    dataset.addSeries(arribaS);dataset.addSeries(abajoS);
    dataset.addSeries(arribaT);dataset.addSeries(abajoT);
    //
    JFreeChart xylineChart = ChartFactory.createScatterPlot( "Grafica","","",dataset);
    XYPlot plot = xylineChart.getXYPlot();
    //EDITAR EL COLOR DE LAS GRAFICAS
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer(); 
    renderer.setSeriesPaint(0, Color.BLACK);renderer.setSeriesStroke(0, new BasicStroke(7.9f));
    renderer.setSeriesPaint(1, Color.BLACK);renderer.setSeriesStroke(1, new BasicStroke(7.9f));
    //
    renderer.setSeriesPaint(2, Color.ORANGE);renderer.setSeriesStroke(2, new BasicStroke(7.9f));
    renderer.setSeriesPaint(3, Color.ORANGE);renderer.setSeriesStroke(3, new BasicStroke(7.9f));
    //
    renderer.setSeriesPaint(4, Color.RED);renderer.setSeriesStroke(4, new BasicStroke(7.9f));
    renderer.setSeriesPaint(5, Color.RED);renderer.setSeriesStroke(5, new BasicStroke(7.9f));
    //
    plot.setRenderer(renderer);         
    ChartPanel panel = new ChartPanel(xylineChart);
    //CREA LA VENTANA PARA PLOTEAR LAS ELIPSES
    JFrame ventana = new JFrame("Grafica");
    ventana.setVisible(true);
    ventana.setSize(1080, 1080);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.add(panel);  
    ventana.setLocationRelativeTo(null);  
    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     }
     else if(inciso.equals("d")||inciso.equals("D")){
    //EXCENTRICIDADES SOLICITADAS
        double [] exentricidad={1.5,2.1,3,6,8};
        //NUMERADORES
        double numP=exentricidad[0]*3;
        double numS=exentricidad[1]*3;
        double numT=exentricidad[2]*3;
        double numC=exentricidad[3]*3;
        //BUCLE PARA EL PLOTEO DE PUNTOS
        //GRAFICA EX=1.5
         XYSeries arribaP = new XYSeries(exentricidad[0]);XYSeries abajoP = new XYSeries(".");
          for(int b=-125;b<=125;b++){
             double cos= Math.cos(b*PI/180);
             double r=numP/(1+exentricidad[0]*cos);
             double x=r*cos;
             double y=r*java.lang.Math.sin(b*PI/180);
             if(b>=0){
             arribaP.add(x,y);
             }else if(b<=0){
             abajoP.add(x,y);
             }
                                 }
         //GRAFICA EX=2.1 
         XYSeries arribaS = new XYSeries(exentricidad[1]);XYSeries abajoS = new XYSeries("-");
         for(int b=-114;b<=114;b++){
             double cos= Math.cos(b*PI/180);
             double r=numS/(1+exentricidad[1]*cos);
             double x=r*cos;
             double y=r*java.lang.Math.sin(b*PI/180);
             if(b>=0){
             arribaS.add(x,y);
             }else if(b<=0){
             abajoS.add(x,y);
             }
                                 }
         //GRAFICA EX=3 
         XYSeries arribaT = new XYSeries(exentricidad[2]);XYSeries abajoT = new XYSeries("*");
         for(int b=-106;b<=106;b++){
             double cos= Math.cos(b*PI/180);
             double r=numT/(1+exentricidad[2]*cos);
             double x=r*cos;
             double y=r*java.lang.Math.sin(b*PI/180);
             if(b>=0){
             arribaT.add(x,y);
             }else if(b<=0){
             abajoT.add(x,y);
             }
                                 }
         //GRAFICA EX=6
         XYSeries arribaC = new XYSeries(exentricidad[3]);XYSeries abajoC = new XYSeries("|");
         for(int b=-98;b<=98;b++){
             double cos= Math.cos(b*PI/180);
             double r=numC/(1+exentricidad[3]*cos);
             double x=r*cos;
             double y=r*java.lang.Math.sin(b*PI/180);
             if(b>=0){
             arribaC.add(x,y);
             }else if(b<=0){
             abajoC.add(x,y);
             }
                                 }               
        //INGRESO PARA PLOTEAR LOS PUNTOS
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(arribaP);dataset.addSeries(abajoP);
        dataset.addSeries(arribaS);dataset.addSeries(abajoS);
        dataset.addSeries(arribaT);dataset.addSeries(abajoT);
        dataset.addSeries(arribaC);dataset.addSeries(abajoC);
        //
        JFreeChart xylineChart = ChartFactory.createScatterPlot( "Grafica","","",dataset);
        XYPlot plot = xylineChart.getXYPlot();
        //EDITAR EL COLOR DE LAS GRAFICAS
         XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.BLACK);renderer.setSeriesStroke(0, new BasicStroke(7.9f));
        renderer.setSeriesPaint(1, Color.BLACK);renderer.setSeriesStroke(1, new BasicStroke(7.9f));
        //
        renderer.setSeriesPaint(2, Color.ORANGE);renderer.setSeriesStroke(2, new BasicStroke(7.9f));
        renderer.setSeriesPaint(3, Color.ORANGE);renderer.setSeriesStroke(3, new BasicStroke(7.9f));
        //
        renderer.setSeriesPaint(4, Color.RED);renderer.setSeriesStroke(4, new BasicStroke(7.9f));
        renderer.setSeriesPaint(5, Color.RED);renderer.setSeriesStroke(5, new BasicStroke(7.9f));
        //
        renderer.setSeriesPaint(6, Color.BLUE);renderer.setSeriesStroke(6, new BasicStroke(7.9f));
        renderer.setSeriesPaint(7, Color.BLUE);renderer.setSeriesStroke(7, new BasicStroke(7.9f));
        //
        plot.setRenderer(renderer);         
        ChartPanel panel = new ChartPanel(xylineChart);
        //CREA LA VENTANA PARA PLOTEAR LAS ELIPSES
        JFrame ventana = new JFrame("Grafica");
        ventana.setVisible(true);
        ventana.setSize(1080, 1080);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel);  
        ventana.setLocationRelativeTo(null);  
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     }
     else if(inciso.equals("e")){
     }
     else{
     System.out.println("No existe este inciso");
     }
                                            }
    
}