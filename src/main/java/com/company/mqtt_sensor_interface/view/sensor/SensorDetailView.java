package com.company.mqtt_sensor_interface.view.sensor;

import com.company.mqtt_sensor_interface.entity.Sensor;
import com.company.mqtt_sensor_interface.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "sensors/:id", layout = MainView.class)
@ViewController("Sensor.detail")
@ViewDescriptor("sensor-detail-view.xml")
@EditedEntityContainer("sensorDc")
public class SensorDetailView extends StandardDetailView<Sensor> {
}