package edu.bootcamp.topic_0.builder;

import java.util.ArrayList;
import java.util.List;

public class Connections {

	   private List<DBConnection> items = new ArrayList<DBConnection>();
	   

	   public void addItem(DBConnection item){
		      items.add(item);
		   }
	   
	   public float getCost(){
		      float cost = 0.0f;
		      
		      for (DBConnection item : items) {
		         cost += item.price();
		      }		
		      return cost;
		   }

	   public void showItems(){
		   
		      for (DBConnection item : items) {
		         System.out.print("Item : " + item.name());
		         System.out.println(", Price : " + item.price());
		      }		
		   }	
}

