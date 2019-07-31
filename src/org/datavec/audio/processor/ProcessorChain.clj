(ns org.datavec.audio.processor.ProcessorChain
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.processor ProcessorChain]))

(defn ->processor-chain
  "Constructor.

  intensities - `double[][]`"
  (^ProcessorChain [intensities]
    (new ProcessorChain intensities)))

(defn get-intensities
  "returns: `double[][]`"
  ([^ProcessorChain this]
    (-> this (.getIntensities))))

