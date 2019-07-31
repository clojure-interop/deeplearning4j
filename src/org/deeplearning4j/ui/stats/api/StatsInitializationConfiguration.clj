(ns org.deeplearning4j.ui.stats.api.StatsInitializationConfiguration
  "Configuration interface for static (unchanging) information, to be reported by StatsListener.
 This interface allows for software/hardware/model information to be collected (or, not)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.api StatsInitializationConfiguration]))

(defn collect-software-info
  "Should software configuration information be collected? For example, OS, JVM, and ND4J backend details

  returns: true if software information should be collected; false if not - `boolean`"
  (^Boolean [^StatsInitializationConfiguration this]
    (-> this (.collectSoftwareInfo))))

(defn collect-hardware-info
  "Should hardware configuration information be collected? JVM available processors, number of devices, total memory for each device

  returns: true if hardware information should be collected - `boolean`"
  (^Boolean [^StatsInitializationConfiguration this]
    (-> this (.collectHardwareInfo))))

(defn collect-model-info
  "Should model information be collected? Model class, configuration (JSON), number of layers, number of parameters, etc.

  returns: true if model information should be collected - `boolean`"
  (^Boolean [^StatsInitializationConfiguration this]
    (-> this (.collectModelInfo))))

