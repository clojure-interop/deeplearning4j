(ns org.deeplearning4j.zoo.model.helper.DarknetHelper
  "Contains functionality shared by Darknet19, TinyYOLO, and YOLO2."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model.helper DarknetHelper]))

(defn ->darknet-helper
  "Constructor."
  (^DarknetHelper []
    (new DarknetHelper )))

(defn *get-grid-width
  "Returns inputShape[1] / 32, where inputShape[1] should be a multiple of 32.

  input-shape - `int[]`

  returns: `int`"
  (^Integer [input-shape]
    (DarknetHelper/getGridWidth input-shape)))

(defn *get-grid-height
  "Returns inputShape[2] / 32, where inputShape[2] should be a multiple of 32.

  input-shape - `int[]`

  returns: `int`"
  (^Integer [input-shape]
    (DarknetHelper/getGridHeight input-shape)))

(defn *add-layers
  "graph-builder - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`
  layer-number - `int`
  input - `java.lang.String`
  filter-size - `int`
  n-in - `int`
  n-out - `int`
  pool-size - `int`
  pool-stride - `int`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph-builder ^Integer layer-number ^java.lang.String input ^Integer filter-size ^Integer n-in ^Integer n-out ^Integer pool-size ^Integer pool-stride]
    (DarknetHelper/addLayers graph-builder layer-number input filter-size n-in n-out pool-size pool-stride))
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph-builder ^Integer layer-number ^Integer filter-size ^Integer n-in ^Integer n-out ^Integer pool-size ^Integer pool-stride]
    (DarknetHelper/addLayers graph-builder layer-number filter-size n-in n-out pool-size pool-stride))
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph-builder ^Integer layer-number ^Integer filter-size ^Integer n-in ^Integer n-out ^Integer pool-size]
    (DarknetHelper/addLayers graph-builder layer-number filter-size n-in n-out pool-size)))

