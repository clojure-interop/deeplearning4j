(ns org.nd4j.jita.allocator.enums.CudaConstants
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.enums CudaConstants]))

(defn ->cuda-constants
  "Constructor."
  (^CudaConstants []
    (new CudaConstants )))

(defn *-cuda-memcpy-host-to-host
  "Static Field.

  type: int"
  []
  CudaConstants/cudaMemcpyHostToHost)

(defn *-cuda-memcpy-host-to-device
  "Static Field.

  < Host -> Host

  type: int"
  []
  CudaConstants/cudaMemcpyHostToDevice)

(defn *-cuda-memcpy-device-to-host
  "Static Field.

  < Host -> Device

  type: int"
  []
  CudaConstants/cudaMemcpyDeviceToHost)

(defn *-cuda-memcpy-device-to-device
  "Static Field.

  < Device -> Host

  type: int"
  []
  CudaConstants/cudaMemcpyDeviceToDevice)

(defn *-cuda-memcpy-default
  "Static Field.

  < Device -> Device

  type: int"
  []
  CudaConstants/cudaMemcpyDefault)

