(ns org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerMinMaxScaler
  "Pre processor for MultiDataSet that normalizes feature values (and optionally label values) to lie between a minimum
 and maximum value (by default between 0 and 1)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor MultiNormalizerMinMaxScaler]))

(defn ->multi-normalizer-min-max-scaler
  "Constructor.

  Preprocessor can take a range as minRange and maxRange

  min-range - the target range lower bound - `double`
  max-range - the target range upper bound - `double`"
  (^MultiNormalizerMinMaxScaler [^Double min-range ^Double max-range]
    (new MultiNormalizerMinMaxScaler min-range max-range))
  (^MultiNormalizerMinMaxScaler []
    (new MultiNormalizerMinMaxScaler )))

(defn get-target-min
  "returns: `double`"
  (^Double [^MultiNormalizerMinMaxScaler this]
    (-> this (.getTargetMin))))

(defn get-target-max
  "returns: `double`"
  (^Double [^MultiNormalizerMinMaxScaler this]
    (-> this (.getTargetMax))))

(defn get-min
  "input - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiNormalizerMinMaxScaler this ^Integer input]
    (-> this (.getMin input))))

(defn get-max
  "input - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiNormalizerMinMaxScaler this ^Integer input]
    (-> this (.getMax input))))

(defn get-label-min
  "output - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiNormalizerMinMaxScaler this ^Integer output]
    (-> this (.getLabelMin output))))

(defn get-label-max
  "output - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiNormalizerMinMaxScaler this ^Integer output]
    (-> this (.getLabelMax output))))

(defn get-type
  "Description copied from interface: Normalizer

  returns: the opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^MultiNormalizerMinMaxScaler this]
    (-> this (.getType))))

