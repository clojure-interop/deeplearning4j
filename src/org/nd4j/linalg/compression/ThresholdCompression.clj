(ns org.nd4j.linalg.compression.ThresholdCompression
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.compression ThresholdCompression]))

(defn ->threshold-compression
  "Constructor."
  (^ThresholdCompression []
    (new ThresholdCompression )))

(def *-flexible-encoding
  "Static Constant.

  type: int"
  ThresholdCompression/FLEXIBLE_ENCODING)

(def *-bitmap-encoding
  "Static Constant.

  type: int"
  ThresholdCompression/BITMAP_ENCODING)

