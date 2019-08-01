(ns org.nd4j.nativeblas.Nd4jCpuPresets
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpuPresets]))

(defn ->nd-4j-cpu-presets
  "Constructor."
  (^Nd4jCpuPresets []
    (new Nd4jCpuPresets )))

(defn init
  "logger - `org.bytedeco.javacpp.tools.Logger`
  properties - `java.util.Properties`
  encoding - `java.lang.String`"
  ([^Nd4jCpuPresets this ^org.bytedeco.javacpp.tools.Logger logger ^java.util.Properties properties ^java.lang.String encoding]
    (-> this (.init logger properties encoding))))

(defn map
  "info-map - `org.bytedeco.javacpp.tools.InfoMap`"
  ([^Nd4jCpuPresets this ^org.bytedeco.javacpp.tools.InfoMap info-map]
    (-> this (.map info-map))))

