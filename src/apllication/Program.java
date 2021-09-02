package apllication;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import entities.ImportProduct;
import entities.Product;
import entities.UsedProduct;


public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc =new Scanner(System.in);
		
		List<Product> prod= new ArrayList<>();
		SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("enter the numbers of products: ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n;i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("common , used or imported(c/u/i)");
			char ch = sc.next().charAt(0);
			System.out.print("name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("price: ");
			double price = sc.nextDouble();
			
			if(ch == 'c') {
				prod.add(new Product(name, price));
			}
			else if(ch == 'u') {
				System.out.print("manufacture date (DD/MM/YYYY)");
				Date date = sdf.parse(sc.next());
				prod.add(new UsedProduct(name,price,date));
				
			}
			else {
				System.out.print("customs fee: ");
				double custFee = sc.nextDouble();
			    prod.add(new ImportProduct(name, price, custFee));
			}
			
			System.out.println();
			System.out.println("PRICE TAGS: ");
			for(Product produc : prod) {
				System.out.println(produc.priceTag());
			}
		}

		sc.close();
	}

}
