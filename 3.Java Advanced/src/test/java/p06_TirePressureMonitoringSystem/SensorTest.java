package p06_TirePressureMonitoringSystem;

import OOP.L10UnitTesting.Exercise.p06_TirePressureMonitoringSystem.Sensor;
import org.junit.Before;
import org.mockito.Mockito;

public class SensorTest {

    private static final double OFFSET_FROM_SENSOR_CLASS = 16;
    private Sensor sensor;

    @Before
    public void initialSensor() {
        sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(12.0);
    }





}