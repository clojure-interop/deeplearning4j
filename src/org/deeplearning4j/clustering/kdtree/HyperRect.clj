(ns org.deeplearning4j.clustering.kdtree.HyperRect
  "Created by agibsonccc on 12/29/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.kdtree HyperRect]))

(defn ->hyper-rect
  "Constructor.

  points - `java.util.List`"
  (^HyperRect [^java.util.List points]
    (new HyperRect points)))

(defn *point
  "vector - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.util.List<org.deeplearning4j.clustering.kdtree.HyperRect$Interval>`"
  (^java.util.List [^org.nd4j.linalg.api.ndarray.INDArray vector]
    (HyperRect/point vector)))

(defn enlarge-to
  "point - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^HyperRect this ^org.nd4j.linalg.api.ndarray.INDArray point]
    (-> this (.enlargeTo point))))

(defn contains
  "h-point - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.util.List<java.lang.Boolean>`"
  (^java.util.List [^HyperRect this ^org.nd4j.linalg.api.ndarray.INDArray h-point]
    (-> this (.contains h-point))))

(defn min-distance
  "h-point - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^HyperRect this ^org.nd4j.linalg.api.ndarray.INDArray h-point]
    (-> this (.minDistance h-point))))

(defn get-upper
  "h-point - `org.nd4j.linalg.api.ndarray.INDArray`
  desc - `int`

  returns: `org.deeplearning4j.clustering.kdtree.HyperRect`"
  (^org.deeplearning4j.clustering.kdtree.HyperRect [^HyperRect this ^org.nd4j.linalg.api.ndarray.INDArray h-point ^Integer desc]
    (-> this (.getUpper h-point desc))))

(defn get-lower
  "h-point - `org.nd4j.linalg.api.ndarray.INDArray`
  desc - `int`

  returns: `org.deeplearning4j.clustering.kdtree.HyperRect`"
  (^org.deeplearning4j.clustering.kdtree.HyperRect [^HyperRect this ^org.nd4j.linalg.api.ndarray.INDArray h-point ^Integer desc]
    (-> this (.getLower h-point desc))))

