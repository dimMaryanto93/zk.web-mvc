package belajar.zk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Textbox;

public class CarController extends SelectorComposer<Component> {

    private final static Logger console = LoggerFactory.getLogger(CarController.class);
    @Wire
    private Textbox keywordBox;
    @Wire
    private Listbox carListBox;

    @Listen("onClick = #searchButton")
    public void searchCars() {
        console.info("args @searchBox is {}", keywordBox.getValue());
    }
}
