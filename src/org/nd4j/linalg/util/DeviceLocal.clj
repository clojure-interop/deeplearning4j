(ns org.nd4j.linalg.util.DeviceLocal
  "Class similar to Java ThreadLocal class, but locality is preserved with respect to device used"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util DeviceLocal]))

(defn ->device-local
  "Constructor."
  (^DeviceLocal []
    (new DeviceLocal )))

(defn get
  "This method returns object local to target device

  device-id - `int`

  returns: `T`"
  ([^DeviceLocal this ^Integer device-id]
    (-> this (.get device-id)))
  ([^DeviceLocal this]
    (-> this (.get))))

(defn set
  "This method sets object for specific device

  device-id - `int`
  object - `T`"
  ([^DeviceLocal this ^Integer device-id object]
    (-> this (.set device-id object)))
  ([^DeviceLocal this object]
    (-> this (.set object))))

(defn clear
  "This method removes object stored for current device"
  ([^DeviceLocal this]
    (-> this (.clear))))

