(ns org.deeplearning4j.ui.stats.impl.SbeStatsInitializationReport
  "An implementation of StatsInitializationReport using Simple Binary Encoding (SBE)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.impl SbeStatsInitializationReport]))

(defn ->sbe-stats-initialization-report
  "Constructor."
  (^SbeStatsInitializationReport []
    (new SbeStatsInitializationReport )))

(defn get-worker-id
  "Description copied from interface: Persistable

  returns: `java.lang.String`"
  (^java.lang.String [^SbeStatsInitializationReport this]
    (-> this (.getWorkerID))))

(defn encoding-length-bytes
  "Description copied from interface: Persistable

  returns: `int`"
  (^Integer [^SbeStatsInitializationReport this]
    (-> this (.encodingLengthBytes))))

(defn decode
  "Description copied from interface: Persistable

  decode - `byte[]`"
  ([^SbeStatsInitializationReport this decode]
    (-> this (.decode decode))))

(defn report-i-ds
  "session-id - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - `java.lang.String`
  time-stamp - `long`"
  ([^SbeStatsInitializationReport this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id ^Long time-stamp]
    (-> this (.reportIDs session-id type-id worker-id time-stamp))))

(defn report-model-info
  "Description copied from interface: StatsInitializationReport

  model-class-name - Model class name: i.e., type of model - `java.lang.String`
  model-config-json - Model configuration, as JSON string - `java.lang.String`
  model-param-names - `java.lang.String[]`
  num-layers - Number of layers in the model - `int`
  num-params - Number of parameters in the model - `long`"
  ([^SbeStatsInitializationReport this ^java.lang.String model-class-name ^java.lang.String model-config-json model-param-names ^Integer num-layers ^Long num-params]
    (-> this (.reportModelInfo model-class-name model-config-json model-param-names num-layers num-params))))

(defn has-model-info?
  "returns: `boolean`"
  (^Boolean [^SbeStatsInitializationReport this]
    (-> this (.hasModelInfo))))

(defn get-time-stamp
  "Description copied from interface: Persistable

  returns: `long`"
  (^Long [^SbeStatsInitializationReport this]
    (-> this (.getTimeStamp))))

(defn has-hardware-info?
  "returns: `boolean`"
  (^Boolean [^SbeStatsInitializationReport this]
    (-> this (.hasHardwareInfo))))

(defn has-software-info?
  "returns: `boolean`"
  (^Boolean [^SbeStatsInitializationReport this]
    (-> this (.hasSoftwareInfo))))

(defn report-software-info
  "arch - Operating system architecture, as reported by JVM - `java.lang.String`
  os-name - Operating system name - `java.lang.String`
  jvm-name - JVM name - `java.lang.String`
  jvm-version - JVM version - `java.lang.String`
  jvm-spec-version - JVM Specification version (for example, 1.8) - `java.lang.String`
  nd-4j-backend-class - ND4J backend Factory class - `java.lang.String`
  nd-4j-data-type-name - ND4J datatype name - `java.lang.String`
  hostname - Hostname for the machine, if available - `java.lang.String`
  jvm-uid - A unique identified for the current JVM. Should be shared by all instances in the same JVM.Should vary for different JVMs on the same machine. - `java.lang.String`
  sw-environment-info - Environment information: Usually from Nd4j.getExecutioner().getEnvironmentInformation() - `java.util.Map`"
  ([^SbeStatsInitializationReport this ^java.lang.String arch ^java.lang.String os-name ^java.lang.String jvm-name ^java.lang.String jvm-version ^java.lang.String jvm-spec-version ^java.lang.String nd-4j-backend-class ^java.lang.String nd-4j-data-type-name ^java.lang.String hostname ^java.lang.String jvm-uid ^java.util.Map sw-environment-info]
    (-> this (.reportSoftwareInfo arch os-name jvm-name jvm-version jvm-spec-version nd-4j-backend-class nd-4j-data-type-name hostname jvm-uid sw-environment-info))))

(defn get-type-id
  "Description copied from interface: Persistable

  returns: `java.lang.String`"
  (^java.lang.String [^SbeStatsInitializationReport this]
    (-> this (.getTypeID))))

(defn report-hardware-info
  "jvm-available-processors - Number of available processor cores according to the JVM - `int`
  num-devices - Number of compute devices (GPUs) - `int`
  jvm-max-memory - Maximum memory for the JVM - `long`
  off-heap-max-memory - Maximum off-heap memory - `long`
  device-total-memory - GPU memory by device: same length as numDevices. May be null, if numDevices is 0 - `long[]`
  device-description - Description of each device. May be null, if numDevices is 0 - `java.lang.String[]`
  hardware-uid - A unique identifier for the machine. Should be shared by all instances running onthe same machine, including in different JVMs - `java.lang.String`"
  ([^SbeStatsInitializationReport this ^Integer jvm-available-processors ^Integer num-devices ^Long jvm-max-memory ^Long off-heap-max-memory device-total-memory device-description ^java.lang.String hardware-uid]
    (-> this (.reportHardwareInfo jvm-available-processors num-devices jvm-max-memory off-heap-max-memory device-total-memory device-description hardware-uid))))

(defn encode
  "Description copied from interface: Persistable

  buffer - `java.nio.ByteBuffer`"
  ([^SbeStatsInitializationReport this ^java.nio.ByteBuffer buffer]
    (-> this (.encode buffer)))
  ([^SbeStatsInitializationReport this]
    (-> this (.encode))))

(defn get-session-id
  "Description copied from interface: Persistable

  returns: `java.lang.String`"
  (^java.lang.String [^SbeStatsInitializationReport this]
    (-> this (.getSessionID))))

