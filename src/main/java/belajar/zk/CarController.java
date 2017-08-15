package belajar.zk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Textbox;

import java.util.List;

public class CarController extends SelectorComposer<Component> {

    private final static Logger console = LoggerFactory.getLogger(CarController.class);
    @Wire
    public Textbox keywordBox;
    @Wire
    public Listbox carListBox;
    @Wire
    private Label modelLabel;
    @Wire
    private Label makeLabel;
    @Wire
    private Label priceLabel;
    @Wire
    private Label descriptionLabel;
    //
//    @Init(superclass = true)
//    public void init(){
//
//        service = new CarServiceImpl();
//        List<Car> listCar = service.findAll(null);
//        carListBox.setModel(new ListModelList<>(listCar));
/*    }*/
    private CarServiceImpl service;

    public CarController() {
        service = new CarServiceImpl();
    }

    @Listen("onSelect = #carListBox")
    public void showDetail() {
        Car selected = carListBox.getSelectedItem().getValue();
        if (selected != null) {
            modelLabel.setValue(selected.getModel());
            makeLabel.setValue(selected.getMake());
            priceLabel.setValue(selected.getPrice().toString());
            descriptionLabel.setValue(selected.getDescription());
        } else {
            modelLabel.setValue("");
            makeLabel.setValue("");
            priceLabel.setValue("");
            priceLabel.setValue("");
        }
    }

    @Listen("onClick = #searchButton")
    public void searchCars() {
//        console.info("args @searchBox is {}", keywordBox.getValue());
        List<Car> listCar = service.findAll(keywordBox.getValue());
        carListBox.setModel(new ListModelList<>(listCar));
    }
}
