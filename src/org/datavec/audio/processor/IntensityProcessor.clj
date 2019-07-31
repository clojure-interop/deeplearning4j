(ns org.datavec.audio.processor.IntensityProcessor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.processor IntensityProcessor]))

(defn execute
  ""
  ([^IntensityProcessor this]
    (-> this (.execute))))

(defn get-intensities
  "returns: `double[][]`"
  ([^IntensityProcessor this]
    (-> this (.getIntensities))))

