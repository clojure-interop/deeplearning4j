(ns org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateFieldsPresentDecoder]))

(defn ->update-fields-present-decoder
  "Constructor."
  (^UpdateFieldsPresentDecoder []
    (new UpdateFieldsPresentDecoder )))

(def *-encoded-length
  "Static Constant.

  type: int"
  UpdateFieldsPresentDecoder/ENCODED_LENGTH)

(defn mean-magnitude-activations
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.meanMagnitudeActivations))))

(defn encoded-length
  "returns: `int`"
  (^Integer [^UpdateFieldsPresentDecoder this]
    (-> this (.encodedLength))))

(defn mean-gradients
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.meanGradients))))

(defn score
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.score))))

(defn garbage-collection
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.garbageCollection))))

(defn data-set-meta-data-present
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.dataSetMetaDataPresent))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^UpdateFieldsPresentDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn mean-magnitude-parameters
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.meanMagnitudeParameters))))

(defn mean-parameters
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.meanParameters))))

(defn histogram-activations
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.histogramActivations))))

(defn stdev-activations
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.stdevActivations))))

(defn mean-magnitude-updates
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.meanMagnitudeUpdates))))

(defn histogram-updates
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.histogramUpdates))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateFieldsPresentDecoder this]
    (-> this (.toString))))

(defn wrap
  "buffer - `org.agrona.DirectBuffer`
  offset - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateFieldsPresentDecoder [^UpdateFieldsPresentDecoder this ^org.agrona.DirectBuffer buffer ^Integer offset]
    (-> this (.wrap buffer offset))))

(defn stdev-updates
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.stdevUpdates))))

(defn mean-updates
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.meanUpdates))))

(defn stdev-parameters
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.stdevParameters))))

(defn mean-activations
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.meanActivations))))

(defn learning-rates-present
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.learningRatesPresent))))

(defn memory-use
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.memoryUse))))

(defn stdev-gradients
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.stdevGradients))))

(defn performance
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.performance))))

(defn mean-magnitude-gradients
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.meanMagnitudeGradients))))

(defn histogram-parameters
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.histogramParameters))))

(defn histogram-gradients
  "returns: `boolean`"
  (^Boolean [^UpdateFieldsPresentDecoder this]
    (-> this (.histogramGradients))))

