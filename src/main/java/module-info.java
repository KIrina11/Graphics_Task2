module com.example.task2_num1_cg {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires javafx.graphics;

    opens ru.vsu.cs.kislova_i_v.task2_num1_cg to javafx.fxml;
    exports ru.vsu.cs.kislova_i_v.task2_num1_cg;
}