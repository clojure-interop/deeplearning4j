(ns org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateFieldsPresentEncoder]))

(defn ->update-fields-present-encoder
  "Constructor."
  (^UpdateFieldsPresentEncoder []
    (new UpdateFieldsPresentEncoder )))

(def *-encoded-length
  "Static Constant.

  type: int"
  UpdateFieldsPresentEncoder/ENCODED_LENGTH)

(defn mean-magnitude-activations
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.meanMagnitudeActivations value))))

(defn encoded-length
  "returns: `int`"
  (^Integer [^UpdateFieldsPresentEncoder this]
    (-> this (.encodedLength))))

(defn mean-gradients
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.meanGradients value))))

(defn score
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.score value))))

(defn garbage-collection
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.garbageCollection value))))

(defn data-set-meta-data-present
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.dataSetMetaDataPresent value))))

(defn mean-magnitude-parameters
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.meanMagnitudeParameters value))))

(defn mean-parameters
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.meanParameters value))))

(defn histogram-activations
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.histogramActivations value))))

(defn stdev-activations
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.stdevActivations value))))

(defn mean-magnitude-updates
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.meanMagnitudeUpdates value))))

(defn histogram-updates
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.histogramUpdates value))))

(defn wrap
  "buffer - `org.agrona.MutableDirectBuffer`
  offset - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^org.agrona.MutableDirectBuffer buffer ^Integer offset]
    (-> this (.wrap buffer offset))))

(defn stdev-updates
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.stdevUpdates value))))

(defn mean-updates
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.meanUpdates value))))

(defn stdev-parameters
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.stdevParameters value))))

(defn mean-activations
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.meanActivations value))))

(defn learning-rates-present
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.learningRatesPresent value))))

(defn memory-use
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.memoryUse value))))

(defn stdev-gradients
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.stdevGradients value))))

(defn clear
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this]
    (-> this (.clear))))

(defn performance
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.performance value))))

(defn mean-magnitude-gradients
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.meanMagnitudeGradients value))))

(defn histogram-parameters
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.histogramParameters value))))

(defn histogram-gradients
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentEncoder [^UpdateFieldsPresentEncoder this ^Boolean value]
    (-> this (.histogramGradients value))))

