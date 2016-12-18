(function (global) {
    System.config({
        paths: {
            // path to node_modules
            'npm:': 'resources/node_modules/'
        },
        // Specify the loader 'System', where to find the modules
        map: {
            // Our application will be in the app folder
            app: 'resources/app/',
            // Packages angular
            '@angular/core': 'npm:@angular/core/bundles/core.umd.js',
            '@angular/common': 'npm:@angular/common/bundles/common.umd.js',
            '@angular/compiler': 'npm:@angular/compiler/bundles/compiler.umd.js',
            '@angular/platform-browser': 'npm:@angular/platform-browser/bundles/platform-browser.umd.js',
            '@angular/platform-browser-dynamic': 'npm:@angular/platform-browser-dynamic/bundles/platform-browser-dynamic.umd.js',
            '@angular/http': 'npm:@angular/http/bundles/http.umd.js',
            '@angular/router': 'npm:@angular/router/bundles/router.umd.js',
            '@angular/forms': 'npm:@angular/forms/bundles/forms.umd.js',
            '@angular/upgrade': 'npm:@angular/upgrade/bundles/upgrade.umd.js',
            'rxjs':                      'npm:rxjs',
            'angular-in-memory-web-api': 'npm:angular-in-memory-web-api/bundles/in-memory-web-api.umd.js'
        },
        // Packets that indicate System loader, how to upload files without a name and extension
        packages: {
            app: {
                main: 'main.js',
                defaultExtension: 'js'
            },
            rxjs: {
                defaultExtension: 'js'
            }
        }
    });
})(this);