package java8.practice.entities;

public class Car {

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + ", carCompany=" + carCompany + ", carPrice=" + carPrice + "]";
	}
	private String carModel;
	private String carCompany;
	private int carPrice;
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarCompany() {
		return carCompany;
	}
	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}
	public Car(String carModel, String carCompany, int carPrice) {
		super();
		this.carModel = carModel;
		this.carCompany = carCompany;
		this.carPrice = carPrice;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
}
