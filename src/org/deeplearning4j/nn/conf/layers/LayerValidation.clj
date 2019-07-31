(ns org.deeplearning4j.nn.conf.layers.LayerValidation
  "Created by Alex on 22/02/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers LayerValidation]))

(defn ->layer-validation
  "Constructor."
  (^LayerValidation []
    (new LayerValidation )))

(defn *assert-n-in-n-out-set
  "Asserts that the layer nIn and nOut values are set for the layer

  layer-type - Type of layer (\"DenseLayer\", etc) - `java.lang.String`
  layer-name - Name of the layer (may be null if not set) - `java.lang.String`
  layer-index - Index of the layer - `long`
  n-in - nIn value - `long`
  n-out - nOut value - `long`"
  ([^java.lang.String layer-type ^java.lang.String layer-name ^Long layer-index ^Long n-in ^Long n-out]
    (LayerValidation/assertNInNOutSet layer-type layer-name layer-index n-in n-out)))

(defn *assert-n-out-set
  "Asserts that the layer nOut value is set for the layer

  layer-type - Type of layer (\"DenseLayer\", etc) - `java.lang.String`
  layer-name - Name of the layer (may be null if not set) - `java.lang.String`
  layer-index - Index of the layer - `long`
  n-out - nOut value - `long`"
  ([^java.lang.String layer-type ^java.lang.String layer-name ^Long layer-index ^Long n-out]
    (LayerValidation/assertNOutSet layer-type layer-name layer-index n-out)))

(defn *general-validation
  "layer-name - `java.lang.String`
  layer - `org.deeplearning4j.nn.conf.layers.Layer`
  i-drop-out - `org.deeplearning4j.nn.conf.dropout.IDropout`
  l-2 - `java.lang.Double`
  l-2-bias - `java.lang.Double`
  l-1 - `java.lang.Double`
  l-1-bias - `java.lang.Double`
  dist - `org.deeplearning4j.nn.conf.distribution.Distribution`
  all-param-constraints - `java.util.List`
  weight-constraints - `java.util.List`
  bias-constraints - `java.util.List`"
  ([^java.lang.String layer-name ^org.deeplearning4j.nn.conf.layers.Layer layer ^org.deeplearning4j.nn.conf.dropout.IDropout i-drop-out ^java.lang.Double l-2 ^java.lang.Double l-2-bias ^java.lang.Double l-1 ^java.lang.Double l-1-bias ^org.deeplearning4j.nn.conf.distribution.Distribution dist ^java.util.List all-param-constraints ^java.util.List weight-constraints ^java.util.List bias-constraints]
    (LayerValidation/generalValidation layer-name layer i-drop-out l-2 l-2-bias l-1 l-1-bias dist all-param-constraints weight-constraints bias-constraints)))

