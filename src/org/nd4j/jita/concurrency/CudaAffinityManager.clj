(ns org.nd4j.jita.concurrency.CudaAffinityManager
  "AffinityManager implementation for CUDA"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.concurrency CudaAffinityManager]))

(defn ->cuda-affinity-manager
  "Constructor."
  (^CudaAffinityManager []
    (new CudaAffinityManager )))

(defn get-active-location
  "Description copied from interface: AffinityManager

  array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.concurrency.AffinityManager$Location`"
  (^org.nd4j.linalg.api.concurrency.AffinityManager$Location [^CudaAffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.getActiveLocation array))))

(defn ensure-location
  "Description copied from interface: AffinityManager

  array - `org.nd4j.linalg.api.ndarray.INDArray`
  location - `org.nd4j.linalg.api.concurrency.AffinityManager$Location`"
  ([^CudaAffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.api.concurrency.AffinityManager$Location location]
    (-> this (.ensureLocation array location))))

(defn tag-location
  "This method marks given INDArray as actual in specific location (either host, device, or both)

  array - `org.nd4j.linalg.api.ndarray.INDArray`
  location - `org.nd4j.linalg.api.concurrency.AffinityManager$Location`"
  ([^CudaAffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.api.concurrency.AffinityManager$Location location]
    (-> this (.tagLocation array location))))

(defn get-device-for-current-thread
  "This method returns deviceId for current thread.
  If no device was assigned to this thread before this call, it'll be assinged here.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^CudaAffinityManager this]
    (-> this (.getDeviceForCurrentThread))))

(defn touch
  "Utility method, to associate INDArray with specific device (backend-specific)

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^CudaAffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.touch array))))

(defn get-number-of-devices
  "This method returns number of available devices in system.
  Please note: returned value might be different from actual number of used devices.

  returns: total number of devices - `int`"
  (^Integer [^CudaAffinityManager this]
    (-> this (.getNumberOfDevices))))

(defn replicate-to-device
  "This method replicates given INDArray, and places it to target device.

  device-id - target deviceId - `java.lang.Integer`
  array - INDArray to replicate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CudaAffinityManager this ^java.lang.Integer device-id ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.replicateToDevice device-id array))))

(defn attach-thread-to-device
  "This method pairs specified thread & device

  thread - `java.lang.Thread`
  device-id - `java.lang.Integer`"
  ([^CudaAffinityManager this ^java.lang.Thread thread ^java.lang.Integer device-id]
    (-> this (.attachThreadToDevice thread device-id))))

(defn unsafe-set-device
  "Description copied from interface: AffinityManager

  device-id - `java.lang.Integer`"
  ([^CudaAffinityManager this ^java.lang.Integer device-id]
    (-> this (.unsafeSetDevice device-id))))

(defn get-device-for-thread
  "This method returns deviceId for given thread.
  If no device was assigned to this thread before this call, it'll be assinged here.

  thread - `java.lang.Thread`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^CudaAffinityManager this ^java.lang.Thread thread]
    (-> this (.getDeviceForThread thread))))

(defn get-device-for-array
  "Description copied from interface: AffinityManager

  array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^CudaAffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.getDeviceForArray array))))

(defn allow-cross-device-access
  "Description copied from interface: AffinityManager

  really-allow - `boolean`"
  ([^CudaAffinityManager this ^Boolean really-allow]
    (-> this (.allowCrossDeviceAccess really-allow))))

(defn cross-device-access-supported?
  "Description copied from interface: AffinityManager

  returns: `boolean`"
  (^Boolean [^CudaAffinityManager this]
    (-> this (.isCrossDeviceAccessSupported))))

