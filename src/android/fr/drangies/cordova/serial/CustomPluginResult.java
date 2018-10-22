package android_serialport_api.sample;

import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by heshuiping on 2018/10/17.
 * android_serialport_api.sample
 * spd_heshuip@163.com
 * http://www.gp51.com
 */
public class CustomPluginResult extends PluginResult{

    private String path;

    public CustomPluginResult(Status status) {
        super(status);
    }

    public CustomPluginResult(Status status, String message) {
        super(status, message);
    }

    public CustomPluginResult(Status status, JSONArray message) {
        super(status, message);
    }

    public CustomPluginResult(Status status, JSONObject message) {
        super(status, message);
    }

    public CustomPluginResult(Status status, int i) {
        super(status, i);
    }

    public CustomPluginResult(Status status, float f) {
        super(status, f);
    }

    public CustomPluginResult(Status status, boolean b) {
        super(status, b);
    }

    public CustomPluginResult(Status status, byte[] data,String path) {
        super(status, data);
        this.path = path;
    }

    public CustomPluginResult(Status status, byte[] data, boolean binaryString) {
        super(status, data, binaryString);
    }

    public CustomPluginResult(Status status, List<PluginResult> multipartMessages) {
        super(status, multipartMessages);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
