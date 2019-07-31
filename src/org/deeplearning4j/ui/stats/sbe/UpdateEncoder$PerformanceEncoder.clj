(ns org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateEncoder$PerformanceEncoder]))

(defn ->performance-encoder
  "Constructor."
  (^UpdateEncoder$PerformanceEncoder []
    (new UpdateEncoder$PerformanceEncoder )))

(defn *minibatches-per-second-min-value
  "returns: `float`"
  (^Float []
    (UpdateEncoder$PerformanceEncoder/minibatchesPerSecondMinValue )))

(defn *total-runtime-ms-min-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerformanceEncoder/totalRuntimeMsMinValue )))

(defn *total-examples-null-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerformanceEncoder/totalExamplesNullValue )))

(defn *total-minibatches-max-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerformanceEncoder/totalMinibatchesMaxValue )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$PerformanceEncoder/sbeBlockLength )))

(defn *total-runtime-ms-null-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerformanceEncoder/totalRuntimeMsNullValue )))

(defn *total-minibatches-min-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerformanceEncoder/totalMinibatchesMinValue )))

(defn *total-runtime-ms-max-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerformanceEncoder/totalRuntimeMsMaxValue )))

(defn *total-examples-min-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerformanceEncoder/totalExamplesMinValue )))

(defn *minibatches-per-second-null-value
  "returns: `float`"
  (^Float []
    (UpdateEncoder$PerformanceEncoder/minibatchesPerSecondNullValue )))

(defn *examples-per-second-max-value
  "returns: `float`"
  (^Float []
    (UpdateEncoder$PerformanceEncoder/examplesPerSecondMaxValue )))

(defn *total-examples-max-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerformanceEncoder/totalExamplesMaxValue )))

(defn *examples-per-second-min-value
  "returns: `float`"
  (^Float []
    (UpdateEncoder$PerformanceEncoder/examplesPerSecondMinValue )))

(defn *examples-per-second-null-value
  "returns: `float`"
  (^Float []
    (UpdateEncoder$PerformanceEncoder/examplesPerSecondNullValue )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$PerformanceEncoder/sbeHeaderSize )))

(defn *minibatches-per-second-max-value
  "returns: `float`"
  (^Float []
    (UpdateEncoder$PerformanceEncoder/minibatchesPerSecondMaxValue )))

(defn *total-minibatches-null-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerformanceEncoder/totalMinibatchesNullValue )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^UpdateEncoder$PerformanceEncoder this ^org.deeplearning4j.ui.stats.sbe.UpdateEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder [^UpdateEncoder$PerformanceEncoder this]
    (-> this (.next))))

(defn total-runtime-ms
  "value - `long`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder [^UpdateEncoder$PerformanceEncoder this ^Long value]
    (-> this (.totalRuntimeMs value))))

(defn total-examples
  "value - `long`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder [^UpdateEncoder$PerformanceEncoder this ^Long value]
    (-> this (.totalExamples value))))

(defn total-minibatches
  "value - `long`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder [^UpdateEncoder$PerformanceEncoder this ^Long value]
    (-> this (.totalMinibatches value))))

(defn examples-per-second
  "value - `float`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder [^UpdateEncoder$PerformanceEncoder this ^Float value]
    (-> this (.examplesPerSecond value))))

(defn minibatches-per-second
  "value - `float`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerformanceEncoder [^UpdateEncoder$PerformanceEncoder this ^Float value]
    (-> this (.minibatchesPerSecond value))))

