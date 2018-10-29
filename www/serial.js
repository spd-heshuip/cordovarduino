cordova.define("fr.drangies.cordova.serial.Serial", function(require, exports, module) {
    var serial = {
        requestPermission: function(opts, successCallback, errorCallback) {
            if (typeof opts === 'function') {  //user did not pass opts
                errorCallback = successCallback;
                successCallback = opts;
                opts = {};
            }
            cordova.exec(
                successCallback,
                errorCallback,
                'Serial',
                'requestPermission',
                [{'opts': opts}]
            );
        },
        open: function(opts, successCallback, errorCallback) {
            cordova.exec(
                successCallback,
                errorCallback,
                'Serial',
                'openSerial',
                [{'opts': opts}]
            );
        },
        write: function(opts,data, successCallback, errorCallback) {
            cordova.exec(
                successCallback,
                errorCallback,
                'Serial',
                'writeSerial',
                [{'data': data},{'opts':opts}]
            );
        },
        writeHex: function(hexString, successCallback, errorCallback) {
            cordova.exec(
                successCallback,
                errorCallback,
                'Serial',
                'writeSerialHex',
                [{'data': hexString}]
            );
        },
        read: function(opts,successCallback, errorCallback) {
            cordova.exec(
                successCallback,
                errorCallback,
                'Serial',
                'readSerial',
                [{'opts':opts}]
            );
        },
        close: function(opts,successCallback, errorCallback) {
            cordova.exec(
                successCallback,
                errorCallback,
                'Serial',
                'closeSerial',
                [{'opts':opts}]
            );
        },
        registerReadCallback: function(successCallback, errorCallback) {
            cordova.exec(
                successCallback,
                errorCallback,
                'Serial',
                'registerReadCallback',
                []
            );
        },
        getAllUsbDevice: function(opts,successCallback,errorCallback){
            cordova.exec(
                successCallback,
                errorCallback,
                'Serial',
                'getAllUsbDevice' ,
                [{'opts':opts}]
            );
        },
        registerUsbListener: function(opts,successCallback,errorCallback){
            cordova.exec(
                successCallback,
                errorCallback,
                'Serial',
                'registerUsbListener',
                [{'opts':opts}]
            )
        }

    };
    module.exports = serial;

});
