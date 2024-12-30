package com.company.mqtt_sensor_interface.view.sensor;

import com.company.mqtt_sensor_interface.entity.Sensor;
import com.company.mqtt_sensor_interface.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "sensors", layout = MainView.class)
@ViewController("Sensor.list")
@ViewDescriptor("sensor-list-view.xml")
@LookupComponent("sensorsDataGrid")
@DialogMode(width = "64em")
public class SensorListView extends StandardListView<Sensor> {
}