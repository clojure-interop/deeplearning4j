(ns org.datavec.audio.properties.FingerprintProperties
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.properties FingerprintProperties]))

(defn ->fingerprint-properties
  "Constructor."
  (^FingerprintProperties []
    (new FingerprintProperties )))

(defn *get-instance
  "returns: `org.datavec.audio.properties.FingerprintProperties`"
  (^org.datavec.audio.properties.FingerprintProperties []
    (FingerprintProperties/getInstance )))

(defn get-num-frequency-units
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getNumFrequencyUnits))))

(defn get-sample-rate
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getSampleRate))))

(defn get-upper-bounded-frequency
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getUpperBoundedFrequency))))

(defn get-lower-bounded-frequency
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getLowerBoundedFrequency))))

(defn get-fps
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getFps))))

(defn get-max-possible-pair-hashcode
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getMaxPossiblePairHashcode))))

(defn get-anchor-points-interval-length
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getAnchorPointsIntervalLength))))

(defn get-num-anchor-points-per-interval
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getNumAnchorPointsPerInterval))))

(defn get-num-filter-banks
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getNumFilterBanks))))

(defn get-num-robust-points-per-frame
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getNumRobustPointsPerFrame))))

(defn get-sample-size-per-frame
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getSampleSizePerFrame))))

(defn get-overlap-factor
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getOverlapFactor))))

(defn get-ref-max-active-pairs
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getRefMaxActivePairs))))

(defn get-max-target-zone-distance
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getMaxTargetZoneDistance))))

(defn get-num-frames-in-one-second
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getNumFramesInOneSecond))))

(defn get-sample-max-active-pairs
  "returns: `int`"
  (^Integer [^FingerprintProperties this]
    (-> this (.getSampleMaxActivePairs))))

