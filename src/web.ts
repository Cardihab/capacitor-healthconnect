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
}
