import java.util.ArrayList;

// магазин (обладает работниками)
public class Store {
    public Store(ArrayList<Employee> arrOfEmployee) {
        this.arrOfEmployee = arrOfEmployee;
    }

    public ArrayList<Employee> getArrOfEmployee() {
        return arrOfEmployee;
    }

    public void setArrOfEmployee(ArrayList<Employee> arrOfEmployee) {
        this.arrOfEmployee = arrOfEmployee;
    }

    private ArrayList<Employee> arrOfEmployee;//потому что в задании нет информации о том сколько работников
}
