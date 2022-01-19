module com.example.book06chapter06choosingfromalist {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.book06chapter06choosingfromalist to javafx.fxml;
  exports com.example.book06chapter06choosingfromalist;
}