package fr.drangies.cordova.serial;

import com.hoho.android.usbserial.driver.UsbSerialDriver;
import com.hoho.android.usbserial.driver.UsbSerialPort;

/**
 * Created by heshuiping on 2018/10/17.
 * fr.drangies.cordova.serial
 * spd_heshuip@163.com
 * http://www.gp51.com
 */
public class UsbSerialConfig {


    // The current driver that handle the serial port
    private UsbSerialDriver driver;
    // The serial port that will be used in this plugin
    private UsbSerialPort port;

    private int pid;
    private int vid;
    private int baudRate;
    private int dataBits;
    private int stopBits;
    private int parity;
    private boolean setDTR;
    private boolean setRTS;
    private boolean sleepOnPause;
    private String deviceName;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public UsbSerialDriver getDriver() {
        return driver;
    }

    public void setDriver(UsbSerialDriver driver) {
        this.driver = driver;
    }

    public UsbSerialPort getPort() {
        return port;
    }

    public void setPort(UsbSerialPort port) {
        this.port = port;
    }

    public int getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(int baudRate) {
        this.baudRate = baudRate;
    }

    public int getDataBits() {
        return dataBits;
    }

    public void setDataBits(int dataBits) {
        this.dataBits = dataBits;
    }

    public int getStopBits() {
        return stopBits;
    }

    public void setStopBits(int stopBits) {
        this.stopBits = stopBits;
    }

    public int getParity() {
        return parity;
    }

    public void setParity(int parity) {
        this.parity = parity;
    }

    public boolean isSetDTR() {
        return setDTR;
    }

    public void setSetDTR(boolean setDTR) {
        this.setDTR = setDTR;
    }

    public boolean isSetRTS() {
        return setRTS;
    }

    public void setSetRTS(boolean setRTS) {
        this.setRTS = setRTS;
    }

    public boolean isSleepOnPause() {
        return sleepOnPause;
    }

    public void setSleepOnPause(boolean sleepOnPause) {
        this.sleepOnPause = sleepOnPause;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public String getKey(){
        return String.format("%s%s",pid,vid);
    }
}
