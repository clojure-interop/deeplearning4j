(ns org.deeplearning4j.clustering.quadtree.Cell
  "A cell representing a bounding box forthe quad tree"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.quadtree Cell]))

(defn ->cell
  "Constructor.

  x - `double`
  y - `double`
  hw - `double`
  hh - `double`"
  (^Cell [^Double x ^Double y ^Double hw ^Double hh]
    (new Cell x y hw hh)))

(defn set-hw
  "hw - `double`"
  ([^Cell this ^Double hw]
    (-> this (.setHw hw))))

(defn get-hh
  "returns: `double`"
  (^Double [^Cell this]
    (-> this (.getHh))))

(defn contains-point
  "Whether the given point is contained
  within this cell

  point - the point to check - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: true if the point is contained, false otherwise - `boolean`"
  (^Boolean [^Cell this ^org.nd4j.linalg.api.ndarray.INDArray point]
    (-> this (.containsPoint point))))

(defn get-hw
  "returns: `double`"
  (^Double [^Cell this]
    (-> this (.getHw))))

(defn get-y
  "returns: `double`"
  (^Double [^Cell this]
    (-> this (.getY))))

(defn get-x
  "returns: `double`"
  (^Double [^Cell this]
    (-> this (.getX))))

(defn set-y
  "y - `double`"
  ([^Cell this ^Double y]
    (-> this (.setY y))))

(defn set-x
  "x - `double`"
  ([^Cell this ^Double x]
    (-> this (.setX x))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Cell this]
    (-> this (.hashCode))))

(defn set-hh
  "hh - `double`"
  ([^Cell this ^Double hh]
    (-> this (.setHh hh))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Cell this ^java.lang.Object o]
    (-> this (.equals o))))

