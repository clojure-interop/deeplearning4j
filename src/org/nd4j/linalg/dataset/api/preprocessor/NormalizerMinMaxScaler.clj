(ns org.nd4j.linalg.dataset.api.preprocessor.NormalizerMinMaxScaler
  "Pre processor for DataSets that normalizes feature values (and optionally label values) to lie between a minimum
 and maximum value (by default between 0 and 1)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor NormalizerMinMaxScaler]))

(defn ->normalizer-min-max-scaler
  "Constructor.

  Preprocessor can take a range as minRange and maxRange

  min-range - `double`
  max-range - `double`"
  (^NormalizerMinMaxScaler [^Double min-range ^Double max-range]
    (new NormalizerMinMaxScaler min-range max-range))
  (^NormalizerMinMaxScaler []
    (new NormalizerMinMaxScaler )))

(defn save
  "Deprecated. use instead

  files - the statistics to save - `java.io.File`

  throws: java.io.IOException"
  ([^NormalizerMinMaxScaler this ^java.io.File files]
    (-> this (.save files))))

(defn get-type
  "Description copied from interface: Normalizer

  returns: the opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^NormalizerMinMaxScaler this]
    (-> this (.getType))))

(defn get-min
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NormalizerMinMaxScaler this]
    (-> this (.getMin))))

(defn load
  "Load the given min and max

  statistics - the statistics to load - `java.io.File`

  throws: java.io.IOException"
  ([^NormalizerMinMaxScaler this ^java.io.File statistics]
    (-> this (.load statistics))))

(defn get-max
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NormalizerMinMaxScaler this]
    (-> this (.getMax))))

(defn get-target-min
  "returns: `double`"
  (^Double [^NormalizerMinMaxScaler this]
    (-> this (.getTargetMin))))

(defn set-feature-stats
  "feature-min - `org.nd4j.linalg.api.ndarray.INDArray`
  feature-max - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^NormalizerMinMaxScaler this ^org.nd4j.linalg.api.ndarray.INDArray feature-min ^org.nd4j.linalg.api.ndarray.INDArray feature-max]
    (-> this (.setFeatureStats feature-min feature-max))))

(defn get-label-max
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NormalizerMinMaxScaler this]
    (-> this (.getLabelMax))))

(defn set-label-stats
  "label-min - `org.nd4j.linalg.api.ndarray.INDArray`
  label-max - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^NormalizerMinMaxScaler this ^org.nd4j.linalg.api.ndarray.INDArray label-min ^org.nd4j.linalg.api.ndarray.INDArray label-max]
    (-> this (.setLabelStats label-min label-max))))

(defn get-target-max
  "returns: `double`"
  (^Double [^NormalizerMinMaxScaler this]
    (-> this (.getTargetMax))))

(defn get-label-min
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NormalizerMinMaxScaler this]
    (-> this (.getLabelMin))))

