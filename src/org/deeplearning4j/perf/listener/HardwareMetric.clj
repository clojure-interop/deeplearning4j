(ns org.deeplearning4j.perf.listener.HardwareMetric
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.perf.listener HardwareMetric]))

(defn *from-system
  "Returns the relevant information
  needed for system diagnostics
  based on the SystemInfo

  system-info - the system info to use - `oshi.json.SystemInfo`
  name - `java.lang.String`

  returns: the HardwareMetric for the
  system this process runs on - `org.deeplearning4j.perf.listener.HardwareMetric`"
  (^org.deeplearning4j.perf.listener.HardwareMetric [^oshi.json.SystemInfo system-info ^java.lang.String name]
    (HardwareMetric/fromSystem system-info name))
  (^org.deeplearning4j.perf.listener.HardwareMetric [^oshi.json.SystemInfo system-info]
    (HardwareMetric/fromSystem system-info))
  (^org.deeplearning4j.perf.listener.HardwareMetric []
    (HardwareMetric/fromSystem )))

(defn *from-yaml
  "yaml - `java.lang.String`

  returns: `org.deeplearning4j.perf.listener.HardwareMetric`"
  (^org.deeplearning4j.perf.listener.HardwareMetric [^java.lang.String yaml]
    (HardwareMetric/fromYaml yaml)))

(defn to-yaml
  "returns: `java.lang.String`"
  (^java.lang.String [^HardwareMetric this]
    (-> this (.toYaml))))

