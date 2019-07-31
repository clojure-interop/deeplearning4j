(ns org.nd4j.linalg.api.concurrency.AffinityManager
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.concurrency AffinityManager]))

(defn get-active-location
  "This method returns last-updated location for the given INDArray

  array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.concurrency.AffinityManager$Location`"
  (^org.nd4j.linalg.api.concurrency.AffinityManager$Location [^AffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.getActiveLocation array))))

(defn ensure-location
  "This method propagates given INDArray to specified location

  array - `org.nd4j.linalg.api.ndarray.INDArray`
  location - `org.nd4j.linalg.api.concurrency.AffinityManager$Location`"
  ([^AffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.api.concurrency.AffinityManager$Location location]
    (-> this (.ensureLocation array location))))

(defn tag-location
  "This method tags specific INDArray as \"recent\" on specified location

  array - `org.nd4j.linalg.api.ndarray.INDArray`
  location - `org.nd4j.linalg.api.concurrency.AffinityManager$Location`"
  ([^AffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.api.concurrency.AffinityManager$Location location]
    (-> this (.tagLocation array location))))

(defn get-device-for-current-thread
  "This method returns deviceId for current thread

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AffinityManager this]
    (-> this (.getDeviceForCurrentThread))))

(defn touch
  "Utility method, to associate INDArray with specific device (backend-specific)

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.touch array))))

(defn get-number-of-devices
  "This method returns number of available devices

  returns: `int`"
  (^Integer [^AffinityManager this]
    (-> this (.getNumberOfDevices))))

(defn replicate-to-device
  "This method replicates given INDArray, and places it to target device.

  device-id - target deviceId - `java.lang.Integer`
  array - INDArray to replicate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AffinityManager this ^java.lang.Integer device-id ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.replicateToDevice device-id array))))

(defn attach-thread-to-device
  "This method attaches specified thread to specified device

  thread - `java.lang.Thread`
  device-id - `java.lang.Integer`"
  ([^AffinityManager this ^java.lang.Thread thread ^java.lang.Integer device-id]
    (-> this (.attachThreadToDevice thread device-id))))

(defn unsafe-set-device
  "This method forces specific device for current thread.
  PLEASE NOTE: This method is UNSAFE and should NOT be used with 100% clearance about it.

  device-id - `java.lang.Integer`"
  ([^AffinityManager this ^java.lang.Integer device-id]
    (-> this (.unsafeSetDevice device-id))))

(defn get-device-for-thread
  "This method returns deviceId for specified thread

  thread - `java.lang.Thread`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AffinityManager this ^java.lang.Thread thread]
    (-> this (.getDeviceForThread thread))))

(defn get-device-for-array
  "This method returns id of current device for a given INDArray

  array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.getDeviceForArray array))))

(defn allow-cross-device-access
  "This method allows to block cross-device access. Mostly suitable for debugging/testing purposes

  really-allow - `boolean`"
  ([^AffinityManager this ^Boolean really-allow]
    (-> this (.allowCrossDeviceAccess really-allow))))

(defn cross-device-access-supported?
  "This method returns TRUE if cross-device access is allowed on this system

  returns: `boolean`"
  (^Boolean [^AffinityManager this]
    (-> this (.isCrossDeviceAccessSupported))))

