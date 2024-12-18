import java.util.*;
import java.util.stream.Collectors;
import java.sql.Date;

class Medicine {
    int medicineID;
    String medicineName;
    String medicineType;
    String dosage;
    String manufacturer;
    Date expiryDate;
    double price;
    int stockQuantity;
    String description;

    public Medicine(int medicineID, String medicineName, String medicineType, String dosage, String manufacturer, Date expiryDate, double price, int stockQuantity, String description) {
        this.medicineID = medicineID;
        this.medicineName = medicineName;
        this.medicineType = medicineType;
        this.dosage = dosage;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.description = description;
    }

    @Override
    public String toString() {
        return "MedicineID: " + medicineID + ", Name: " + medicineName + ", Type: " + medicineType + ", Dosage: " + dosage + ", Manufacturer: " + manufacturer + ", Expiry: " + expiryDate + ", Price: $" + price + ", Stock: " + stockQuantity + ", Description: " + description;
    }
}

public class MedicineApp {
    static List<Medicine> medicines = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n MEDICINE MENU");
            System.out.println("------------------------------");
            System.out.println("1. Add Medicine");
            System.out.println("2. View All Medicines");
            System.out.println("3. Search Medicine by Name");
            System.out.println("4. Filter Expired Medicines");
            System.out.println("5. Update Medicine");
            System.out.println("6. Delete Medicine");
            System.out.println("0. Exit");
            System.out.print("Please select an option: ");
            option = in.nextInt();
            in.nextLine();

            switch (option) {
                case 1 -> addMedicine(in);
                case 2 -> viewAllMedicines();
                case 3 -> searchMedicineByName(in);
                case 4 -> filterExpiredMedicines();
                case 5 -> updateMedicine(in);
                case 6 -> deleteMedicine(in);
                case 0 -> System.out.println("Thank you for using the Medicine Inventory App.");
                default -> System.out.println("Invalid Option! Try again.");
            }
        } while (option != 0);
    }

    static void addMedicine(Scanner in) {
        System.out.println("\nEnter Medicine Details:");
        System.out.print("ID: ");
        int id = in.nextInt();
        in.nextLine();
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Type: ");
        String type = in.nextLine();
        System.out.print("Dosage: ");
        String dosage = in.nextLine();
        System.out.print("Manufacturer: ");
        String manufacturer = in.nextLine();
        
        System.out.print("Expiry Date (yyyy-mm-dd): ");
        Date expiryDate = parseDate(in);
        
        System.out.print("Price: ");
        double price = in.nextDouble();
        System.out.print("Stock Quantity: ");
        int stock = in.nextInt();
        in.nextLine();
        System.out.print("Description: ");
        String description = in.nextLine();

        medicines.add(new Medicine(id, name, type, dosage, manufacturer, expiryDate, price, stock, description));
        System.out.println("Medicine added successfully!");
    }

    private static Date parseDate(Scanner in) {
    	while (true) {
            try {
                System.out.print("Expiry Date (yyyy-MM-dd): ");
                String dateInput = in.nextLine().trim();
                return Date.valueOf(dateInput);  // Validates date format
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
            
		return null;
	}
    	}
    }

	static void viewAllMedicines() {
        System.out.println("\nAll Medicines:");
        if (medicines.isEmpty()) {
            System.out.println("No medicines available.");
        } else {
            medicines.forEach(System.out::println);
        }
    }

    static void searchMedicineByName(Scanner in) {
        System.out.print("\nEnter Medicine Name to Search: ");
        String name = in.nextLine();
        List<Medicine> results = medicines.stream()
                .filter(m -> m.medicineName.equalsIgnoreCase(name))
                .collect(Collectors.toList());

        if (results.isEmpty()) {
            System.out.println("No medicines found with the name " + name);
        } else {
            results.forEach(System.out::println);
        }
    }

    static void filterExpiredMedicines() {
        Date today = new Date(System.currentTimeMillis());
        System.out.println("\nExpired Medicines:");
        List<Medicine> expired = medicines.stream()
                .filter(m -> m.expiryDate.before(today))
                .collect(Collectors.toList());

        if (expired.isEmpty()) {
            System.out.println("No expired medicines found.");
        } else {
            expired.forEach(System.out::println);
        }
    }

    static void updateMedicine(Scanner in) {
        System.out.print("\nEnter Medicine ID to Update: ");
        int id = in.nextInt();
        in.nextLine();
        Medicine medicine = medicines.stream().filter(m -> m.medicineID == id).findFirst().orElse(null);

        if (medicine == null) {
            System.out.println("Medicine not found.");
            return;
        }

        System.out.print("New Name: ");
        medicine.medicineName = in.nextLine();
        System.out.print("New Type: ");
        medicine.medicineType = in.nextLine();
        System.out.print("New Dosage: ");
        medicine.dosage = in.nextLine();
        System.out.print("New Manufacturer: ");
        medicine.manufacturer = in.nextLine();
        //System.out.print("New Expiry Date (yyyy-mm-dd): ");
        //medicine.expiryDate = Date.valueOf(in.nextLine());
        System.out.print("New Price: ");
        medicine.price = in.nextDouble();
        System.out.print("New Stock Quantity: ");
        medicine.stockQuantity = in.nextInt();
        in.nextLine();
        System.out.print("New Description: ");
        medicine.description = in.nextLine();
        System.out.println("Medicine updated successfully!");
    }

    static void deleteMedicine(Scanner in) {
        System.out.print("\nEnter Medicine ID to Delete: ");
        int id = in.nextInt();
        in.nextLine();
        boolean removed = medicines.removeIf(m -> m.medicineID == id);
        if (removed) {
            System.out.println("Medicine deleted successfully!");
        } else {
            System.out.println("Medicine not found.");
        }
    }
}
