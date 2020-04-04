package factorymethodproject;

//Създаване на клас, който имплементира интерфейс "Building"

public class Hotel implements Building {

	@Override
	public void build() {
		System.out.println("Building a hotel...");

	}

}
