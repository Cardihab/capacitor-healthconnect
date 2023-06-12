export interface CapacitorHealthConnectPlugin {
  /** 
   * Check if the HealthKit API is available on the current device.
  */
  isAvailable(): Promise<boolean>;
  /**
   * Request authorization to access health data.
   */
  requestAuthorization(): Promise<void>;
}
