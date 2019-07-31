(ns org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerformanceDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateDecoder$PerformanceDecoder]))

(defn ->performance-decoder
  "Constructor."
  (^UpdateDecoder$PerformanceDecoder []
    (new UpdateDecoder$PerformanceDecoder )))

(defn *minibatches-per-second-min-value
  "returns: `float`"
  (^Float []
    (UpdateDecoder$PerformanceDecoder/minibatchesPerSecondMinValue )))

(defn *total-runtime-ms-min-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerformanceDecoder/totalRuntimeMsMinValue )))

(defn *total-examples-null-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerformanceDecoder/totalExamplesNullValue )))

(defn *total-minibatches-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$PerformanceDecoder/totalMinibatchesMetaAttribute meta-attribute)))

(defn *total-runtime-ms-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$PerformanceDecoder/totalRuntimeMsMetaAttribute meta-attribute)))

(defn *total-minibatches-max-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerformanceDecoder/totalMinibatchesMaxValue )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerformanceDecoder/sbeBlockLength )))

(defn *total-runtime-ms-null-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerformanceDecoder/totalRuntimeMsNullValue )))

(defn *total-examples-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerformanceDecoder/totalExamplesId )))

(defn *examples-per-second-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerformanceDecoder/examplesPerSecondId )))

(defn *total-minibatches-min-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerformanceDecoder/totalMinibatchesMinValue )))

(defn *total-runtime-ms-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerformanceDecoder/totalRuntimeMsId )))

(defn *total-minibatches-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerformanceDecoder/totalMinibatchesId )))

(defn *total-runtime-ms-max-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerformanceDecoder/totalRuntimeMsMaxValue )))

(defn *total-examples-min-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerformanceDecoder/totalExamplesMinValue )))

(defn *minibatches-per-second-null-value
  "returns: `float`"
  (^Float []
    (UpdateDecoder$PerformanceDecoder/minibatchesPerSecondNullValue )))

(defn *minibatches-per-second-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$PerformanceDecoder/minibatchesPerSecondMetaAttribute meta-attribute)))

(defn *examples-per-second-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$PerformanceDecoder/examplesPerSecondMetaAttribute meta-attribute)))

(defn *total-examples-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$PerformanceDecoder/totalExamplesMetaAttribute meta-attribute)))

(defn *examples-per-second-max-value
  "returns: `float`"
  (^Float []
    (UpdateDecoder$PerformanceDecoder/examplesPerSecondMaxValue )))

(defn *total-examples-max-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerformanceDecoder/totalExamplesMaxValue )))

(defn *examples-per-second-min-value
  "returns: `float`"
  (^Float []
    (UpdateDecoder$PerformanceDecoder/examplesPerSecondMinValue )))

(defn *examples-per-second-null-value
  "returns: `float`"
  (^Float []
    (UpdateDecoder$PerformanceDecoder/examplesPerSecondNullValue )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerformanceDecoder/sbeHeaderSize )))

(defn *minibatches-per-second-max-value
  "returns: `float`"
  (^Float []
    (UpdateDecoder$PerformanceDecoder/minibatchesPerSecondMaxValue )))

(defn *minibatches-per-second-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerformanceDecoder/minibatchesPerSecondId )))

(defn *total-minibatches-null-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerformanceDecoder/totalMinibatchesNullValue )))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerformanceDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerformanceDecoder [^UpdateDecoder$PerformanceDecoder this]
    (-> this (.next))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^UpdateDecoder$PerformanceDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn total-examples
  "returns: `long`"
  (^Long [^UpdateDecoder$PerformanceDecoder this]
    (-> this (.totalExamples))))

(defn total-minibatches
  "returns: `long`"
  (^Long [^UpdateDecoder$PerformanceDecoder this]
    (-> this (.totalMinibatches))))

(defn total-runtime-ms
  "returns: `long`"
  (^Long [^UpdateDecoder$PerformanceDecoder this]
    (-> this (.totalRuntimeMs))))

(defn examples-per-second
  "returns: `float`"
  (^Float [^UpdateDecoder$PerformanceDecoder this]
    (-> this (.examplesPerSecond))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder$PerformanceDecoder this]
    (-> this (.toString))))

(defn count
  "returns: `int`"
  (^Integer [^UpdateDecoder$PerformanceDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerformanceDecoder>`"
  (^java.util.Iterator [^UpdateDecoder$PerformanceDecoder this]
    (-> this (.iterator))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^UpdateDecoder$PerformanceDecoder this ^org.deeplearning4j.ui.stats.sbe.UpdateDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn remove
  ""
  ([^UpdateDecoder$PerformanceDecoder this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^UpdateDecoder$PerformanceDecoder this]
    (-> this (.hasNext))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^UpdateDecoder$PerformanceDecoder this]
    (-> this (.actingBlockLength))))

(defn minibatches-per-second
  "returns: `float`"
  (^Float [^UpdateDecoder$PerformanceDecoder this]
    (-> this (.minibatchesPerSecond))))

