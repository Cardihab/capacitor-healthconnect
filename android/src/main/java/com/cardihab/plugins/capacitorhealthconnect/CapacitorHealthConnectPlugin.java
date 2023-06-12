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
        call.resolve(implementation.isAvailable());
    }

    @PluginMethod
    public void requestAuthorization(PluginCall call) {
        call.resolve(implementation.requestAuthorization());
    }

    @PluginMethod
    public void queryHConnectSampleTypes(PluginCall call) {
        JSObject callValue = call.getData();
        const sampleType = callValue.get("sampleType")
        const startDate = callValue.get("start")
        const endDate = callValue.get("end")

        call.resolve(implementation.queryHConnectSampleTypes(sampleType, startDate, endDate));
    }
}
