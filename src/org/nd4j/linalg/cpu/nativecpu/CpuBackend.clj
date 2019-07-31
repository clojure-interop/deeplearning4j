(ns org.nd4j.linalg.cpu.nativecpu.CpuBackend
  "Cpu backend"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu CpuBackend]))

(defn ->cpu-backend
  "Constructor."
  (^CpuBackend []
    (new CpuBackend )))

(defn available?
  "Description copied from class: Nd4jBackend

  returns: true if the backend is available; false otherwise. - `boolean`"
  (^Boolean [^CpuBackend this]
    (-> this (.isAvailable))))

(defn can-run?
  "Description copied from class: Nd4jBackend

  returns: `boolean`"
  (^Boolean [^CpuBackend this]
    (-> this (.canRun))))

(defn allows-order
  "Description copied from class: Nd4jBackend

  returns: true if the backend allows
  order to be specified on blas operations - `boolean`"
  (^Boolean [^CpuBackend this]
    (-> this (.allowsOrder))))

(defn get-priority
  "Description copied from class: Nd4jBackend

  returns: a priority number. - `int`"
  (^Integer [^CpuBackend this]
    (-> this (.getPriority))))

(defn get-configuration-resource
  "Description copied from class: Nd4jBackend

  returns: `org.nd4j.linalg.io.Resource`"
  (^org.nd4j.linalg.io.Resource [^CpuBackend this]
    (-> this (.getConfigurationResource))))

(defn get-nd-array-class
  "Description copied from class: Nd4jBackend

  returns: `java.lang.Class`"
  (^java.lang.Class [^CpuBackend this]
    (-> this (.getNDArrayClass))))

