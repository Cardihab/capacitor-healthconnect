export interface CapacitorHealthConnectPlugin {
  /** 
   * Check if the HealthKit API is available on the current device.
  */
  isAvailable(): Promise<boolean>;
  /**
   * Request authorization to access health data.
   */
  requestAuthorization(): Promise<void>;
  /**
   *  Query a sample type for the specified date range.
   */
  queryHConnectSampleType(sampleType: string, start?: Date, end?: Date): Promise<any>;
}
