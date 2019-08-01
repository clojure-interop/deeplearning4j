(ns org.nd4j.nativeblas.Nd4jCudaPresets
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCudaPresets]))

(defn ->nd-4j-cuda-presets
  "Constructor."
  (^Nd4jCudaPresets []
    (new Nd4jCudaPresets )))

(defn map
  "info-map - `org.bytedeco.javacpp.tools.InfoMap`"
  ([^Nd4jCudaPresets this ^org.bytedeco.javacpp.tools.InfoMap info-map]
    (-> this (.map info-map))))

