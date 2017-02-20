package spring.builder_pattern;

public class TestBuilderPattern {
	public static void main(String[] args) {
		
		Computer cmp = new Computer.ComputerBuilder("80GB", "2GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
		
		System.out.println(cmp);
		
	}

}
