import java.util.ArrayList;

// Бренд (обладает массивом магазинов)
public class Brand {
    public Brand(ArrayList<Store> listOfStore) {
        this.listOfStore = listOfStore;
    }

    public ArrayList<Store> getListOfStore() {
        return listOfStore;
    }

    public void setListOfStore(ArrayList<Store> listOfStore) {
        this.listOfStore = listOfStore;
    }

    private ArrayList<Store> listOfStore; //опять же вдруг бренд откроет новый магазин, с массивом будут проблемы
}
