(ns org.nd4j.jita.conf.CudaEnvironment
  "The cuda environment contains information
 for a given Configuration
 singleton."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.conf CudaEnvironment]))

(defn *get-instance
  "returns: `org.nd4j.jita.conf.CudaEnvironment`"
  (^org.nd4j.jita.conf.CudaEnvironment []
    (CudaEnvironment/getInstance )))

(defn get-configuration
  "Get the Configuration
  for the environment

  returns: `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^CudaEnvironment this]
    (-> this (.getConfiguration))))

(defn get-current-device-architecture
  "Get the current device architecture

  returns: the major/minor version of
  the current device - `int`"
  (^Integer [^CudaEnvironment this]
    (-> this (.getCurrentDeviceArchitecture))))

(defn notify-configuration-applied
  ""
  ([^CudaEnvironment this]
    (-> this (.notifyConfigurationApplied))))

