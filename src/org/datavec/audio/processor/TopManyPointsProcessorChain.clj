(ns org.datavec.audio.processor.TopManyPointsProcessorChain
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.processor TopManyPointsProcessorChain]))

(defn ->top-many-points-processor-chain
  "Constructor.

  intensities - `double[][]`
  num-points - `int`"
  (^TopManyPointsProcessorChain [intensities ^Integer num-points]
    (new TopManyPointsProcessorChain intensities num-points)))

(defn get-intensities
  "returns: `double[][]`"
  ([^TopManyPointsProcessorChain this]
    (-> this (.getIntensities))))

