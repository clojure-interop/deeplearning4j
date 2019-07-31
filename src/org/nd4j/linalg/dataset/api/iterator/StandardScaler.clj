(ns org.nd4j.linalg.dataset.api.iterator.StandardScaler
  "Deprecated.
 Use NormalizerStandardize for equivalent functionality.
 NormalizerStandardize is more stable (for examples, when a column contains all the same values for every example) but
 otherwise provides equivalent functionality. See also NormalizerMinMaxScaler"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator StandardScaler]))

(defn ->standard-scaler
  "Constructor.

  Deprecated."
  (^StandardScaler []
    (new StandardScaler )))

(defn fit
  "Deprecated.

  data-set - `org.nd4j.linalg.dataset.DataSet`"
  ([^StandardScaler this ^org.nd4j.linalg.dataset.DataSet data-set]
    (-> this (.fit data-set))))

(defn load
  "Deprecated.

  mean - the mean file - `java.io.File`
  std - the std file - `java.io.File`

  throws: java.io.IOException"
  ([^StandardScaler this ^java.io.File mean ^java.io.File std]
    (-> this (.load mean std))))

(defn save
  "Deprecated.

  mean - the mean - `java.io.File`
  std - the std - `java.io.File`

  throws: java.io.IOException"
  ([^StandardScaler this ^java.io.File mean ^java.io.File std]
    (-> this (.save mean std))))

(defn transform
  "Deprecated.

  data-set - the dataset to transform - `org.nd4j.linalg.dataset.DataSet`"
  ([^StandardScaler this ^org.nd4j.linalg.dataset.DataSet data-set]
    (-> this (.transform data-set))))

(defn get-mean
  "Deprecated.

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^StandardScaler this]
    (-> this (.getMean))))

(defn get-std
  "Deprecated.

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^StandardScaler this]
    (-> this (.getStd))))

