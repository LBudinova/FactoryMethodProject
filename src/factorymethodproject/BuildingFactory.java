package factorymethodproject;

/*Създаване на клас "BuildingFactory", чрез който
 взимаме информация от класовете, които имплементират интерфеса*/
 
public class BuildingFactory {
 public Building getBuilding(String type) {
	 
	 if (type != null) {
	      if ("HOTEL".equalsIgnoreCase(type)) {
	        return new Hotel();
	      }
	      if ("MUSEUM".equalsIgnoreCase(type)) {
	        return new Museum();
	      }
	      if ("CHURCH".equalsIgnoreCase(type)) {
	        return new Church();
	      }
	      if ("SHOPPING CENTER".equalsIgnoreCase(type)) {
		        return new ShoppingCenter();
	      }
	    }
	    return null;
 }
 }


