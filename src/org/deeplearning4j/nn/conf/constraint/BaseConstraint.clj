(ns org.deeplearning4j.nn.conf.constraint.BaseConstraint
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.constraint BaseConstraint]))

(def *-default-epsilon
  "Static Constant.

  type: double"
  BaseConstraint/DEFAULT_EPSILON)

(defn *get-broadcast-dims
  "reduce-dimensions - `int[]`
  rank - `int`

  returns: `int[]`"
  ([reduce-dimensions ^Integer rank]
    (BaseConstraint/getBroadcastDims reduce-dimensions rank)))

(defn apply-constraint
  "Description copied from interface: LayerConstraint

  layer - org.deeplearning4j.nn.api.Layer - `org.deeplearning4j.nn.api.Layer`
  iteration - given iteration as integer - `int`
  epoch - current epoch as integer - `int`"
  ([^BaseConstraint this ^org.deeplearning4j.nn.api.Layer layer ^Integer iteration ^Integer epoch]
    (-> this (.applyConstraint layer iteration epoch))))

(defn apply
  "param - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseConstraint this ^org.nd4j.linalg.api.ndarray.INDArray param]
    (-> this (.apply param))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.constraint.BaseConstraint`"
  (^org.deeplearning4j.nn.conf.constraint.BaseConstraint [^BaseConstraint this]
    (-> this (.clone))))

