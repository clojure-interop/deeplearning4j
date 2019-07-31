(ns org.tensorflow.framework.DeviceLocalityOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework DeviceLocalityOrBuilder]))

(defn get-bus-id
  "Optional bus locality of device.  Default value of 0 means
   no specific locality.  Specific localities are indexed from 1.
  int32 bus_id = 1;

  returns: `int`"
  (^Integer [^DeviceLocalityOrBuilder this]
    (-> this (.getBusId))))

