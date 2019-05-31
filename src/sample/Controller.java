package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    @FXML
    private ListView todolistview;
    @FXML
    private TextArea textfield;
   private ArrayList<ToDoItem> list=new ArrayList<ToDoItem>();

    public void initialize() {
        ToDoItem item1 = new ToDoItem("Mail Card to Birthday", "Brothers Bday", LocalDate.of(2019, Month.JUNE, 25));
        ToDoItem item2 = new ToDoItem("Go to store", "Buy Grocery", LocalDate.of(2019, Month.MAY, 31));
        ToDoItem item3 = new ToDoItem("Go to Cinema", "Buy Star war tickets", LocalDate.of(2019, Month.JUNE, 25));
        ToDoItem item4 = new ToDoItem("Mail Card to Brother", "Brothers day", LocalDate.of(2019, Month.JULY, 29));


        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);


     todolistview.getItems().setAll(list);






    }
    public void showtext(){
 ToDoItem item=(ToDoItem) todolistview.getSelectionModel().getSelectedItem();
      //  System.out.println(item);
        StringBuilder sb=new StringBuilder();
        sb.append(item.getDetails());
        sb.append("\n\n\n");
        sb.append("Due:");
        sb.append(item.getDate().toString());
        textfield.setText(sb.toString());










    }


}
