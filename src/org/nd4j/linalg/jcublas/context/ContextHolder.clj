(ns org.nd4j.linalg.jcublas.context.ContextHolder
  "A multithreaded version derived
 from the cuda launcher util
 by the authors of jcuda.

 This class handles managing cuda contexts
 across multiple devices and threads."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.context ContextHolder]))

(defn ->context-holder
  "Constructor."
  (^ContextHolder []
    (new ContextHolder )))

(def *-devices-to-ban
  "Static Constant.

  type: java.lang.String"
  ContextHolder/DEVICES_TO_BAN)

(defn *get-instance
  "Singleton pattern

  returns: the instance for the context holder. - `org.nd4j.linalg.jcublas.context.ContextHolder`"
  (^org.nd4j.linalg.jcublas.context.ContextHolder []
    (ContextHolder/getInstance )))

(defn get-threads
  "returns: `java.util.Map<java.lang.String,java.lang.Integer>`"
  (^java.util.Map [^ContextHolder this]
    (-> this (.getThreads))))

(defn device-num
  "Get the number of devices

  returns: the number of devices - `int`"
  (^Integer [^ContextHolder this]
    (-> this (.deviceNum))))

(defn configure
  "Configure the given information
  based on the device"
  ([^ContextHolder this]
    (-> this (.configure))))

(defn set-num-devices
  "num-devices - `int`"
  ([^ContextHolder this ^Integer num-devices]
    (-> this (.setNumDevices num-devices))))

(defn get-device-for-thread
  "Get the device number for a particular host thread

  returns: the device for the given host thread - `int`"
  (^Integer [^ContextHolder this]
    (-> this (.getDeviceForThread))))

