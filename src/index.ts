import { registerPlugin } from '@capacitor/core';

import type { CapacitorHealthConnectPlugin } from './definitions';

const CapacitorHealthConnect = registerPlugin<CapacitorHealthConnectPlugin>(
  'CapacitorHealthConnect',
  {
    web: () => import('./web').then(m => new m.CapacitorHealthConnectWeb()),
  },
);

export * from './definitions';
export { CapacitorHealthConnect };
