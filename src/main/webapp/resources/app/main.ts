/**
 * This script using for run the application.
 */

import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { AppModule } from './module/app.module';

const platform = platformBrowserDynamic();
platform.bootstrapModule(AppModule);