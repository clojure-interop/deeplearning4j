(ns org.deeplearning4j.clustering.randomprojection.RPHyperPlanes
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.randomprojection RPHyperPlanes]))

(defn ->rp-hyper-planes
  "Constructor.

  dim - `int`"
  (^RPHyperPlanes [^Integer dim]
    (new RPHyperPlanes dim)))

(defn get-hyper-plane-at
  "depth - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RPHyperPlanes this ^Integer depth]
    (-> this (.getHyperPlaneAt depth))))

(defn add-random-hyper-plane
  "Add a new random element to the hyper plane."
  ([^RPHyperPlanes this]
    (-> this (.addRandomHyperPlane))))

