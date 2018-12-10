package edu.bootcamp.topic_0.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConectionsBulider conBuilder= new ConectionsBulider();
		Connections commertials=conBuilder.prepareCommertials();
		Connections nonComertials=conBuilder.prepareOpensource();
		commertials.showItems();
		nonComertials.showItems();
	}

}
