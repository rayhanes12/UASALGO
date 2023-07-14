import java.util.Arrays;

class InventoryItem {
    private String nama;
    private int quantity;

    public InventoryItem(String nama, int quantity) {
        this.nama = nama;
        this.quantity = quantity;
    }

    public String getName() {
        return nama;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Quantity: " + quantity;
    }
}

class Inventory {
    private InventoryItem[] items;

    public Inventory(InventoryItem[] items) {
        this.items = items;
    }

    public void displayInventory() {
        for (InventoryItem item : items) {
            System.out.println(item);
        }
    }

    public void sortByName() {
        int n = items.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                }
            }
        }
    

    private void swap(int i, int j) {
        InventoryItem temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    public void searchByName(String searchTerm) {
        System.out.println("Mencari hasil dari\"" + searchTerm + "\":");
        for (InventoryItem item : items) {
            if (item.getName().equalsIgnoreCase(searchTerm)) {
                System.out.println(item);
            }
        }
    }
}

public class UASALGO{
    public static void main(String[] args) {
        InventoryItem item1 = new InventoryItem("Pulpen", 25);
        InventoryItem item2 = new InventoryItem("Buku", 30);
        InventoryItem item3 = new InventoryItem("Pensil", 33);
        InventoryItem item4 = new InventoryItem("Penghapus", 48);

        InventoryItem[] items = {item1, item2, item3, item4};

        Inventory inventory = new Inventory(items);

        System.out.println("Inventory sebelum disorting:");
        inventory.displayInventory();

        System.out.println("\nInventory setelah disorting dengan nama:");
        inventory.sortByName();
        inventory.displayInventory();

        String searchTerm = "Buku";
        System.out.println("\nSearching for \"" + searchTerm + "\" in inventory:");
        inventory.searchByName(searchTerm);
    }
}

