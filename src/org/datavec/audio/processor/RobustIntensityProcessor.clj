(ns org.datavec.audio.processor.RobustIntensityProcessor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.processor RobustIntensityProcessor]))

(defn ->robust-intensity-processor
  "Constructor.

  intensities - `double[][]`
  num-points-per-frame - `int`"
  (^RobustIntensityProcessor [intensities ^Integer num-points-per-frame]
    (new RobustIntensityProcessor intensities num-points-per-frame)))

(defn execute
  ""
  ([^RobustIntensityProcessor this]
    (-> this (.execute))))

(defn get-intensities
  "returns: `double[][]`"
  ([^RobustIntensityProcessor this]
    (-> this (.getIntensities))))

