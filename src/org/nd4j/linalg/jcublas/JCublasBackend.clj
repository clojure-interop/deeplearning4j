(ns org.nd4j.linalg.jcublas.JCublasBackend
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas JCublasBackend]))

(defn ->j-cublas-backend
  "Constructor."
  (^JCublasBackend []
    (new JCublasBackend )))

(defn available?
  "Description copied from class: Nd4jBackend

  returns: true if the backend is available; false otherwise. - `boolean`"
  (^Boolean [^JCublasBackend this]
    (-> this (.isAvailable))))

(defn can-run?
  "Description copied from class: Nd4jBackend

  returns: `boolean`"
  (^Boolean [^JCublasBackend this]
    (-> this (.canRun))))

(defn allows-order
  "Description copied from class: Nd4jBackend

  returns: true if the backend allows
  order to be specified on blas operations - `boolean`"
  (^Boolean [^JCublasBackend this]
    (-> this (.allowsOrder))))

(defn get-priority
  "Description copied from class: Nd4jBackend

  returns: a priority number. - `int`"
  (^Integer [^JCublasBackend this]
    (-> this (.getPriority))))

(defn get-configuration-resource
  "Description copied from class: Nd4jBackend

  returns: `org.nd4j.linalg.io.Resource`"
  (^org.nd4j.linalg.io.Resource [^JCublasBackend this]
    (-> this (.getConfigurationResource))))

(defn get-nd-array-class
  "Description copied from class: Nd4jBackend

  returns: `java.lang.Class`"
  (^java.lang.Class [^JCublasBackend this]
    (-> this (.getNDArrayClass))))

