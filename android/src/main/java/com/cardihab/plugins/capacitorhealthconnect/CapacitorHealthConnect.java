package com.cardihab.plugins.capacitorhealthconnect;

import android.util.Log;

public class CapacitorHealthConnect {

    public boolean isAvailable() {
        // Check the availability of HealthConnect SDK and instantiate the client

        /*
        val availabilityStatus = HealthConnectClient.sdkStatus(context, providerPackageName)

        if (availabilityStatus == HealthConnectClient.SDK_UNAVAILABLE) {
            return false
        }
        
        if (availabilityStatus == HealthConnectClient.SDK_UNAVAILABLE_PROVIDER_UPDATE_REQUIRED) {
            // Optionally redirect to package installer to find a provider, for example:
            val uriString = "market://details?id=$providerPackageName&url=healthconnect%3A%2F%2Fonboarding"
            
            context.startActivity(
                Intent(Intent.ACTION_VIEW).apply {
                    setPackage("com.android.vending")
                    data = Uri.parse(uriString)
                    putExtra("overlay", true)
                    putExtra("callerId", context.packageName)
                }
            )

            return
        }

        val healthConnectClient = HealthConnectClient.getOrCreate(context)
        */

        return false;
    }
    
    public void requestAuthorization() {
        // Request authorization for the permissions needed 
        
        /*
        var PERMISSIONS =
        setOf(
            HealthPermission.getReadPermission(HeartRateRecord::class),
            HealthPermission.getWritePermission(HeartRateRecord::class),
            HealthPermission.getReadPermission(StepsRecord::class),
            HealthPermission.getWritePermission(StepsRecord::class)
        )

        // TODO: Permissions for all relevant data types
        
        var requestPermissionActivityContract = PermissionController.createRequestPermissionResultContract()

        var requestPermissions = registerForActivityResult(requestPermissionActivityContract) { granted ->
            if (granted.containsAll(PERMISSIONS)) {
                // Permissions successfully granted
            } else {
                // Lack of required permissions
            }
        }
        */

        return
    }
}
