(ns org.deeplearning4j.nn.api.layers.LayerConstraint
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.api.layers LayerConstraint]))

(defn apply-constraint
  "Apply a given constraint to a layer at each iteration
  in the provided epoch, after parameters have been updated.

  layer - org.deeplearning4j.nn.api.Layer - `org.deeplearning4j.nn.api.Layer`
  iteration - given iteration as integer - `int`
  epoch - current epoch as integer - `int`"
  ([^LayerConstraint this ^org.deeplearning4j.nn.api.Layer layer ^Integer iteration ^Integer epoch]
    (-> this (.applyConstraint layer iteration epoch))))

(defn set-params
  "Set the parameters that this layer constraint should be applied to

  params - Parameters that the layer constraint should be applied to - `java.util.Set`"
  ([^LayerConstraint this ^java.util.Set params]
    (-> this (.setParams params))))

(defn get-params
  "returns: Set of parameters that this layer constraint will be applied to - `java.util.Set<java.lang.String>`"
  (^java.util.Set [^LayerConstraint this]
    (-> this (.getParams))))

(defn clone
  "returns: `org.deeplearning4j.nn.api.layers.LayerConstraint`"
  (^org.deeplearning4j.nn.api.layers.LayerConstraint [^LayerConstraint this]
    (-> this (.clone))))

