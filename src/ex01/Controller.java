package ex01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;
import javafx.scene.chart.PieChart.Data;


public class Controller implements Initializable {
	@FXML public PieChart pieChart;
	@FXML public BarChart barChart;
	@FXML public AreaChart areaChart;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		/*
		pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("Java",10),
				new PieChart.Data("PYTHON",20),
				new PieChart.Data("JAVAFX",30),
				new PieChart.Data("CPP",40)));
*/
		XYChart.Series<String, Integer> ser1 = new XYChart.Series<>();//Barchart 남자
		ser1.setName("남자");
		ser1.setData(FXCollections.observableArrayList(
				new XYChart.Data("2021", 50),
				new XYChart.Data("2022", 20),
				new XYChart.Data("2023", 10),
				new XYChart.Data("2024", 60)));
		barChart.getData().add(ser1);
		//ObservableList li1 =FXCollections.observableArrayList(); // barchart.getdata().add(ser1)와 같은 결과
		//li1.add(ser1);
		//barChart.setData(li1);
		
		XYChart.Series<String, Integer> ser2 = new XYChart.Series<>();//barchart 여자
		ser2.setName("여자");
		ser2.setData(FXCollections.observableArrayList(
				new XYChart.Data("2021", 60),
				new XYChart.Data("2022", 30),
				new XYChart.Data("2023", 20),
				new XYChart.Data("2024", 40)));
		//li1.add(ser2);
		barChart.getData().add(ser2);
		
		
		
		XYChart.Series<String, Integer> ser3 = new XYChart.Series<>();// AreaChart
		ser3.setName("온도");
		ser3.setData(FXCollections.observableArrayList(
				new XYChart.Data("2021", 60),
				new XYChart.Data("2022", 30),
				new XYChart.Data("2023", 20),
				new XYChart.Data("2024", 40)));
		areaChart.getData().add(ser3);
		
		
	}
	public void testFunc() { //button
		/*
		pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("Java",10),
				new PieChart.Data("PYTHON",20),
				new PieChart.Data("JAVAFX",30),
				new PieChart.Data("CPP",40)));
				*/
		ObservableList<Data> list = FXCollections.observableArrayList();
		Data d1 = new PieChart.Data("JAVA", 10);
		list.add(d1);
		Data d2 = new PieChart.Data("111", 20);
		list.add(d2);
		Data d3 = new PieChart.Data("222", 30);
		list.add(d3);
		Data d4 = new PieChart.Data("333", 40);
		list.add(d4);
		pieChart.setData(list); // 위에 데이터와 다 같은 의미
		
	}
}