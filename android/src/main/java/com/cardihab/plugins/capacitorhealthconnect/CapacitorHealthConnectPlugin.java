package com.cardihab.plugins.capacitorhealthconnect;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "CapacitorHealthConnect")
public class CapacitorHealthConnectPlugin extends Plugin {

    private CapacitorHealthConnect implementation = new CapacitorHealthConnect();

    @PluginMethod
    public void isAvailable(PluginCall call) {
        call.resolve(implementation.isAvailable(value));
    }
}
