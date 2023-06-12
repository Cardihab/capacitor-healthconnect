export interface CapacitorHealthConnectPlugin {
  /** 
   * Check if the HealthKit API is available on the current device.
  */
  isAvailable(): Promise<boolean>;
}
