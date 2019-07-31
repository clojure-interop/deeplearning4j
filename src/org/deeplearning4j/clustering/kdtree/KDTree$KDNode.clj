(ns org.deeplearning4j.clustering.kdtree.KDTree$KDNode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.kdtree KDTree$KDNode]))

(defn ->kd-node
  "Constructor.

  point - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^KDTree$KDNode [^org.nd4j.linalg.api.ndarray.INDArray point]
    (new KDTree$KDNode point)))

(defn get-point
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^KDTree$KDNode this]
    (-> this (.getPoint))))

(defn get-left
  "returns: `org.deeplearning4j.clustering.kdtree.KDTree$KDNode`"
  (^org.deeplearning4j.clustering.kdtree.KDTree$KDNode [^KDTree$KDNode this]
    (-> this (.getLeft))))

(defn set-left
  "left - `org.deeplearning4j.clustering.kdtree.KDTree$KDNode`"
  ([^KDTree$KDNode this ^org.deeplearning4j.clustering.kdtree.KDTree$KDNode left]
    (-> this (.setLeft left))))

(defn get-right
  "returns: `org.deeplearning4j.clustering.kdtree.KDTree$KDNode`"
  (^org.deeplearning4j.clustering.kdtree.KDTree$KDNode [^KDTree$KDNode this]
    (-> this (.getRight))))

(defn set-right
  "right - `org.deeplearning4j.clustering.kdtree.KDTree$KDNode`"
  ([^KDTree$KDNode this ^org.deeplearning4j.clustering.kdtree.KDTree$KDNode right]
    (-> this (.setRight right))))

(defn get-parent
  "returns: `org.deeplearning4j.clustering.kdtree.KDTree$KDNode`"
  (^org.deeplearning4j.clustering.kdtree.KDTree$KDNode [^KDTree$KDNode this]
    (-> this (.getParent))))

(defn set-parent
  "parent - `org.deeplearning4j.clustering.kdtree.KDTree$KDNode`"
  ([^KDTree$KDNode this ^org.deeplearning4j.clustering.kdtree.KDTree$KDNode parent]
    (-> this (.setParent parent))))

