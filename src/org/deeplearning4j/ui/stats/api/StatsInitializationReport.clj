(ns org.deeplearning4j.ui.stats.api.StatsInitializationReport
  "An interface used with StatsListener for reporting static information.
 The idea is that this information will be reported only once, at the first call of the StatsListener. Comparatively,
 the StatsReport will be used multiple times - every N iterations according to the configuration (StatsUpdateConfiguration).

 Note that the software, hardware and model information may or may not be obtained and reported, depending on the configuration
 provided by the relevant StatsInitializationConfiguration"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.api StatsInitializationReport]))

(defn get-hw-device-total-memory
  "returns: `long[]`"
  ([^StatsInitializationReport this]
    (-> this (.getHwDeviceTotalMemory))))

(defn get-model-config-json
  "returns: `java.lang.String`"
  (^java.lang.String [^StatsInitializationReport this]
    (-> this (.getModelConfigJson))))

(defn get-sw-jvm-version
  "returns: `java.lang.String`"
  (^java.lang.String [^StatsInitializationReport this]
    (-> this (.getSwJvmVersion))))

(defn get-hw-jvm-available-processors
  "returns: `int`"
  (^Integer [^StatsInitializationReport this]
    (-> this (.getHwJvmAvailableProcessors))))

(defn get-hw-jvm-max-memory
  "returns: `long`"
  (^Long [^StatsInitializationReport this]
    (-> this (.getHwJvmMaxMemory))))

(defn get-sw-nd-4j-data-type-name
  "returns: `java.lang.String`"
  (^java.lang.String [^StatsInitializationReport this]
    (-> this (.getSwNd4jDataTypeName))))

(defn get-model-num-params
  "returns: `long`"
  (^Long [^StatsInitializationReport this]
    (-> this (.getModelNumParams))))

(defn report-i-ds
  "session-id - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - `java.lang.String`
  timestamp - `long`"
  ([^StatsInitializationReport this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id ^Long timestamp]
    (-> this (.reportIDs session-id type-id worker-id timestamp))))

(defn get-sw-environment-info
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^StatsInitializationReport this]
    (-> this (.getSwEnvironmentInfo))))

(defn get-model-param-names
  "returns: `java.lang.String[]`"
  ([^StatsInitializationReport this]
    (-> this (.getModelParamNames))))

(defn get-model-class-name
  "returns: `java.lang.String`"
  (^java.lang.String [^StatsInitializationReport this]
    (-> this (.getModelClassName))))

(defn report-model-info
  "Report the model information

  model-class-name - Model class name: i.e., type of model - `java.lang.String`
  model-config-json - Model configuration, as JSON string - `java.lang.String`
  param-names - `java.lang.String[]`
  num-layers - Number of layers in the model - `int`
  num-params - Number of parameters in the model - `long`"
  ([^StatsInitializationReport this ^java.lang.String model-class-name ^java.lang.String model-config-json param-names ^Integer num-layers ^Long num-params]
    (-> this (.reportModelInfo model-class-name model-config-json param-names num-layers num-params))))

(defn get-hw-device-description
  "returns: `java.lang.String[]`"
  ([^StatsInitializationReport this]
    (-> this (.getHwDeviceDescription))))

(defn get-sw-jvm-uid
  "returns: `java.lang.String`"
  (^java.lang.String [^StatsInitializationReport this]
    (-> this (.getSwJvmUID))))

(defn get-sw-os-name
  "returns: `java.lang.String`"
  (^java.lang.String [^StatsInitializationReport this]
    (-> this (.getSwOsName))))

(defn has-model-info?
  "returns: `boolean`"
  (^Boolean [^StatsInitializationReport this]
    (-> this (.hasModelInfo))))

(defn get-hw-off-heap-max-memory
  "returns: `long`"
  (^Long [^StatsInitializationReport this]
    (-> this (.getHwOffHeapMaxMemory))))

(defn get-sw-arch
  "returns: `java.lang.String`"
  (^java.lang.String [^StatsInitializationReport this]
    (-> this (.getSwArch))))

(defn get-sw-nd-4j-backend-class
  "returns: `java.lang.String`"
  (^java.lang.String [^StatsInitializationReport this]
    (-> this (.getSwNd4jBackendClass))))

(defn get-model-num-layers
  "returns: `int`"
  (^Integer [^StatsInitializationReport this]
    (-> this (.getModelNumLayers))))

(defn has-hardware-info?
  "returns: `boolean`"
  (^Boolean [^StatsInitializationReport this]
    (-> this (.hasHardwareInfo))))

(defn has-software-info?
  "returns: `boolean`"
  (^Boolean [^StatsInitializationReport this]
    (-> this (.hasSoftwareInfo))))

(defn get-sw-jvm-spec-version
  "returns: `java.lang.String`"
  (^java.lang.String [^StatsInitializationReport this]
    (-> this (.getSwJvmSpecVersion))))

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
  ([^StatsInitializationReport this ^java.lang.String arch ^java.lang.String os-name ^java.lang.String jvm-name ^java.lang.String jvm-version ^java.lang.String jvm-spec-version ^java.lang.String nd-4j-backend-class ^java.lang.String nd-4j-data-type-name ^java.lang.String hostname ^java.lang.String jvm-uid ^java.util.Map sw-environment-info]
    (-> this (.reportSoftwareInfo arch os-name jvm-name jvm-version jvm-spec-version nd-4j-backend-class nd-4j-data-type-name hostname jvm-uid sw-environment-info))))

(defn report-hardware-info
  "jvm-available-processors - Number of available processor cores according to the JVM - `int`
  num-devices - Number of compute devices (GPUs) - `int`
  jvm-max-memory - Maximum memory for the JVM - `long`
  off-heap-max-memory - Maximum off-heap memory - `long`
  device-total-memory - GPU memory by device: same length as numDevices. May be null, if numDevices is 0 - `long[]`
  device-description - Description of each device. May be null, if numDevices is 0 - `java.lang.String[]`
  hardware-uid - A unique identifier for the machine. Should be shared by all instances running onthe same machine, including in different JVMs - `java.lang.String`"
  ([^StatsInitializationReport this ^Integer jvm-available-processors ^Integer num-devices ^Long jvm-max-memory ^Long off-heap-max-memory device-total-memory device-description ^java.lang.String hardware-uid]
    (-> this (.reportHardwareInfo jvm-available-processors num-devices jvm-max-memory off-heap-max-memory device-total-memory device-description hardware-uid))))

(defn get-hw-num-devices
  "returns: `int`"
  (^Integer [^StatsInitializationReport this]
    (-> this (.getHwNumDevices))))

(defn get-sw-jvm-name
  "returns: `java.lang.String`"
  (^java.lang.String [^StatsInitializationReport this]
    (-> this (.getSwJvmName))))

(defn get-hw-hardware-uid
  "returns: `java.lang.String`"
  (^java.lang.String [^StatsInitializationReport this]
    (-> this (.getHwHardwareUID))))

(defn get-sw-host-name
  "returns: `java.lang.String`"
  (^java.lang.String [^StatsInitializationReport this]
    (-> this (.getSwHostName))))

