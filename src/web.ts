import { WebPlugin } from '@capacitor/core';

import type { CapacitorHealthConnectPlugin } from './definitions';

export class CapacitorHealthConnectWeb
  extends WebPlugin
  implements CapacitorHealthConnectPlugin
{
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
