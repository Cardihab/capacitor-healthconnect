export interface CapacitorHealthConnectPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
