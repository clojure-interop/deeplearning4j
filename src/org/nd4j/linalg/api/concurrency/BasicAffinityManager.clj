(ns org.nd4j.linalg.api.concurrency.BasicAffinityManager
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.concurrency BasicAffinityManager]))

(defn ->basic-affinity-manager
  "Constructor."
  (^BasicAffinityManager []
    (new BasicAffinityManager )))

(defn get-active-location
  "Description copied from interface: AffinityManager

  array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.concurrency.AffinityManager$Location`"
  (^org.nd4j.linalg.api.concurrency.AffinityManager$Location [^BasicAffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.getActiveLocation array))))

(defn ensure-location
  "Description copied from interface: AffinityManager

  array - `org.nd4j.linalg.api.ndarray.INDArray`
  location - `org.nd4j.linalg.api.concurrency.AffinityManager$Location`"
  ([^BasicAffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.api.concurrency.AffinityManager$Location location]
    (-> this (.ensureLocation array location))))

(defn tag-location
  "Description copied from interface: AffinityManager

  array - `org.nd4j.linalg.api.ndarray.INDArray`
  location - `org.nd4j.linalg.api.concurrency.AffinityManager$Location`"
  ([^BasicAffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.api.concurrency.AffinityManager$Location location]
    (-> this (.tagLocation array location))))

(defn get-device-for-current-thread
  "Description copied from interface: AffinityManager

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^BasicAffinityManager this]
    (-> this (.getDeviceForCurrentThread))))

(defn get-number-of-devices
  "Description copied from interface: AffinityManager

  returns: `int`"
  (^Integer [^BasicAffinityManager this]
    (-> this (.getNumberOfDevices))))

(defn replicate-to-device
  "This method replicates given INDArray, and places it to target device.

  device-id - target deviceId - `java.lang.Integer`
  array - INDArray to replicate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BasicAffinityManager this ^java.lang.Integer device-id ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.replicateToDevice device-id array))))

(defn attach-thread-to-device
  "Description copied from interface: AffinityManager

  thread - `java.lang.Thread`
  device-id - `java.lang.Integer`"
  ([^BasicAffinityManager this ^java.lang.Thread thread ^java.lang.Integer device-id]
    (-> this (.attachThreadToDevice thread device-id))))

(defn unsafe-set-device
  "Description copied from interface: AffinityManager

  device-id - `java.lang.Integer`"
  ([^BasicAffinityManager this ^java.lang.Integer device-id]
    (-> this (.unsafeSetDevice device-id))))

(defn get-device-for-thread
  "Description copied from interface: AffinityManager

  thread - `java.lang.Thread`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^BasicAffinityManager this ^java.lang.Thread thread]
    (-> this (.getDeviceForThread thread))))

(defn get-device-for-array
  "Description copied from interface: AffinityManager

  array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^BasicAffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.getDeviceForArray array))))

(defn allow-cross-device-access
  "Description copied from interface: AffinityManager

  really-allow - `boolean`"
  ([^BasicAffinityManager this ^Boolean really-allow]
    (-> this (.allowCrossDeviceAccess really-allow))))

(defn cross-device-access-supported?
  "Description copied from interface: AffinityManager

  returns: `boolean`"
  (^Boolean [^BasicAffinityManager this]
    (-> this (.isCrossDeviceAccessSupported))))

