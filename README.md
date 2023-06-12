# @cardihab/capacitor-healthconnect

Capacitor plugin to interact with Android HealthConnect

## Get Permission
https://docs.google.com/forms/d/1LFjbq1MOCZySpP5eIVkoyzXTanpcGTYQH26lKcrQUJo/viewform?edit_requested=true

## Install

```bash
npm install @cardihab/capacitor-healthconnect
npx cap sync
```

## API

<docgen-index>

* [`isAvailable()`](#isavailable)
* [`requestAuthorization()`](#requestauthorization)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### isAvailable()

```typescript
isAvailable() => Promise<boolean>
```

Check if the HealthKit API is available on the current device.

**Returns:** <code>Promise&lt;boolean&gt;</code>

--------------------


### requestAuthorization()

```typescript
requestAuthorization() => Promise<void>
```

Request authorization to access health data.

--------------------

</docgen-api>
