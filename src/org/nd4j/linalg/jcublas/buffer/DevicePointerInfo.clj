(ns org.nd4j.linalg.jcublas.buffer.DevicePointerInfo
  "Provides information about a device pointer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.buffer DevicePointerInfo]))

(defn ->device-pointer-info
  "Constructor."
  (^DevicePointerInfo []
    (new DevicePointerInfo )))

