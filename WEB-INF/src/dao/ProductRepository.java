package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
    private static ProductRepository instance = new ProductRepository();
    
    public static ProductRepository getInstance(){
        return instance;
    }
	public ProductRepository() {
		Product phone = new Product("P1234", "iPhone 6s", 800000);
		phone.setDescription("4.7-inch, 1334X750 Renina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
        phone.setFilename("P1234.jpg");
        
        Product notebook = new Product("P1235", "LG PC 그램", 1500000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core processors");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
        notebook.setFilename("P1235.jpg");
        
        Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
		tablet.setDescription("212.8*125.6*6.6mm,  Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
        tablet.setFilename("P1236.jpg");
        
        Product TV = new Product("P1237", "UHD 189 cm", 1400000);
        TV.setDescription("189 cm, Crystal Processor 4K, HDR");
		TV.setCategory("TV");
		TV.setManufacturer("Samsung");
		TV.setUnitsInStock(1000);
		TV.setCondition("New");
        TV.setFilename("P1237.jpg");
        
        Product headset = new Product("P1238", "YH G01", 200000);
        headset.setDescription("27mm, 20Hz ~ 20kHz, electronic training");
		headset.setCategory("Headset");
		headset.setManufacturer("YAMAHA");
		headset.setUnitsInStock(1000);
		headset.setCondition("New");
        headset.setFilename("P1238.jpg");
        
        Product mouse = new Product("P1239", "G502 X", 100000);
        mouse.setDescription("131.4mm x 41.1mm x 79.2mm");
		mouse.setCategory("Mouse");
		mouse.setManufacturer("Logitech");
		mouse.setUnitsInStock(1000);
		mouse.setCondition("New");
        mouse.setFilename("P1239.jpg");
        
        Product keyboard = new Product("P1240", "VALKAN gaming keyboard", 70000);
        keyboard.setDescription("138mm x 448mm x 39mm");
		keyboard.setCategory("Keyboard");
		keyboard.setManufacturer("TNS INTERNATIONAL");
		keyboard.setUnitsInStock(1000);
		keyboard.setCondition("New");
        keyboard.setFilename("P1240.jpg");
        
        Product GPU = new Product("P1241", "MSI GEFORCE GTX 1660 SUPER", 300000);
        GPU.setDescription("6GB, Express x 63.0, DisplayPort x 3(v1.4)/HDMI 2.0b x1");
		GPU.setCategory("GPU");
		GPU.setManufacturer("MSI");
		GPU.setUnitsInStock(1000);
		GPU.setCondition("New");
        GPU.setFilename("P1241.jpg");
        
        Product monitor = new Product("P1242", "24MK430H", 200000);
        monitor.setDescription("24inch");
		monitor.setCategory("Monitor");
		monitor.setManufacturer("LG");
		monitor.setUnitsInStock(1000);
		monitor.setCondition("New");
        monitor.setFilename("P1242.jpg");
		// 위와 같이 상품 초기화 하고 아래에 상품을 추가

		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
        listOfProducts.add(TV);
        listOfProducts.add(headset);
        listOfProducts.add(mouse);
        listOfProducts.add(keyboard);
        listOfProducts.add(GPU);
        listOfProducts.add(monitor);
		// listOfProducts.add(상품명);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
    public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
    public void addProduct(Product product){
        listOfProducts.add(product);
    }

}

