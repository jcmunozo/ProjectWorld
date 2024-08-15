/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoworld;

import java.util.ArrayList;
import java.util.List;

import Modelo.ClsPais;

/**
 *
 * @author Camilo
 */
public class ProyectoWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	List<ClsPais> paises = new ArrayList<>();
    	ClsPais colombia = new ClsPais("1", "Colombia", "America", "Español", "peso colombiano", "url_to_image", "Bogota", 50_000_000);
    	ClsPais francia = new ClsPais("2", "Francia", "europa", "frances", "euro", "url_to_image", "Paris", 68_401_997);
    	ClsPais ecuador = new ClsPais("3", "Ecuador", "America", "Español", "dolar", "url_to_image", "Quito", 17_483_326);
    	ClsPais venezuela = new ClsPais("4", "Venezuela", "America", "Español", "bolivar", "url_to_image", "Caracas", 30_518_260);
    	ClsPais canada = new ClsPais("5", "Canada", "America", "Frances/Ingles", "dolar canadiense", "url_to_image", "Ottawa", 41_012_563);
    	ClsPais inglaterra = new ClsPais("6", "Inglaterra", "Europa", "Ingles", "libra esterlina", "url_to_image", "Londres", 67_596_281);
    	ClsPais noruega = new ClsPais("7", "Noruega", "Europa", "Noruego", "corona noruega", "url_to_image", "Oslo", 5_550_203);
    	paises.add(colombia);
    	paises.add(francia);
    	paises.add(ecuador);
    	paises.add(venezuela);
    	paises.add(canada);
    	paises.add(inglaterra);
    	paises.add(noruega);
    	paises.stream().forEach(pais -> System.out.println(pais.getFullInfo()));  	
    }
    
}
