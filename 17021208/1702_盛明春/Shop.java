package shop;

public class Shop {
	private String id;// ���
	private String name;// ����
	private double price;// �۸�
	private int number;// ����
	public Shop(String id, String name, double price, int number) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", price=" + price
				+ ", number=" + number + "]";
	}

}
