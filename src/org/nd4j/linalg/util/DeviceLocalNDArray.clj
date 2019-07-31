(ns org.nd4j.linalg.util.DeviceLocalNDArray
  "DeviceLocal implementation for INDArray, with special broadcast method"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util DeviceLocalNDArray]))

(defn ->device-local-nd-array
  "Constructor.

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^DeviceLocalNDArray [^org.nd4j.linalg.api.ndarray.INDArray array]
    (new DeviceLocalNDArray array))
  (^DeviceLocalNDArray []
    (new DeviceLocalNDArray )))

(defn broadcast
  "This method duplicates array, and stores it to all devices

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DeviceLocalNDArray this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.broadcast array))))

