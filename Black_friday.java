

package com.mycompany.black_friday;


public class Black_friday {

    public static void main(String[] args) {
        System.out.println("bienvenido al back Friday");
        System.out.println("escoje precio normal");
        System.out.println("o esocje pre black friday--30% mas caro");
        System.out.println("o esocje en el mismo balck firday--40% off");
        int opcion = 0;
        String[][] productos = null;
        switch(opcion){
            case 1 :
            case 2: {
                for (int i=0;i<3;i++){
                    
                    System.out.println("ID:" + productos[i][0]);
                    System.out.println("Nombre:" + productos[i][1]);
                    System.out.println("Precio:" + double.parseDouble(productos[i][0]));
                      
                }
                }
            case 3: {
                for (int i=0;i<3,i++){
                    System.out.println("ID: " + productos[i][0]);
                    System.out.println("Nombre: " + productos[i][1] );
                }
            }
            
        }
    }
}
