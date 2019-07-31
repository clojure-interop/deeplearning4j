(ns org.deeplearning4j.clustering.sptree.Cell
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.sptree Cell]))

(defn ->cell
  "Constructor.

  dimension - `int`"
  (^Cell [^Integer dimension]
    (new Cell dimension)))

(defn corner
  "d - `int`

  returns: `double`"
  (^Double [^Cell this ^Integer d]
    (-> this (.corner d)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Cell this]
    (-> this (.corner))))

(defn width
  "d - `int`

  returns: `double`"
  (^Double [^Cell this ^Integer d]
    (-> this (.width d)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Cell this]
    (-> this (.width))))

(defn set-corner
  "d - `int`
  corner - `double`"
  ([^Cell this ^Integer d ^Double corner]
    (-> this (.setCorner d corner)))
  ([^Cell this ^org.nd4j.linalg.api.ndarray.INDArray corner]
    (-> this (.setCorner corner))))

(defn set-width
  "d - `int`
  width - `double`"
  ([^Cell this ^Integer d ^Double width]
    (-> this (.setWidth d width)))
  ([^Cell this ^org.nd4j.linalg.api.ndarray.INDArray width]
    (-> this (.setWidth width))))

(defn contains
  "point - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `boolean`"
  (^Boolean [^Cell this ^org.nd4j.linalg.api.ndarray.INDArray point]
    (-> this (.contains point))))

