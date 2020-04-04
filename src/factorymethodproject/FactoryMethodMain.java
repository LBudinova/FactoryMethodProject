package factorymethodproject;

//Създаване на Main метод 

public class FactoryMethodMain {
	 public static void main(String[] args) {
		    BuildingFactory buildingFactory = new BuildingFactory();
		    Building hotel = buildingFactory.getBuilding("Hotel");
		    hotel.build();
		    Building museum = buildingFactory.getBuilding("Museum");
		    museum.build();
		    Building church = buildingFactory.getBuilding("Church");
		    church.build();
		    Building shoppingCenter = buildingFactory.getBuilding("Shopping Center");
		    shoppingCenter.build();
		  }
		}
