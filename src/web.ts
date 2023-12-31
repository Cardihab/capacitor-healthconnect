import { WebPlugin } from '@capacitor/core';

import type { CapacitorHealthConnectPlugin } from './definitions';

export class CapacitorHealthConnectWeb
  extends WebPlugin
  implements CapacitorHealthConnectPlugin
{
  async isAvailable(): Promise<boolean> {
    console.log('HealthConnect is not available in web.');
    return false;
  }

  async requestAuthorization(): Promise<void> {
    console.log('HealthConnect is not available in web.');
    return;
  }

  async queryHConnectSampleType(sampleType: string, start?: Date, end?: Date): Promise<any> {
    console.log('HealthConnect is not available in web.');
    return;
  }
}
